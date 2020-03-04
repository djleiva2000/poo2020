package herenci_figuras;

public class Circulo extends Figura {
    private    double radio;
    private   double area_circulo;
    public Circulo(double  radio){
        this.radio=radio;

    }



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea_circulo() {
        return area_circulo;
    }

    public void setArea_circulo(double area_circulo) {
        this.area_circulo = area_circulo;
    }
    public void calc_areaCirculo (){
        area_circulo= Math.PI*(Math.pow(radio,2));
    }
    public double presentaArea(){
        return area_circulo;
    }
}
