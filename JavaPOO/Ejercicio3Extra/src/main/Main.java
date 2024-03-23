package main;

import entidad.Juego;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cont, gan1=0, gan2=0, cont1;
        do {
            cont = 0;
            for (int i = 0; i < 2; i++) {
                if (i == 0) {
                    System.out.println("Adivina el jugador N°1");
                    if (juego.iniciar_juego()== true) {
                        gan1++;
                    }

                } else{
                    System.out.println("Adivina el jugador N°2");
                    if (juego.iniciar_juego()== true) {
                        gan2++;
                    }
                }
            }
            do {
                cont1=0;
                System.out.println("¿Desean seguir jugando? S/N");
                String resp = leer.next();

                if (resp.equalsIgnoreCase("S")) {
                    cont++;
                } else if (resp.equalsIgnoreCase("N")) {
                    cont=0;
                } else {
                    System.out.println("Respuesta no valida");
                    System.out.println("Vuelva a intentarlo");
                    cont1++;
                }
            } while (cont1!=0);
            
            
        } while (cont != 0);
        System.out.println("El jugador N°1 gano " + gan1 + " veces");
        System.out.println("El jugador N°2 gano " + gan2 + " veces");
    }
}
/*
cochera 25m2 - 3.00/5.00 - 27.87m2(5.3/5.2) - 5/5.45 - 23m2
hall 3,75m2
baño 7,5m2 - 2.70/2.20 - 1.20/2.10 - 2.3/2.7 - 3/1.3 - 1.5/3.35 - 2.5/1.7 - 3.01/2.14
*/
