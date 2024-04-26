package main;

import java.util.Scanner;
import perro.Perro;
import persona.Persona;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int cont, n;

        System.out.println("Cuantas personas desea ingresar");
        n = leer.nextInt();
        Persona[] personas = new Persona[n];
        
        for (int i = 0; i < n; i++) {
            Persona persona = new Persona();
            System.out.println("Ingrese el nombre de la "+ (i+1) + "° persona");
            persona.setNombre(leer.next());
            System.out.println("Ingrese el apellido de la persona");
            persona.setApellido(leer.next());
            System.out.println("Ingrese su Dni");
            persona.setDNI(leer.nextInt());
            System.out.println("Ingrese la edad");
            persona.setEdad(leer.nextInt());
            personas[i] = persona;
            System.out.println("");
        }

        System.out.println("Cuantos perros desea ingresar");
        int m = leer.nextInt();
        Perro[] perros = new Perro[m];

        for (int i = 0; i < m; i++) {
            Perro perro = new Perro();
            System.out.println("Ingrese el nombre del " + (i+1) + "° perro");
            perro.setNombre(leer.next());
            System.out.println("Ingrese la raza del perro");
            perro.setRaza(leer.next());
            System.out.println("Ingrese la edad del perro");
            perro.setEdad(leer.nextInt());
            do {
                cont = 0;
                System.out.println("Ingrese el tamaño del perro:");
                System.out.println("P- Pequeño");
                System.out.println("M- Mediano");
                System.out.println("G- Grande");
                String t = leer.next();
                if (t.equalsIgnoreCase("P") || t.equalsIgnoreCase("M") || t.equalsIgnoreCase("G")) {
                    perro.setTamanio(t);
                } else {
                    System.out.println("Respuesta ingresada no valida");
                    System.out.println("Vuelva a intentarlo");
                    cont++;
                }
            } while (cont != 0);
            perros[i] = perro;
            System.out.println("");
        }

        int r, cont1=0;
        int[] ya = new int[m];
        for (int i = 0; i < m; i++) {
            ya[i]=-5;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.println((i + 1) + "° DUEÑO:");
            System.out.println(personas[i]);
            do {
                cont=0;
                r = (int) (Math.random() * m);
                for (int j = 0; j < m; j++) {
                    if (ya[j] == r) {
                        cont++;
                    }
                }
                if (cont==0) {
                    cont1++;
                }
            } while (cont!=0 && cont1<=m);
            ya[i] = r;
            if (cont1==m) {
                i=n;
            }
            System.out.println("PERRO:");
            System.out.println(perros[r]);
        }
        cont=0;
        for (int i = 0; i < m; i++) {
            if (ya[i] == -5) {
                cont++;
            }
        }
        
        if (cont !=0) {
            System.out.println("");
            System.out.println("Quedaron perros sin adoptar");
        } else if (cont1==m) {
            System.out.println("");
            System.out.println("Hay mas personas que perros para adoptar");
        }
        
        
    }
}
