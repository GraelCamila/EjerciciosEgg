
package servicio;

import entidad.Alumno;
import entidad.Voto;
import enums.Apellidos;
import enums.Nombres;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Simulador {
    
    public String generadorNombres(){
        
        int al = new Random().nextInt(Nombres.values().length);
        String nom = Nombres.values()[al] + "";
        
        al = new Random().nextInt(Apellidos.values().length);
        nom = nom + ", " + Apellidos.values()[al];

        return nom;
    }
    
    public int generadorDNI(){
        int d = (int) (Math.random() * (123456789) + 111111111);
        
        return d;
    }
    
    public ArrayList objetosAlumno(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la cantidad de alumnos");
        int n = leer.nextInt();
        
        ArrayList<Alumno> alumnos = new ArrayList();
        int cont, gD;
        String nom;
        for (int i = 0; i < n; i++) {
            Alumno alumno = new Alumno();
            alumno.setNombre(generadorNombres());
            do {
                cont=0;
                alumno.setDNI(generadorDNI());
                for (Alumno alumno1 : alumnos) {
                    if (alumno.getDNI() == alumno1.getDNI()) {
                        cont++;
                    }
                }
            } while (cont!=0);
            alumnos.add(alumno);
        }

        return alumnos;
    }
    
    public ArrayList<Alumno> mostrarAlumnos(){
        
        ArrayList<Alumno> alumnos = objetosAlumno();
        
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        return alumnos;
    }
    
    public void votacion(){
        Voto voto = new Voto();
        
        ArrayList<Alumno> alumnos = mostrarAlumnos();
        ArrayList<Alumno> yaVoto = new ArrayList();
        HashSet<Alumno> al = new HashSet();
        
        int cont;
        
        for (Alumno alumno : alumnos) {
            cont=1;
            System.out.println("Los tres votos del alumno " + alumno.getNombre() + " son para:");
            do {
                System.out.print(cont + "°: ");
                for (Alumno alumno1 : alumnos) {
                    
                    if (alumno.getDNI() != alumno1.getDNI()) {
                        System.out.println(alumno1.getNombre() + " de DNI " + alumno1.getDNI());
                    }
                }
                cont++;
            } while (cont<=4);
            System.out.println("");
        }
        
        
        
    }
    
}
