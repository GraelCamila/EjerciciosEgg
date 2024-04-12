
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //un ArrayList creado con un objeto
    ArrayList<Alumno> alumnos = new ArrayList();
    public void crearListalumnos(){
        int cont;
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(leer.next());
            System.out.println("Ingrese las notas del alumno");
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            do {
                cont = 0;
                System.out.println("¿Desea ingresar a otro alumno? S/N");
                String resp = leer.next();
                if (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("N")) {
                    if (resp.equalsIgnoreCase("N")) {
                        cont++;
                    }
                } else {
                    System.out.println("Respuesta ingresada no valida");
                    System.out.println("Vuelva a intentarlo");
                    cont=5;
                }
            } while (cont == 5);
        } while (cont==0);
    }
    
    public Double notaFinal(){
        System.out.println("Ingrese el nombre del alumno que desea calcular su nota");
        String alum = leer.next();
        Iterator<Alumno> it = alumnos.iterator();
        
        while(it.hasNext()){
            Alumno alumnoAux = it.next();
            if (alumnoAux.getNombre().equalsIgnoreCase(alum)) {
                return promedioNotas(alumnoAux);
            }
        }
        return null;
    }
    
    public double promedioNotas(Alumno alumno){
        double notas = 0;
        for (Integer nota : alumno.getNotas()) {
            notas += nota;
        }
        return notas / alumno.getNotas().size();
    }
}
