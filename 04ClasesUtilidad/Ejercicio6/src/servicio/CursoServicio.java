
package servicio;

import entidad.Curso;
import java.util.Scanner;

public class CursoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Curso curso = new Curso();
    
    public String[] cargarAlumnos(){
        String[] al = new String[5];
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del " + (i+1) + "° alumno");
            al[i] = leer.next();
        }
        return al;
    }
    
    public void crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(leer.next());
        int cont;
        do {
            cont=0;
            System.out.println("Turno: Mañana(M) o Tarde(T)");
            String turno = leer.next();
            if (turno.equalsIgnoreCase("m") || turno.equalsIgnoreCase("t")) {
                curso.setTurno(turno);
            } else {
                System.out.println("Respuesta ingresada no valida");
                System.out.println("Vuelve a intentar");
                cont++;
            }
        } while (cont!=0);
        System.out.println("Ingrese la cantidad de horas dictadas por dia");
        curso.setCantHorasxDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias de la semana dictadas");
        curso.setCantDiasxSemana(leer.nextInt());
        System.out.println("Ingrese el precio por hora");
        curso.setPrecioxHora(leer.nextInt());
        curso.setAlumnos(cargarAlumnos());
    }
    
    public void calcularGananciaSemanal(){
        int ganacia = curso.getCantHorasxDia() * curso.getPrecioxHora() * 5 * curso.getCantDiasxSemana();
        System.out.println("La ganacia de la semana del curso " + curso.getNombreCurso()+ " es de " + ganacia);
    }
}
