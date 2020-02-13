package deber_seleccion;

public class Calcular_sueldo {
    private String empleado;
    private double sueldo;
    private int horas;
    private double cuota;
    /**
     * Método construtor de la clase sueldo
     */
    public Calcular_sueldo(String nombre, int horas, double cuota){
        this.setEmpleado(nombre);
        this.setHoras(horas);
        this.setCuota(cuota);
    }

    /**
     * METODO PARA OBTENER EL NOMBRE DEL EMPLEADO
     * @return
     */
    public String getEmpleado() {
        return empleado;
    }
    /**
     * METODO PARA ACUTUALIZAR EL NOMBRE DEL EMPLEADO
     * @return
     */
    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
    /**
     * METODO PARA OBTENER EL SUELDO DEL EMPLEADO
     * @return
     */
    public double getSueldo() {
        return sueldo;
    }
    /**
     * METODO PARA ACTUALIZAR EL SUELDO DEL EMPLEADO
     * @return
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * METODO PARA OBTENER HORAS DEL EMPLEADO
     * @return
     */
    public int getHoras() {
        return horas;
    }
    /**
     * METODO PARA ACTUALIZAR HORAS DEL EMPLEADO
     * @return
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }
    /**
     * METODO PARA OBTENER LA CUOTA DEL EMPLEADO
     * @return
     */
    public double getCuota() {
        return cuota;
    }
    /**
     * METODO PARA ACTUALIZAR LA CUOTA DEL EMPLEADO
     * @return
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }
    /**
     * METODO PARA OBTENER EL SUELDO DEL EMPLEADO
     * @return
     */
     public void sueldo(){
         if(horas <= 40){
             sueldo = horas * cuota;
         }else {
             if (horas <= 50) {
                 sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
             } else {
                 sueldo = ((40 * cuota) + (10 * cuota * 2)) + ((horas - 50) + (cuota * 3));
             }
         }

     }
     public String obtener_nombre(){
        return empleado;
     }
    public double obtener_sueldo(){
        return sueldo;
    }
}
