package main;

import java.util.Scanner;
import servicio.Tienda;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Tienda tienda = new Tienda();
        int cont=0;

        do {
            System.out.println("");
            System.out.println("    MENU");
            System.out.println("1- Ingresar productos");
            System.out.println("2- Modificar Precio");
            System.out.println("3- Eliminar un Producto");
            System.out.println("4- Salir");

            System.out.println("Ingrese el numero de la opcion que desea elegir");
            int num = leer.nextInt();

            switch (num) {
                case 1:
                    tienda.ingresar();
                    break;
                case 2:
                    tienda.modificarPrecio();
                    break;
                case 3:
                    tienda.eliminar();
                    break;
                case 4:
                    cont++;
                default:
                    System.out.println("Opcion ingresada no valida");
                    
            }
        } while (cont == 0);

    }
}
