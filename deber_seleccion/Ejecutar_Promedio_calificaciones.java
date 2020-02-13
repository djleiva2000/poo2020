package deber_seleccion;
import java.util.Scanner;

public class Ejecutar_Promedio_calificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante");
        String nombre=teclado.nextLine();

        System.out.println("Ingrese NOTA 1");
        double cali1=teclado.nextDouble();

        System.out.println("Ingrese NOTA 2");
        double cali2=teclado.nextDouble();

        System.out.println("Ingrese NOTA 3");
        double cali3=teclado.nextDouble();

        System.out.println("Ingrese NOTA 4");
        double cali4=teclado.nextDouble();

        Promedio_calificaciones promedio=new Promedio_calificaciones (nombre,cali1,cali2,cali3,cali4);
        promedio.cal_prom();
        promedio.cal_obser();
        System.out.println("NOMBRE DEL ALUMNO: "+promedio.obtenerNombre());
        System.out.println("PROMEDIO         : "+promedio.obtenerPromedio());
        System.out.println("OBSERVACION      : "+promedio.obtenerObservacio());


    }
}
