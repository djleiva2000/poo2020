package herencia_volumen;

public class Cubo extends Figura_geometrica {
    private double arista;
    private double volumen_cubo;
    public Cubo(double arista){

    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getVolumen_cubo() {
        return volumen_cubo;
    }

    public void setVolumen_cubo(double volumen_cubo) {
        this.volumen_cubo = volumen_cubo;
    }
    public void calcular_volumen_cubo(){
        volumen_cubo=(arista*arista*arista);
    }
    public double presentar_cubo(){
        return volumen_cubo;
    }


}
