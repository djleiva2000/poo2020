package herencia;

/**
 * clase que herada de la clase persona contendra
 * todos los atributos y metodos definidos en persona
 * extends hereda
 */

public class Estudiante extends Persona {
    /**
     * @param estado_civil
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param fec_nacimiento
     */

public Estudiante(String carrera,String nombre,String identificacion ,String fec_nacimiento,String estado_civil){
    this.carrera=carrera;
    this.nombre=nombre;
    this.identificacion=identificacion;
    this.estado_civil=estado_civil;
    this.fecha_nacimiento=fec_nacimiento;

}
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public  void matricular(){
        System.out.println("metodo para matricular");
    }

    public  void aprender(){
        System.out.println("metodo para aprender");
    }
}
