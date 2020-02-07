package taller1;

public class Docente {
    //definicion de atributos globales
    private int edad;
    private String sexo;
    private String raza;
    private String titulo;
    private String area;
    private String institucion;
    private String estado_civil;

    /**
     * metodo para obtener edad
     * @return this.edad
     */
    public int obtener_edad(){
        return this.edad;
    }
    /**
     * metodo para obtener sexo
     * @return this.sexo
     */
    public String obtener_sexo(){
        return this.sexo;
    }
    /**
     * metodo para obtener raza
     * @return this.raza
     */

    public String obtener_raza(){
        return this.raza;
    }

    /**
     * matodo para obtener titulos
     * @return this.titulo
     */
    public String obtener_titulos(){
        return this.titulo;
    }

    /**
     * metodo para obtener area
     * @return this.area
     */
    public String obtener_area(){
        return this.area;
    }
    /**
     * metodo para obtener institucion
     * @return this.institucion
     */
    public String obtener_institucion(){
        return this.institucion;
    }
    /**
     * metodo para obtener estado_civil
     * @return this.estado_civil
     */
    public String obtener_estado_civil(){
        return this.estado_civil;
    }


    /**
     * Metodo para actualizar la variable edad
     * @param edad
     */
    public void actualizar_edad (int edad){
        this.edad=edad;
    }

    /**
     * Metodo para actualizar la variable sexo
     * @param sexo
     */
    public void actualizar_sexo(String sexo){
        this.sexo=sexo;
    }

    /**
     * Metodo para actualizar la variable raza
     * @param raza
     */
    public void actualizar_raza (String raza){
        this.raza=raza;
    }

    /**
     * Metodo para actualizar la variable titulos
     * @param titulo
     */
    public void actualizar_titulo (String titulo){
        this.titulo=titulo;
    }
    /**
     * Metodo para actualizar la variable raza
     * @param area
     */
    public void actualizar_area (String area){
        this.area=area;
    }
    /**
     * Metodo para actualizar la variable institucion
     * @param institucion
     */
    public void actualizar_institucion(String institucion){
        this.institucion=institucion;
    }
    /**
     * Metodo para actualizar la variable institucion
     * @param estado_civil
     */
    public void actualizar_estado_civil(String estado_civil){
        this.estado_civil= estado_civil;

    }





}
