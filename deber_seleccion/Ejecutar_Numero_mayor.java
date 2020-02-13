package deber_seleccion;

import java.util.Scanner;

public class Ejecutar_Numero_mayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba 1er numero");
        int num1=teclado.nextInt();

        System.out.println("Escriba 2do numero");
        int num2=teclado.nextInt();

        System.out.println("Escriba 3er numero");
        int num3=teclado.nextInt();

        System.out.println("Escriba 4to numero");
        int num4=teclado.nextInt();

        Numero_mayor mayor=new Numero_mayor(num1,num2,num3,num4);
        mayor.Calcular();
        System.out.println("El mayor es :");
    }


}
