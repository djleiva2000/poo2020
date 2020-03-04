package herenci_figuras;

public class Cuadrado extends Figura {
    private double ladocuadrado;
    private double areacuadrado;

    public Cuadrado(double ladocuadrado){
        this.ladocuadrado=ladocuadrado;

    }

    public double getLadocuadrado() {
        return ladocuadrado;
    }

    public void setLadocuadrado(double ladocuadrado) {
        this.ladocuadrado = ladocuadrado;
    }

    public double getAreacuadrado() {
        return areacuadrado;
    }

    public void setAreacuadrado(double areacuadrado) {
        this.areacuadrado = areacuadrado;
    }
    public void calcularCuadrado(){
        areacuadrado=(ladocuadrado*ladocuadrado);
    }

    public double presentaCuadrado(){
        return areacuadrado;
    }
}
