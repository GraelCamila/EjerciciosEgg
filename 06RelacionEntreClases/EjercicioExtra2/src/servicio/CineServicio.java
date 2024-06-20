
package servicio;

import entidad.Cine;
import entidad.Espectador;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class CineServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cine cine = new Cine();
    ArrayList<Espectador> espectador = new ArrayList();
    ArrayList<Pelicula> pelicula = new ArrayList();
    
    public void espectadorIngresar(){
        int cont, cont1;
        do {
            cont1 = 0;
            cont = 0;
            Espectador es = new Espectador();
            System.out.println("Ingrese el nombre del espectador");
            es.setNombre(leer.next());
            System.out.println("Ingrese su edad");
            es.setEdad(leer.nextInt());
            for (Pelicula pelicula1 : pelicula) {
                if (pelicula1.getTitulo().equalsIgnoreCase(cine.getPelicula())) {
                    if (pelicula1.getEdadMinima() > es.getEdad()) {
                        System.out.println(es.getNombre() + " no supera la edad minima para ver la pelicula");
                        cont1++;
                    }
                }
            }
            if (cont1 == 0) {
                System.out.println("Ingrese la cantidad de dinero disponible");
                es.setDineroDisponible(leer.nextInt());
                if (es.getDineroDisponible() < cine.getPrecioEntrada()) {
                    System.out.println(es.getNombre() + " no posee el dinero suficiente para pagar el precio de la entrada");
                } else {
                    espectador.add(es);
                }
            }
            
            if (espectador.size() >= 8 * 6) {
                System.out.println("Ya se lleno la sala");
                System.out.println("Cantidad de espectadores" + espectador.size());
            } else {
                System.out.println("¿Desea ingresar otro espectador? S/Otro");
                String r = leer.next();
                if (r.equalsIgnoreCase("S")) {
                    cont++;
                }
            }
        } while (cont!=0 && espectador.size() < 8 * 6);
        System.out.println("");
    }
    
    public void crearPelicula(){
        int cont;
        do {
            cont=0;
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            p.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director");
            p.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            p.setDuracion(leer.nextInt());
            System.out.println("Ingrese la edad minima para ver la pelicula");
            p.setEdadMinima(leer.nextInt());
            pelicula.add(p);
            System.out.println("¿Desea seguir ingresando peliculas? S/Otro");
            String r = leer.next();
            if (r.equalsIgnoreCase("S")) {
                cont++;
            }
        } while (cont!=0);
        System.out.println("");
    }
    
    public void elegirPelicula(){
        int cont;
        do {
            cont=0;
            System.out.println("Ingrese el titulo de la pelicula que quiere reproducir");
            System.out.println("Titulos:");
            for (Pelicula pelicula1 : pelicula) {
                System.out.println(pelicula1.getTitulo());
            }
            System.out.println("");
            cine.setPelicula(leer.next());

            for (Pelicula pelicula1 : pelicula) {
                if (cine.getPelicula().equalsIgnoreCase(pelicula1.getTitulo())) {
                    cont--;
                }
                cont++;
            }
            if (cont == pelicula.size()) {
                System.out.println("El titulo ingresado no se encuentra entre la peliculas existentes");
                System.out.println("Vuelva a intentarlo");
                System.out.println("");
            }
        } while (cont == pelicula.size());
        
        System.out.println("Ingrese el precio de las entradas");
        cine.setPrecioEntrada(leer.nextInt());
    }
    public void crearSala(){
        String[][] sala = new String[8][6];
        
        System.out.println("Se creo la sala:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        sala[i][j] = "| " + (i+1) + " F ";
                        break;
                    case 1:
                        sala[i][j] = "| " + (i+1) + " E ";
                        break;
                    case 2:
                        sala[i][j] = "| " + (i+1) + " D ";
                        break;
                    case 3:
                        sala[i][j] = "| " + (i+1) + " C ";
                        break;
                    case 4:
                        sala[i][j] = "| " + (i+1) + " B ";
                        break;
                    case 5:
                        sala[i][j] = "| " + (i+1) + " A ";
                        break;
                }
            }
        }
        cine.setSala(sala);
        
        for (int i = 7; i >= 0; i--) {
            for (int j = 5; j >= 0; j--) {
                System.out.print(sala[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void asientos(){
        String[][] asiento = cine.getSala();
        int a,n,cont1;
        String[][] as = new String[8][6];
        
        for (int i = 0; i < espectador.size(); i++) {
            do {
                cont1=0;
                n = (int) (Math.random() * 8);
                a = (int) (Math.random() * 6);
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < 6; k++) {
                        if (as[n][a] == null) {
                            as[n][a] = "X ";
                            j=8;
                            k=6;
                        } else if (as[n][a].equalsIgnoreCase("X ")) {
                            cont1++;
                            j=8;
                            k=6;
                        }
                    }
                }
            } while (cont1!=0);
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (as[i][j] == null) {
                    as[i][j] = "  ";
                }
            }
        }
        
        System.out.println("Ubicacion final de los espectadores:");
        
        for (int i = 7; i >= 0; i--) {
            for (int j = 5; j >= 0; j--) {
                if (j == 0) {
                    asiento[i][j] = asiento[i][j] + as[i][j] + "|";
                } else {
                    asiento[i][j] = asiento[i][j] + as[i][j];
                }
                System.out.print(asiento[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        cine.setSala(asiento);
    }
}
