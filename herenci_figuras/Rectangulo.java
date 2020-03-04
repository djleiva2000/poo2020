package herenci_figuras;

public class Rectangulo extends Figura {
    private double base_rec;
    private double altu_rec;
    private double area_rec;

    public Rectangulo ( double base_rec,double altu_rec){
        this.base_rec=base_rec;
        this.area_rec=area_rec;

    }


    public double getBase_rec() {
        return base_rec;
    }

    public void setBase_rec(double base_rec) {
        this.base_rec = base_rec;
    }

    public double getAltu_rec() {
        return altu_rec;
    }

    public void setAltu_rec(double altu_rec) {
        this.altu_rec = altu_rec;
    }

    public double getArea_rec() {
        return area_rec;
    }

    public void setArea_rec(double area_rec) {
        this.area_rec = area_rec;
    }
    public void calc_area_rect (){
        area_rec= base_rec*altu_rec;
    }
    public double presenteRectangulo (){
        return area_rec;
    }
}
