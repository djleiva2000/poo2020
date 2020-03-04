package herencia;

/**
 * clase que herada de la clase padre Persona
 */
public class Administrativo extends Persona {
    /**
     * @param estado_civil
     * @param dependencia
     * @param nombre
     * @param identificacion
     * @param fec_nacimiento
     */

    public Administrativo(String dependencia,String nombre,String identificacion ,String fec_nacimiento,String estado_civil){
        this.dependencia=dependencia;
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.estado_civil=estado_civil;
        this.fecha_nacimiento=fec_nacimiento;

    }

    //atrivutos propios de la clase administrativo
    private  String dependencia;

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }


    public  void matricular(){
        System.out.println("metodo para matricular");
    }

    public  void gestionar_procesos(){
        System.out.println("metodo para gestionar procesos");
    }


}
