
package guia3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la cantidad de euros que desea calcular");
        int euros = leer.nextInt();
        int cont;
        do {
            cont = 0;
            System.out.println("¿A que desea convertir los euros?");
            System.out.println("1. Dolares");
            System.out.println("2. Yenes");
            System.out.println("3. Libras");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Dolar(euros);
                    break;
                case 2:
                    Yen(euros);
                    break;
                case 3:
                    Libra(euros);
                    break;
                default:
                    System.out.println("Opcion ingresada no valida");
                    System.out.println("Vuelva a intentarlo");
                    cont++;
            }
        } while (cont!=0);

    }
    public static void Dolar(int euros) {
        System.out.println(euros + " es igual a " + (euros * 1.28611)+ " dolares");
    }
    public static void Yen(int euros) {
        System.out.println(euros + " es igual a " + (euros * 129.852) + " yenes");
    }
    public static void Libra(int euros) {
        System.out.println(euros + " es igual a " + (euros * 0.86) + " libras");
    }
    
}
