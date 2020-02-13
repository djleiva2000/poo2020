package deber_seleccion;

public class Promedio_calificaciones {
    private String nombre;
    private double cali1;
    private double cali2;
    private double cali3;
    private double cali4;
    private double promedio;
    private String obser;
    /**
     * Método construtor de la clase deber_seleccion
     */

    public Promedio_calificaciones(String nombre, double cali1, double cali2, double cali3, double cali4) {
        this.nombre = nombre;
        this.cali1 = cali1;
        this.cali2 = cali2;
        this.cali3 = cali3;
        this.cali4 = cali4;
    }

    /**
     * metodo para obtener el nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo para actualizar el nombre
     * @return
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo para obtener la calificacion 1
     * @return
     */
    public double getCali1() {
        return cali1;
    }
    /**
     * metodo para actualizar la calificacion 1
     * @return
     */
    public void setCali1(double cali1) {
        this.cali1 = cali1;
    }
    /**
     * metodo para obtener la calificacion 2
     * @return
     */
    public double getCali2() {
        return cali2;
    }
    /**
     * metodo para actualizar la calificacion 2
     * @return
     */
    public void setCali2(double cali2) {
        this.cali2 = cali2;
    }
    /**
     * metodo para obtener la calificacion 3
     * @return
     */
    public double getCali3() {
        return cali3;
    }
    /**
     * metodo para actualizar la calificacion 3
     * @return
     */
    public void setCali3(double cali3) {
        this.cali3 = cali3;
    }
    /**
     * metodo para obtener la calificacion 4
     * @return
     */
    public double getCali4() {
        return cali4;
    }
    /**
     * metodo para actualizar la calificacion 4
     * @return
     */
    public void setCali4(double cali4) {
        this.cali4 = cali4;
    }
    /**
     * metodo para obtener el promedio
     * @return
     */
    public double getPromedio() {
        return promedio;
    }
    /**
     * metodo para actualizar el promedio
     * @return
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    /**
     * metodo para obtener la observacion
     * @return
     */
    public String getObser() {
        return obser;
    }
    /**
     * metodo para actualizar la observacion
     * @return
     */
    public void setObser(String obser) {
        this.obser = obser;
    }
    /**
     * metodo para calcular el promedio de 4
     * calificaciones sumando y dividiendo para
     * las calificaciones
     * @return
     */
    public void cal_prom()  {
        promedio=(cali1+cali2+cali3+cali4)/4;

    }
    /**
     * metodo para determinar si aprobo o desaprobo
     * @return
     */

    public void cal_obser()  {
        if (promedio>=60){
            obser="APROBADO";


        }else{
            obser="REPROBADO";
        }

    }

    /**
     * Método para retornar el nombre
     * @return
     */
    public String obtenerNombre(){
        return nombre;
    }

    /** Método para retornar el promedio
     *
     * @return
     */
    public Double obtenerPromedio(){
        return promedio;
    }

    /**
     * Método para retornar la observacion
     * @return
     */
    public String obtenerObservacio(){
        return obser;
    }




}
