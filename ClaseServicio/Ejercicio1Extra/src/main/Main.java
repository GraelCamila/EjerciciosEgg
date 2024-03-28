
package main;

import entidad.Raices;
import servicio.RaicesServicio;

public class Main {
    public static void main(String[] args) {
        
        RaicesServicio rs = new RaicesServicio();
        Raices raices = new Raices(2,10,5);
        
        rs.calcular(raices);
        
    }
}
