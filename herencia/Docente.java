package herencia;
//esta clase hereda de la clase padre Persona
public class Docente extends Persona {
    //atributos propios de la clase docente
    private String area;

    /**
     * @param estado_civil
     * @param area
     * @param nombre
     * @param identificacion
     * @param fec_nacimiento
     */

    public Docente(String area,String nombre,String identificacion ,String fec_nacimiento,String estado_civil){
        this.area=area;
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.estado_civil=estado_civil;
        this.fecha_nacimiento=fec_nacimiento;

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public  void enseñar(){
        System.out.println("metodo para enseñar");
    }

    public  void calificar(){
        System.out.println("metodo para calificar");
    }
}
