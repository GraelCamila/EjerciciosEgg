
package Servicio;

import entidad.Carta;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.Scanner;

public class BarajaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Carta> mazo = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();
    
    public void crearBaraja(){
        String[] palos = {"Basto", "Copa", "Espada", "Oro"};
//        Carta carta = new Carta();
        for (int i = 0; i < palos.length; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j == 8 || j == 9) {
                    continue;
                }
//                Carta c = new Carta(j, carta.getPalo());
//                mazo.add(c);
                mazo.add(new Carta(j,palos[i])); //resumido
            }
        }
    }
    
    public void barajar(){
        System.out.println("Se barajo el mazo");
        System.out.println("");
        shuffle(mazo);
        
        for (Carta carta : mazo) {
            System.out.println(carta);
        }
    }
    
    public void siguienteCarta(){
        if (mazo.size() > 1) {
            System.out.println("Se entrego " + mazo.get(0));
//            monton.add(mazo.get(0));
//            mazo.remove(0);
            monton.add(mazo.remove(0));//resumido
        } else if (mazo.size() == 1) {
            System.out.println("Se entrego " + mazo.get(0));
            monton.add(mazo.remove(0));
            System.out.println("No quedan mas cartas");
        }
    }
    
    public void cartasDisponibles(){
        System.out.println("Quedan " +mazo.size() + " cartas disponibles");
        System.out.println("");
    }
    
    public void darCartas(){
        System.out.println("Ingrese el numeros de cartas que desea tomar");
        int cantCartas = leer.nextInt();
        if (cantCartas > mazo.size()) {
            System.out.println("Solicitó mas cartas de las que hay");
        } else {
            for (int i = 0; i < cantCartas; i++) {
                siguienteCarta();   
            }
        }
        System.out.println("");
    }

    public void cartasMonton(){
        if (monton.isEmpty()) {
            System.out.println("No salio ninguna carta");
        } else {
            System.out.println(monton);
        }
        System.out.println("");
    }
    
    public void mostrarBajara(){
        System.out.println(mazo);
        System.out.println("");
    }
}
