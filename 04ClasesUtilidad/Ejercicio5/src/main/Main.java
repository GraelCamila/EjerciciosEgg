
package main;

import entidad.Persona;
import servicio.PersonaServicio;

public class Main {
    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        Persona persona = ps.crearPersona();
        
        ps.mostrarPersona(persona);
        
    }
}
