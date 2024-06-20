
package main;

import java.util.Scanner;
import servicio.AseguradoraServicio;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AseguradoraServicio as = new AseguradoraServicio();
        int resp;
        do {
            System.out.println("");
            System.out.println("     MENU:");
            System.out.println("1- Crear Poliza");
            System.out.println("2- Pagar cuotas");
            System.out.println("3- Salir");
            resp = leer.nextInt();
            switch (resp) {
                case 1:
                    as.CrearPoliza();
                    break;
                case 2:
                    as.Cuotas();
                default:
                    break;
            }
        } while (resp != 3);
    }
}
