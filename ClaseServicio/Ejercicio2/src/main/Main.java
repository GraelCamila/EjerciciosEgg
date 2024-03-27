
package main;

import Servicio.CafeteraServicio;
import entidad.Cafetera;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CafeteraServicio cs = new CafeteraServicio();
        
        Cafetera cafetera1 = cs.llenarCafetera();
        
        int op, cont=0;
        
        do {
            System.out.println("");
            System.out.println("1- Llenar Cafetera");
            System.out.println("2- Servir Taza");
            System.out.println("3- Vaciar Cafetera");
            System.out.println("4- Agregar Cafe");
            System.out.println("5- Salir");
            op = leer.nextInt();
            switch(op){
                case 1:
                    cs.llenarCafetera();
                    break;
                case 2:
                    cs.servirTaza(cafetera1);
                    break;
                case 3:
                    cs.vaciarCafetera(cafetera1);
                    break;
                case 4:
                    cs.agregarCafe(cafetera1);
                    break;
                case 5:
                    cont++;
                    break;
                default:
                    System.out.println("Opcion ingresada no valida");
            }
        } while (cont==0);
    }
}
