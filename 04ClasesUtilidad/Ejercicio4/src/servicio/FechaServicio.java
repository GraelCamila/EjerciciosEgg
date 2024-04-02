
package servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Dia:");
        int dia = leer.nextInt();
        System.out.println("Mes (1-12):");
        int mes = leer.nextInt() - 1;
        System.out.println("Año:");
        int anio = leer.nextInt() - 1900;
        
        return new Date(anio,mes,dia);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int diferencia(Date fechaNacimiento, Date fechaActual){
        long milisegundosPorAnio = 1000L *60*60*24*365;
        long diferenciaMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
        int edad = (int) (diferenciaMilisegundos/ milisegundosPorAnio);
        return edad;
    }
}
