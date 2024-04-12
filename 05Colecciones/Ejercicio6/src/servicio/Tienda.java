
package servicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Tienda {
    
    HashMap<String, Integer> productos = new HashMap();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresar(){
        int cont;
        do {
            System.out.println("Ingrese el producto");
            String producto = leer.next();
            System.out.println("Ingrese el precio del producto");
            int precio = leer.nextInt();
            productos.put(producto, precio);
            
            do {
                cont=0;
                System.out.println("¿Desea ingresar otro producto? S/N");
                String resp = leer.next();
                if (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("N")) {
                    if (resp.equalsIgnoreCase("N")) {
                        cont++;
                    }
                } else {
                    System.out.println("Respuesta ingresada no valida");
                    System.out.println("Vuelva a intentarlo");
                    cont=5;
                }
            } while (cont==5);
        } while (cont==0);
        mostrar();
    }
    
    public void mostrar(){
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("");
            System.out.println("Producto: " + entry.getKey());
            System.out.println("Precio: " + entry.getValue());
        }
    }
    
    public void modificarPrecio(){
        System.out.println("¿De que producto desea modifiar su precio?");
        String p = leer.next();
        int cont=0;
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(p) ) {
                System.out.println("Ingrese el nuevo precio");
                int precio = leer.nextInt();
                entry.setValue(precio);
                cont = -1;
            }
        }
        
        if (cont == -1) {
            mostrar();
        } else {
            System.out.println("No se encontro el producto");
        }
    }
    
    public void eliminar(){
        System.out.println("¿Que producto desea eliminar?");
        String p = leer.next();
        productos.remove(p);
        mostrar();
    }
    
}
