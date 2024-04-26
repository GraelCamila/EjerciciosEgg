
package juego;

import jugador.Jugador;
import revolverDeAgua.RevolverDeAgua;

public class Juego {
    
    Jugador jugador = new Jugador();
    RevolverDeAgua r = new RevolverDeAgua();
    
    public void llenarJuego(){
        r.llenarRevolver();
    }
    
    public void ronda(){
        boolean b= false;
        String[] s = jugador.cantJugadores();
        System.out.println("");
        System.out.println("EMPIEZA EL JUEGO:");
        do {
            for (int i = 0; i < s.length; i++) {
                System.out.println("");
                System.out.println("JUGADOR " + s[i]);
                b = jugador.disparo(r);
                if (b == true) {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("El juego termino");
                    System.out.println("El jugador " + s[i] + " perdio");
                    i = s.length;
                }
            }
        } while (b == false);
    }
}
