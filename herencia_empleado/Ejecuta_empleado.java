package herencia_empleado;
import java.util.Scanner;

public class Ejecuta_empleado {
    public static void main(String[] args) {
        String nombres,cargo,dependencia;
        double valor_mensual,valor_hora;
        int hora;
        Scanner teclado= new Scanner(System.in );
        System.out.println("selecciones una opcion ");
        System.out.println("1:      sueldo por hora");
        System.out.println("2:      empleado asalariado");
        System.out.println("3:      SALIR");
        int opcion=teclado.nextInt();
        teclado.nextLine();
        switch (opcion){
            case 1:
                System.out.println("ingrese nombre");
                nombres=teclado.nextLine();
                System.out.println("ingrese cargo");
                cargo=teclado.nextLine();
                System.out.println("dependencia");
                dependencia=teclado.nextLine();
                System.out.println("ingrese horas trabajadas");
                hora=teclado.nextInt();
                System.out.println("ingrese el valor por hora");
                valor_hora=teclado.nextDouble();

                Empleado_hora empleado_hora=new Empleado_hora(cargo,nombres,dependencia,valor_hora,hora);
                empleado_hora.sueldo_hora( valor_hora,hora);
                System.out.println("___________________________________________");
                System.out.println("Datos de objetos estudiantes");
                System.out.println("nombre: "+empleado_hora.getHora());
                System.out.println("identificacion: "+empleado_hora.getCargo());
                System.out.println("carrera: ");
                System.out.println("estado civil: ");
                System.out.println("fecha de nacimiento: ");
                System.out.println("___________________________________________");


        }


    }

}
