
package servicio;

import entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ahorcado = new Ahorcado();
    
    public int crearJuego(){
        System.out.println("Ingrese la palabra");
        String pal = leer.next().toUpperCase();
        System.out.println("Ingrese la cantidad de jugadas maximas");
        ahorcado.setCantJugMax(leer.nextInt());
        ahorcado.setN(pal.length());
        String[] p =  new String[ahorcado.getN()];
        for (int i = 0; i < ahorcado.getN(); i++) {
            p[i] = pal.substring(i, (i+1));
        }
        ahorcado.setPalabra(p);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("EMPEZEMOS");
        return ahorcado.getCantJugMax();
    }
    
    public void longitud(){
        System.out.println("");
        System.out.println("La palabra tiene " + ahorcado.getN() + " letras");
    }
    
    public void buscar(String letra){
        int cont1 = 0;
        for (int i = 0; i < ahorcado.getN(); i++) {
            if (letra.equalsIgnoreCase(ahorcado.getPalabra()[i])) {
                cont1++;
            }
        }
        
        if (cont1 == 0) {
            System.out.println("La letra ingresada no se encuentra dentro de la palabra");
        } else {
            System.out.print("La letra se encuentra ");
            ahorcado.setCantLetrasEncon(ahorcado.getCantLetrasEncon()+cont1);
            if (cont1 ==1) {
                System.out.println("una vez dentro de la palabra");
            } else {
                System.out.println(cont1 + " veces dentro de la palabra");
            }
        }
    }
    
    public boolean encontradas(String letra){
        System.out.println("Han sido encontradas " + ahorcado.getCantLetrasEncon() + " letras");
        if (ahorcado.getN() - ahorcado.getCantLetrasEncon() == 0) {
            System.out.println("ENCONTRASTE LA PALABRA");
        } else {
            System.out.println("Faltan " + (ahorcado.getN() - ahorcado.getCantLetrasEncon()) + " letras");
        }
        boolean v = false;
        for (int i = 0; i < ahorcado.getN(); i++) {
            if (letra.equalsIgnoreCase(ahorcado.getPalabra()[i])) {
                v=true;
            }
        }
        return v;
    }
    
    public void intentos(int in){
        ahorcado.setCantJugMax(ahorcado.getCantJugMax()-1);
        System.out.println("Oportunidades: ");
        System.out.println(ahorcado.getCantJugMax() + "/"+in);
        if (ahorcado.getCantJugMax()==0) {
            System.out.println("PERDISTE!!");
            System.out.println("La palabra era ");
            for (int i = 0; i < ahorcado.getN(); i++) {
                System.out.println(ahorcado.getPalabra()[i] + " ");
            }
        }
    }
    
    public void juego(){
        int in = crearJuego();
        String[] d = new String[ahorcado.getN()];
        dibujar1(d);
        longitud();
        do {
            System.out.println("");
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            buscar(letra);
            boolean v=encontradas(letra);
            if (v==false) {
                intentos(in);
            } else {
                dibujar2(letra,d);
                System.out.println("");
            }
        } while (ahorcado.getCantJugMax()!=0 && ahorcado.getN() - ahorcado.getCantLetrasEncon() != 0);
    }
    
    public void dibujar1(String[] d){
        System.out.println("");
        for (int i = 0; i < ahorcado.getN(); i++) {
            d[i] = "_ ";
            System.out.print(d[i]);
        }
        System.out.println("");
    }
    
    public void dibujar2(String letra, String[] d){
        System.out.println("");
        for (int i = 0; i < ahorcado.getN(); i++) {
            if (letra.equalsIgnoreCase(ahorcado.getPalabra()[i])) {
                d[i]=letra + " ";
                System.out.print(d[i]);
            } else {
                System.out.print(d[i]);
            }
        }
        System.out.println("");
    }
}
