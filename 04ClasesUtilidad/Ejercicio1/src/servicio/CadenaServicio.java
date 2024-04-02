
package servicio;

import entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena c;
    public void ingresarFrase(){
        System.out.println("Ingrese la frase");
        String p=leer.next();
        c = new Cadena(p);
    }
    
    public void mostrarVocales(){
        int a=0,e=0,ii=0,o=0,u=0;
        
        
        for (int i = 0; i < c.getLar(); i++) {
            System.out.println(c);
            switch (c.getFrase().substring(i, (i+1))) {
                case "a":
                    a++;
                break;
                case "e":
                    e++;
                break;
                case "i":
                    ii++;
                break;
                case "o":
                    o++;
                break;
                case "u":
                    u++;
                break;
            }
        }
        
        System.out.println("Cantidad de vocales que frase ingresada:");
        System.out.println("A- " + a);
        System.out.println("E- " + e);
        System.out.println("I- " + ii);
        System.out.println("O- " + o);
        System.out.println("U- " + u);
        
        System.out.println("En total la frase tiene " + (a+e+ii+o+u) + " vocales");
        System.out.println("");
    }
    
    public void invertirFrase(){
        String fraseAl="";
        
        for (int i = c.getLar(); i > 0; i--) {
            fraseAl += c.getFrase().substring(i-1, i);
        }
        System.out.println(fraseAl);
        System.out.println("");
    }
    
    public void vecesRepetido(){
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        int cont=0;
        for (int i = 0; i < c.getLar(); i++) {
            if (c.getFrase().substring(i, (i+1)).equals(letra)) {
                cont++;
            }
        }
        
        if (cont >= 2) {
            System.out.println("La letra '" +letra+ "' se repite " + cont+" veces");
        } else if (cont == 1) {
            System.out.println("La letra '" +letra+ "' se repite una sola vez");
        } else {
            System.out.println("La letra ingresada no se encuentra dentro de la frase");
        }
        System.out.println("");
    }
    
    public String compararLongitud(){
        System.out.println("Ingrese una nueva frase");
        String frase = leer.next().toLowerCase();
        
        if (frase.length() < c.getLar()) {
            System.out.println("El largo de la nueva frase ingresada es menor al de la frase anterior");
        } else if (frase.length() > c.getLar()){
            System.out.println("El largo de la nueva frase ingresada es mayor al de la frase anterior");
        } else {
            System.out.println("Ambas frases tienen la misma longitud");
        }
        System.out.println("");
        return frase;
    }
    
    public void unirFrases(){
        c.setFrase(c.getFrase().concat(compararLongitud()));
        System.out.println("Frase final");
        System.out.println(c.getFrase());
        System.out.println("");
        c.setLar(c.getFrase().length());
    }
    
    public void reemplazar(){
        
        System.out.println("Ingresar una letra para reemplazar las 'A'");
        String letra = leer.next();
        String ar="";
        for (int i = 0; i < c.getLar(); i++) {
            if (c.getFrase().substring(i, (i+1)).equals("a")) {
                ar += letra;
            } else {
                ar += c.getFrase().substring(i, (i+1));
            }
        }
        System.out.println("Frase con las 'A' reemplazadas");
        System.out.println(ar);
        System.out.println("");
    }
    
    public void contiene(){
        System.out.println("Ingrese una letra");
        String letra = leer.next().toLowerCase();
        
        int cont=0;
        for (int i = 0; i < c.getLar(); i++) {
            if (c.getFrase().substring(i, (i+1)).equals(letra)) {
                cont++;
            }
        }
        
        if (cont >= 2) {
            System.out.println("La letra '" +letra+ "' se repite " + cont+" veces");
        } else if (cont == 1) {
            System.out.println("La letra '" +letra+ "' se repite una sola vez");
        } else {
            System.out.println("La letra ingresada no se encuentra dentro de la frase");
        }
        System.out.println("");
        
    }
    
}
