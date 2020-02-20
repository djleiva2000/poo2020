package arregloPOO;


import java.util.Scanner;

public class Ejecutar_Array {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vectorA = new int [10];
        int[] vectorB = new int [10];
        int sumatoria=0;

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("ingrese elementos del vectorA");

            vectorA[i] = teclado.nextInt();
        }
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("ingrese elementos del vectorB");

            vectorB[i] = teclado.nextInt();
        }
        Array array = new Array(vectorA,vectorB);


            System.out.println("EL RESULTADO ES: "+array.total(vectorA,vectorB));







    }
}
