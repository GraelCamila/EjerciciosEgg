
package main;

import entidad.Cafetera;

public class Main {
    public static void main(String[] args) {
        Cafetera cafe = new Cafetera();

        cafe.agregarCafe();
        cafe.llenarCafetera();
        cafe.servirTaza();
        cafe.vaciarCafetera();
    }
    
}
