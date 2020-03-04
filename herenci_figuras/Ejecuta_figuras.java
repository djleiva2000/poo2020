package herenci_figuras;

import java.util.Scanner;

public class Ejecuta_figuras {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String nombre_figura;
        int opcion;
        double base,altura,radio,lado;

        do {
            System.out.println("MENU");
            System.out.println("1    AREA TRIANGULO");
            System.out.println("2    AREA CUADRADO");
            System.out.println("3    AREA RECTANGULO");
            System.out.println("4    AREA CIRCULO");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("INGRESE LA BASE DEL TRIANGULO");
                    double base_tri=teclado.nextDouble();
                    System.out.println("INGRESE LA ALTURA DEL TRIANGULO");
                    double altura_tri=teclado.nextDouble();
                    Triangulo triangulo= new Triangulo(base_tri,altura_tri);
                    triangulo.calc_area_triangulo();
                    System.out.println("El area del triangulo es:  "+triangulo.presentar_triangulo());
                    break;
                case 2:
                    System.out.println("ingrese el lado del cuadrado");
                    double ladocuadrado=teclado.nextDouble();
                    Cuadrado cuadrado=new Cuadrado(ladocuadrado);
                    cuadrado.calcularCuadrado();
                    System.out.println("el area del cuadrado es:   "+cuadrado.presentaCuadrado());
                    break;
                case 3:
                    System.out.println("ingrese la base del rectangulo");
                    double base_rec=teclado.nextDouble();
                    System.out.println("ingrese el altura del rectangulo");
                    double altu_rec=teclado.nextDouble();
                    Rectangulo rectangulo=new Rectangulo(base_rec,altu_rec);
                    rectangulo.calc_area_rect();
                    System.out.println("el area del rectangulo:   "+rectangulo.presenteRectangulo());
                    break;
                case 4:
                    System.out.println("ingrese el radio del circulo");
                     radio=teclado.nextDouble();
                     Circulo circulo =new Circulo(radio);
                     circulo.calc_areaCirculo();
                    System.out.println("el area del circulo es:   "+circulo.presentaArea());





            }


        }while (opcion!= 5);



    }

}
