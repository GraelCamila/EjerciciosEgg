
package servicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

    ArrayList<Integer> numeros = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresar(){
        int num;
        do {
            System.out.println("Ingrese numeros");
            num = leer.nextInt();
            
            if (num != -99) {
                numeros.add(num);
            }
        } while (num != -99);
        
        System.out.println("Lista:");
        
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("");
    }
    
    public void suma(){
        int num=0;
        for (Integer numero : numeros) {
            num += numero;
        }
        System.out.println("La suma de los numeros ingresados en la lista es: " + num);
    }
    
    public void promedio(){
        int sum=0, cont=0;
        for (Integer numero : numeros) {
            sum += numero;
            cont++;
        }
        System.out.println("El promedio de los numeros ingresados en la lista es: " + (sum/cont));
    }
}
