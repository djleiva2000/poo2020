package herenci_figuras;

public class Triangulo extends Figura {
    private double base_tri;
    private double altura_tri;
    private double areatri;


    public Triangulo( double base_tri,double altura_tri){
        this.base_tri=base_tri;
        this.altura_tri=altura_tri;

    }

    public double getBase_tri() {
        return base_tri;
    }

    public void setBase_tri(double base_tri) {
        this.base_tri = base_tri;
    }

    public double getAltura_tri() {
        return altura_tri;
    }

    public void setAltura_tri(double altura_tri) {
        this.altura_tri = altura_tri;
    }

    public double getAreatri() {
        return areatri;
    }

    public void setAreatri(double areatri) {
        this.areatri = areatri;
    }
    public void calc_area_triangulo (){
        areatri=(base_tri*altura_tri)/2;
    }
    public double presentar_triangulo(){
        return areatri;
    }

}
