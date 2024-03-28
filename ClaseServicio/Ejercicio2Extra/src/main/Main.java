
package main;

import entidad.NIF;
import servicio.NIFServicio;

public class Main {
    
    public static void main(String[] args) {
        
        NIFServicio ns = new NIFServicio();
        NIF nif = ns.crearNif();
        ns.mostrar(nif);
    }
    
}
