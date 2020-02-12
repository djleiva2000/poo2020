package diseniopoo;

import taller1.Estudiante;

import java.util.Scanner;

public class Ejecutar_Promedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre del estudiante");
        String nombre= teclado.nextLine();

        System.out.println("Asignatura");
        String asignatura = teclado.nextLine();

        System.out.println("Nota total del primer bimestre");
        double nota1 = teclado.nextInt();

        System.out.println("Nota total del segundo bimestre");
        double nota2=teclado.nextDouble();

        System.out.println("______________________________________________________________");
        Promedio promedio  = new Promedio(nombre,
                asignatura,
                nota1,
                nota2);
        System.out.println("  ");
        System.out.println(promedio.getpromest());
        System.out.println(promedio.getnotaFinal(nota1, nota2));
        System.out.println("  ");
        System.out.println("______________________________________________________________");


    }
}
