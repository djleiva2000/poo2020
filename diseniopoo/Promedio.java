package diseniopoo;

public class Promedio {
   private String nombre;
   private String asignatura;
   private double nota1;
   private double nota2;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public Promedio(String nombre,String asignatura,double nota1,double nota2){
        this.nombre=nombre;
        this.asignatura=asignatura;
        this.nota1=nota1;
        this.nota2=nota2;
    }
    public String getnotaFinal(double nota1, double nota2){
        double notaFinal=nota1 + nota2;
        String cadena;
        if (notaFinal<=28) {
            cadena= " Calificación final: "+notaFinal+" REPROBADO ";


        }else{
            cadena = " Calificación final: " +notaFinal+" APROBADO ";
        }

        return cadena;
    }
    public String getpromest(){
        String promest= "NOMBRE: "+nombre+
                        " ASIGNATURA: "+asignatura+
                        " NOTA 1er BIM: "+nota1+
                        "  NOTA 2do BIM: "+ nota2;
        return promest;
    }
}
