package herencia_volumen;

public class Cilindro extends  Figura_geometrica {
    private double altura_cilindro;
    private double radio_cilindro;
    private double volumen_cilindro;

    public Cilindro(double altura_cilindro,double radio_cilindro){
        this.altura_cilindro=altura_cilindro;
        this.radio_cilindro=radio_cilindro;

    }

    public double getAltura_cilindro() {
        return altura_cilindro;
    }

    public void setAltura_cilindro(double altura_cilindro) {
        this.altura_cilindro = altura_cilindro;
    }

    public double getRadio_cilindro() {
        return radio_cilindro;
    }

    public void setRadio_cilindro(double radio_cilindro) {
        this.radio_cilindro = radio_cilindro;
    }

    public double getVolumen_cilindro() {
        return volumen_cilindro;
    }

    public void setVolumen_cilindro(double volumen_cilindro) {
        this.volumen_cilindro = volumen_cilindro;
    }
    public void calcular_volumen_cilindro(){
        volumen_cilindro=((Math.PI*(radio_cilindro*radio_cilindro))*altura_cilindro);
    }
    public double presentar_cilindro(){
        return volumen_cilindro;
    }
}
