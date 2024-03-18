
package guia2.Extras;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar el tiempo en minutos");
        int min = leer.nextInt();
        int dias = 0, horas =min/60;
        while(horas > 24){
            dias++;
            horas -= 24;
        }
        System.out.print(min + " minutos");
        if (dias == 1) {
            System.out.print(" es " + dias + " dia ");
        } else if (dias == 0 && horas > 1 || horas == 0) {
            System.out.println(" son " + horas + " horas");
        } else if (dias == 0 && horas == 1) {
            System.out.println(" es " + horas + " hora");
        } else {
            System.out.print(" son " + dias + " dias ");
        }
        if (dias != 0 && horas == 1) {
            System.out.println("y " + horas + " hora");
        } else if (dias != 0 && horas > 1) {
            System.out.println("y " + horas + " horas");
        }
    }
}
