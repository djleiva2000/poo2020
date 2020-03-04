package herencia_volumen;

public class Cono extends  Figura_geometrica{
    private double altura_cono;
    private double radio_cono;
    private double volumen_cono;
    public Cono(double altura_cono, double radio_cono){
        this.altura_cono=altura_cono;
        this.radio_cono=radio_cono;
    }

    public double getAltura_cono() {
        return altura_cono;
    }

    public void setAltura_cono(double altura_cono) {
        this.altura_cono = altura_cono;
    }

    public double getRadio_cono() {
        return radio_cono;
    }

    public void setRadio_cono(double radio_cono) {
        this.radio_cono = radio_cono;
    }

    public double getVolumen_cono() {
        return volumen_cono;
    }

    public void setVolumen_cono(double volumen_cono) {
        this.volumen_cono = volumen_cono;
    }
    public void calcular_volumen_cono(){
        volumen_cono=((Math.PI*(radio_cono*radio_cono))*altura_cono)/3;
    }
    public double presentar_cono(){
        return volumen_cono;
    }
}
