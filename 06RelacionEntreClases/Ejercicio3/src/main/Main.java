
package main;

import Servicio.BarajaServicio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        BarajaServicio bs = new BarajaServicio();
        boolean bucle = true;
        
        bs.crearBaraja();
        do {
            System.out.println("MENU:");
            System.out.println("1. Barajar");
            System.out.println("2. Cartas Disponibles");
            System.out.println("3. Dar Cartas");
            System.out.println("4. Cartas Desechadas");
            System.out.println("5. Mostrar Baraja");
            System.out.println("6. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    bs.barajar();
                    break;
                case 2:
                    bs.cartasDisponibles();
                    break;
                case 3:
                    bs.darCartas();
                    break;
                case 4:
                    bs.cartasMonton();
                    break;
                case 5:
                    bs.mostrarBajara();
                    break;
                default:
                    bucle = false;
            }
        } while (bucle);
    }
}
