
package ejercicios1y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicios1y2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();
        
        int cont;
        do {
            System.out.println("Ingrese la raza del perro");
            String x = leer.next();
            razas.add(x);
            do {
                System.out.println("¿Desea añadir otro perro? S/N");
                String r = leer.next();
                cont = 0;
                if (r.equalsIgnoreCase("S") || r.equalsIgnoreCase("N")) {
                    if (r.equalsIgnoreCase("S")) {
                        cont++;
                    }
                } else {
                    System.out.println("Respuesta ingresada no valida");
                    System.out.println("Vuelva a intentarlo");
                    cont = 5;
                }
            } while (cont == 5);
        } while (cont!=0);
        
        for(String cadena : razas){
            System.out.print(cadena + ", ");
        }
        System.out.println("");
        
        
        
        
        
        //                  ****************
        //                  * EJERCICIO 2: *
        //                  ****************
        
        System.out.println("Ingrese un perro");
        String p = leer.next();
        cont=0;
        int cont2=0;
        Iterator it = razas.iterator();
        
        while (it.hasNext()){
            cont2++;
            if (it.next().equals(p)) {
                it.remove();
            } else {
                cont++;
            }
        }
        if (cont2 == cont) {
            System.out.println("El perro ingresado no se encuentra dentro de la lista");
        }
        
        for(String cadena : razas){
            System.out.print(cadena + ", ");
        }
        System.out.println();
        
    }
}
