package deber_seleccion;

import java.util.Scanner;

public class Ejecutar_Calcular_sueldo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String empleado=teclado.nextLine();
        System.out.println("Ingrese horas de trabajo");
        int horas=teclado.nextInt();
        System.out.println("Ingrese el costo por hora");
        double cuota=teclado.nextDouble();
        Calcular_sueldo calcular =new Calcular_sueldo(empleado,horas,cuota);
        calcular.sueldo();
        System.out.println("NOMBRE : "+calcular.obtener_nombre());
        System.out.println("SUELDO : "+calcular.obtener_sueldo());

    }
}
