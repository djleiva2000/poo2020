package herencia_empleado;

public class Empleado_asalariado extends Empleado {
    private double valor_mensual;

    /**
     *
     * @param cargo
     * @param nombres
     * @param dependencia
     * @param valor_mensual
     */

    public Empleado_asalariado(String cargo,String nombres,String dependencia ,double valor_mensual ){
        this.valor_mensual=valor_mensual;
        this.nombres=nombres;
        this.cargo=cargo;
        this.dependencia=dependencia;


    }

    public double getValor_mensual() {
        return valor_mensual;
    }

    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }
    public void valor_sueldo_mes(double sueldo_mes ){
        valor_mensual=valor_mensual;
    }
}
