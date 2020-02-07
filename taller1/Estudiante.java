package taller1;

public class Estudiante {
    //definicion de atributos globales
    private int edad;
    private String sexo;
    private String raza;
    private String nacionalidad;
    private String residencia;
    private String institucion;
    private String curso;
    private double altura;

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
     * metodo para obtener nacionalidad
     * @return
     */

    public String obtener_nacionalidad(){
        return this.nacionalidad;
    }

    /**
     * metodo para obtener residencia
     * @return this.residencia
     */
    public String obtener_residencia(){
        return this.residencia;
    }

    /**
     * metodo para obtener institucion
     * @return this.institucion
     */
    public String obtener_institucion(){
        return this.institucion;
    }

    /**
     * metodo para obtener curso
     * @return this.curso
     */
    public String obtener_curso(){
        return this.curso;
    }

    /**
     * metodo para obtener altura
     * @return this.altura
     */
    public double obtener_altura(){
        return this.altura;
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
     * Metodo para actualizar la variable nacionalidad
     * @param nacionalidad
     */
    public void actualizar_nacionalidad (String nacionalidad){
        this.nacionalidad=nacionalidad;
    }

    /**
     * Metodo para actualizar la variable residencia
     * @param residencia
     */
    public void actualizar_residencia (String residencia){
        this.residencia=residencia;
    }

    /**
     * Metodo para actualizar la variable curso
     * @param curso
     */

    public void actualizar_curso(String curso){
        this.curso=curso;
    }

    /**
     * Metodo para actualizar la variable institucion
     * @param institucion
     */
    public void actualizar_institucion(String institucion){
        this.institucion=institucion;
    }

    /**
     * Metodo para actualizar la variable altura
     * @param altura
     */
    public void  actualizar_altura (double altura){
        this.altura=altura;
    }
}
