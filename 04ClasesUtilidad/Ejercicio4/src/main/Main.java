
package main;

import servicio.FechaServicio;

public class Main {

    public static void main(String[] args) {
        FechaServicio fechaS = new FechaServicio();
        System.out.println("Tu edad es " + fechaS.diferencia( fechaS.fechaNacimiento(), fechaS.fechaActual()));
    }
    
}
