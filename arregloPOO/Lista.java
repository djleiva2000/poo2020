
package listaenlazada;

import javax.swing.JOptionPane;


class Nodo {
    public int dato;
    public Nodo siguiente;//Puntero
    public Nodo(int d){
        this.dato=d;
        this.siguiente=null;
    }
    public Nodo(int d,Nodo n){
        dato =d;
        siguiente = n;
    }

}


public class Lista {
    protected Nodo inicio,fin;
    public Lista(){
        inicio =null;
        fin=null;
    }
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }

    }
    public void agregarAlInicio(int elemento){
        inicio =new Nodo(elemento, inicio);
        if(fin==null){
            fin = inicio;
        }
    }
    public void agregarAlFinal(int elemento){
        if(!estaVacia()){
            fin.siguiente=new Nodo(elemento);
            fin=fin.siguiente;
        }else{
            inicio=fin =new Nodo(elemento);
        }
    }
    public void mostrarLista(){
        Nodo recorrer=inicio;
        System.out.println();
        while(recorrer!=null){
            System.out.print("["+ recorrer.dato+"]--->");
            recorrer= recorrer.siguiente;
        }
    }
    public int borrarDelInicio(){
        int elemento = inicio.dato;
        if(inicio==fin){
            inicio=null;
            fin = null;
        }else{
            inicio=inicio.siguiente;
        }
        return elemento;
    }
    public int borrarDelFinal(){
        int elemento =fin.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            Nodo temporal=inicio;
            while(temporal.siguiente!=fin){
                temporal=temporal.siguiente;
            }
            fin=temporal;
            fin.siguiente=null;
        }
        return elemento;
    }
    public void eliminar(int elemento){
        if(!estaVacia()){
            if(inicio==fin && elemento==inicio.dato){
                inicio=fin=null;
            }else if(elemento==inicio.dato){
                inicio=inicio.siguiente;
            }else{
                Nodo anterior,temporal;
                anterior = inicio;
                temporal= inicio.siguiente;
                while(temporal!=null && temporal.dato!=elemento){
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                if(temporal!=null){
                    anterior.siguiente=temporal.siguiente;
                    if(temporal==fin){
                        fin=anterior;
                    }
                }
            }
        }

    }

}
class Listaenlazada {

    public static void main(String[] args) {
        // TODO code application logic here
        Lista listac=new Lista();
        int opcion =0,el;
        do{
            try{
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento a la lista\n"
                                +"2. Agregar un elemento al final de la lista\n"
                                +"3. Eliminar un elemento al inicio de la lista\n"
                                +"4. Eliminar un elemento al final de la lista\n"
                                +"5. Mostrar los datos de la lista\n"
                                +"6. Eliminar un elemento en especifico\n"
                                +"7. Salir","Menu de opciones",3));
                switch(opcion){
                    case 1:
                        try {
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento:",
                                    "Insertando al inicio",3));
                            listac.agregarAlInicio(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null,"Error" +n.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento:",
                                    "Insertando al Final",3));
                            listac.agregarAlFinal(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null,"Error" +n.getMessage());
                        }
                        break;
                    case 3:
                        el=listac.borrarDelInicio();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es "+el, "Elimiando nodo del inicio",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        el=listac.borrarDelFinal();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es "+el, "Elimiando nodo del final",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        listac.mostrarLista();
                        break;
                    case 6:
                        el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento a eliminar", "Eliminado nodo especifico",JOptionPane.INFORMATION_MESSAGE));
                        listac.eliminar(el);
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es " +el, "Elimiando nodo especifico",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error" +e.getMessage());
            }
        }while(opcion!=7);
    }

}
