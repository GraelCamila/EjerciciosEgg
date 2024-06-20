
package main;

import servicio.PerroyPersonaServicio;

public class Main {
    public static void main(String[] args) {
        PerroyPersonaServicio ps = new PerroyPersonaServicio();
        
        ps.crearPersona();
        ps.crearPerro();
        ps.adopcion();
        
        
    }
}
