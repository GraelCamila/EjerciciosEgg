
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia:");
        int dia = leer.nextInt();
        System.out.println("Mes (1-12):");
        int mes = leer.nextInt() - 1;
        System.out.println("Año:");
        int anio = leer.nextInt() - 1900;
        Date nac = new Date(anio,mes,dia);
        persona.setFecha(nac);
        return persona;
    }
    
    public int calcularEdad(Persona persona){
        Date fechaActual = new Date();
        long milisegundosPorAnio = 1000L *60*60*24*365;
        long diferenciaMilisegundos = fechaActual.getTime() - persona.getFecha().getTime();
        int edad = (int) (diferenciaMilisegundos/ milisegundosPorAnio);
        return edad;
    }
    
    public boolean menorQue(Persona persona, int edad){
        int edad1 = calcularEdad(persona);
        return (edad1<edad);
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + calcularEdad(persona));
        System.out.println(persona.getNombre() + ((menorQue(persona, 30)) ? " es mayor " : " es menor ") + "de 30 años");
    }
}
