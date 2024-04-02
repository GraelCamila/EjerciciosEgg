
package main;

import entidad.Numeros;
import servicio.NumerosServicio;

public class Main {
    public static void main(String[] args) {
        NumerosServicio ns = new NumerosServicio();
        Numeros num = new Numeros();
        
        ns.inicializarA(num);
        ns.mostrar(num);
        ns.ordenar(num);
        ns.inicializarB(num);
    }
    
}
