
package servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Paises {
    
    HashSet<String> paises = new HashSet();    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresar(){
        int cont;
        do {
            System.out.println("Ingrese un pais");
            String pais = leer.next();
            paises.add(pais);
            
            do {
                cont=0;
                System.out.println("¿Desea ingresar otro pais? S/N");
                String resp = leer.next();
                if (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("N")) {
                    if (resp.equalsIgnoreCase("N")) {
                        System.out.println("");
                        System.out.println("Conjunto:");
                        mostrar();
                        cont++;
                    }
                } else {
                    System.out.println("Respuesta ingresada no valida");
                    System.out.println("Vuelva a intentarlo");
                    cont=5;
                }
            } while (cont==5);
        } while (cont==0);
    }
    
    public void mostrar(){
        for (String pais : paises) {
            System.out.println(pais);
        }
    }
    
    public void ordenar(){
        TreeSet<String> paisesTree = new TreeSet(paises);
        for (String paisTree : paisesTree) {
            System.out.println(paisTree);
        }
    }
    
    public void buscar(){
        System.out.println("Ingrese un pais que buscar");
        String buscar = leer.next();
        Iterator it = paises.iterator();
        int cont=0;
        while (it.hasNext()){
            if (it.next().equals(buscar)) {
                it.remove();
                cont = 5;
            }
        }
        
        if (cont==5) {
            mostrar();
        } else {
            System.out.println("El pais ingresado no se encuentra en el conjunto");
        }
    }
}
