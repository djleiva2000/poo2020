package herencia;

import java.util.Date;
import java.util.Scanner;

public class Ejecuta_personal {

    public static void main(String[] args) {
        // creacion de objeto de la clase estudiante
        String nombre,identificacion,estado_civil;
        String fecha_nac,carrera,area,dependencia;

        Scanner teclado= new Scanner(System.in);
        System.out.println("creacion de objeto y estudiante");
        System.out.println("ingrese el nombre");
        nombre=teclado.nextLine();
        System.out.println("ingrese la identificacion");
        identificacion=teclado.nextLine();
        System.out.println("ingrese la carrera");
        carrera=teclado.nextLine();
        System.out.println("ingrese estado civil");
        estado_civil=teclado.nextLine();
        System.out.println("ingrese fecha de nacimiento");
        fecha_nac= teclado.nextLine();

        //Creacion de objeto estudiante
        Estudiante est =new Estudiante(carrera,nombre,identificacion,fecha_nac,estado_civil);

        est.setNombre(nombre);
        est.setIdentificacion(identificacion);
        est.setCarrera(carrera);
        est.setEstado_civil(estado_civil);
        est.setFecha_nacimiento(fecha_nac);


        System.out.println("___________________________________________");
        System.out.println("Datos de objetos estudiantes");
        System.out.println("nombre: "+est.getNombre());
        System.out.println("identificacion: "+est.getIdentificacion());
        System.out.println("carrera: "+est.getCarrera());
        System.out.println("estado civil: "+est.getEstado_civil());
        System.out.println("fecha de nacimiento: "+est.getFecha_nacimiento());
        System.out.println("___________________________________________");


        System.out.println("creacion de objeto y estudiante");
        System.out.println("ingrese el nombre");
        nombre=teclado.nextLine();
        System.out.println("ingrese la identificacion");
        identificacion=teclado.nextLine();
        System.out.println("ingrese area");
        area=teclado.nextLine();
        System.out.println("ingrese estado civil");
        estado_civil=teclado.nextLine();
        System.out.println("ingrese fecha de nacimiento");
        fecha_nac= teclado.nextLine();

        Docente docente=new Docente(area,nombre,identificacion,fecha_nac,estado_civil);
        System.out.println("___________________________________________");
        System.out.println("Datos de docente");
        System.out.println("nombre: "+docente.getNombre());
        System.out.println("identificacion: "+docente.getIdentificacion());
        System.out.println("carrera: "+docente.getArea());
        System.out.println("estado civil: "+docente.getEstado_civil());
        System.out.println("fecha de nacimiento: "+docente.getFecha_nacimiento());
        System.out.println("___________________________________________");



        System.out.println("creacion de objeto y estudiante");
        System.out.println("ingrese el nombre");
        nombre=teclado.nextLine();
        System.out.println("ingrese la identificacion");
        identificacion=teclado.nextLine();
        System.out.println("ingrese la carrera");
        dependencia=teclado.nextLine();
        System.out.println("ingrese estado civil");
        estado_civil=teclado.nextLine();
        System.out.println("ingrese fecha de nacimiento");
        fecha_nac= teclado.nextLine();


        Administrativo administrativo =new Administrativo(carrera,nombre,identificacion,fecha_nac,estado_civil);
        System.out.println("___________________________________________");
        System.out.println("Datos de administrativo");
        System.out.println("nombre: "+administrativo.getNombre());
        System.out.println("identificacion: "+administrativo.getIdentificacion());
        System.out.println("carrera: "+administrativo.getDependencia());
        System.out.println("estado civil: "+administrativo.getEstado_civil());
        System.out.println("fecha de nacimiento: "+administrativo.getFecha_nacimiento());
        System.out.println("___________________________________________");


    }


}
