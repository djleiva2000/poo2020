package herencia_volumen;

import java.util.Scanner;

public class Ejecutar_figuras_geometricas {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1    AREA CILINDRO");
        System.out.println("2    AREA CONO");
        System.out.println("3    AREA CUBO");
        System.out.println("4    AREA ESFERA");
        int opcion=teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("ingrese altura del  cilindro");
                double altura_cilindro=teclado.nextDouble();
                System.out.println("ingrese radio del cilindro");
                double radio_cilindro=teclado.nextDouble();
                Cilindro cilindro=new Cilindro(altura_cilindro,radio_cilindro);
                cilindro.calcular_volumen_cilindro();
                System.out.println("El volumen es: "+cilindro.presentar_cilindro());
                break;
            case 2:
                System.out.println("ingrese altura del  cono");
                double altura_cono=teclado.nextDouble();
                System.out.println("ingrese radio del cono");
                double radio_cono=teclado.nextDouble();
                Cono cono=new Cono(altura_cono,radio_cono);
                cono.calcular_volumen_cono();
                System.out.println("El volumen es: "+cono.presentar_cono());
                break;
            case 3:
                System.out.println("ingrese la arista del cubo");
                double arista=teclado.nextDouble();
                Cubo cubo=new Cubo(arista);
                cubo.calcular_volumen_cubo();
                System.out.println("el volumen del cubo es:  "+cubo.presentar_cubo());

            break;
            case 4:
                System.out.println("ingrese el radio de la esfera");
                double radio_esfera=teclado.nextDouble();
                Esfera esfera=new Esfera(radio_esfera);
                esfera.calcular_volumen_esfera();
                System.out.println("el volumen de la esfera es:  "+esfera.presentar_esfera());
            break;
        }

    }
}
