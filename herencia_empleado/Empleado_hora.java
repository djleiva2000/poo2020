package herencia_empleado;

public class Empleado_hora extends Empleado {
    private int hora;
    private double valor_hora;
    private double sueldo;



    /**
     *
     * @param cargo
     * @param nombres
     * @param dependencia
     * @param valor_hora
     * @param hora
     */

    public Empleado_hora(String cargo,String nombres,String dependencia ,double valor_hora,int hora ){
        this.valor_hora=valor_hora;
        this.nombres=nombres;
        this.cargo=cargo;
        this.dependencia=dependencia;
        this.hora=hora;
        this.sueldo=sueldo;


    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
    public void sueldo_hora (double valor_hora,int hora){
        sueldo= hora*valor_hora;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
