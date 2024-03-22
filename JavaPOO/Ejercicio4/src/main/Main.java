
package main;

import entidad.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        
        rec.crearRectangulo();
        rec.perimetro();
        rec.superficie();
        rec.dibujar();
        
    }
}
