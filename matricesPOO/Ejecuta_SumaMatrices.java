package matricesPOO;
import java.util.Scanner;

public class Ejecuta_SumaMatrices {
    public static void main(String[] args) {
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese número matriz A, posicion: " + i+"."+j);
                matrizA[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese número matriz B, posicion: " + i+"."+j);
                matrizB[i][j] = teclado.nextInt();
            }
        }

        SumaMatrices sumaMatrices = new SumaMatrices(matrizA,matrizB);
        sumaMatrices.sumaMatrices();
        sumaMatrices.presentar();
    }
}
