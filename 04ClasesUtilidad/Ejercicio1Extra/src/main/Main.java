
package main;

import servicio.MesesServicio;

public class Main {
    public static void main(String[] args) {
        
        MesesServicio ms = new MesesServicio();
        
        ms.asignarMeses();
        ms.asignarSecreto();
        ms.preguntar();
    }
}
