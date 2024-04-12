
package main;

import servicio.AlumnoServicio;

public class Main {
    public static void main(String[] args) {
        AlumnoServicio alumnoS = new AlumnoServicio();
        
        alumnoS.crearListalumnos();
        Double p = alumnoS.notaFinal();
        if (p == null) {
            System.out.println("NO se encontro al alumno");
        } else {
            System.out.println("El promedio del alumno es " + p);
        }
        
    }
}
