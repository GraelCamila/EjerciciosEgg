
package jugador;

import java.util.Scanner;
import revolverDeAgua.RevolverDeAgua;

public class Jugador {
    
    private int id;
    private String[] nombre;
    private boolean mojado;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String[] cantJugadores(){
        
        System.out.println("Ingrese el numero de jugadores. Maximo 6");
        int n = leer.nextInt();
        if (n < 1 || n > 6) {
            n = 6;
        }
        nombre = new String[n];
        for (int i = 0; i < n; i++) {
            id = i+1;
            System.out.println("Ingrese el nombre del " + id + "° jugador");
            nombre[i] = leer.next() + id;
        }
        return nombre;
    }
    
    public boolean disparo(RevolverDeAgua r){
        mojado = r.mojar();
        r.siguienteChorro();
        if (mojado == true) {
            System.out.println("El jugador se mojo");
            return true;
        } else {
            System.out.println("El jugador NO se mojo");
            return false;
        }
    }
}
