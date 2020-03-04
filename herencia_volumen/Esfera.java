package herencia_volumen;

public class Esfera extends Figura_geometrica {
    private double radio_esfera;
    private double volumen_esfera;

    public Esfera(double radio_esfera){

    }

    public double getRadio_esfera() {
        return radio_esfera;
    }

    public void setRadio_esfera(double radio_esfera) {
        this.radio_esfera = radio_esfera;
    }

    public double getVolumen_esfera() {
        return volumen_esfera;
    }

    public void setVolumen_esfera(double volumen_esfera) {
        this.volumen_esfera = volumen_esfera;
    }
    public void calcular_volumen_esfera(){
        volumen_esfera=((Math.PI*(radio_esfera*radio_esfera*radio_esfera))*4)/3;
    }
    public double presentar_esfera(){
        return volumen_esfera;
    }

}
