package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PerroyPersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Perro> perros = new ArrayList();
    ArrayList<Persona> personas = new ArrayList();

    public void crearPersona() {
        int n;

        System.out.println("Cuantas personas desea ingresar");
        n = leer.nextInt();

        for (int i = 0; i < n; i++) {
            Persona persona = new Persona();
            System.out.println("Ingrese el nombre de la " + (i + 1) + "° persona");
            persona.setNombre(leer.next());
            System.out.println("Ingrese el apellido de la persona");
            persona.setApellido(leer.next());
            System.out.println("Ingrese su Dni");
            persona.setDNI(leer.nextInt());
            System.out.println("Ingrese la edad");
            persona.setEdad(leer.nextInt());
            personas.add(persona);
            System.out.println("");
        }
    }

    public void crearPerro() {
        System.out.println("Cuantos perros desea ingresar");
        int m = leer.nextInt();
        int cont;

        for (int i = 0; i < m; i++) {
            Perro perro = new Perro();
            System.out.println("Ingrese el nombre del " + (i + 1) + "° perro");
            perro.setNombre(leer.next().toUpperCase());
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
            perros.add(perro);
            System.out.println("");
        }
    }

    public void adopcion() {
        int cont1, cont = 0, cont2, rest;
        int[] c = new int[perros.size()];

        for (int i = 0; i < c.length; i++) {
            c[i] = -5;
        }
        if (perros.size() < personas.size()) {
            rest = perros.size();
        } else {
            rest = personas.size();
        }
        for (int i = 0; i < rest; i++) {
            do {
                cont2 = 0;
                cont1 = 0;
                for (Persona persona : personas) {
                    if (cont1 == i) {
                        System.out.println(persona.getNombre() + ", ingresá el nombre del perro que deseas adoptar");
                    }
                    cont1++;
                }

                for (Perro perro : perros) {
                    System.out.println(perro.getNombre());
                }
                System.out.println("");
                String nombre = leer.next();

                cont1 = 0;
                for (Perro perro : perros) {
                    if (perro.getNombre().equalsIgnoreCase(nombre)) {
                        cont = cont1;
                        cont1--;
                    }
                    cont1++;
                }
                if (cont1 == perros.size()) {
                    System.out.println("Nombre ingresado no valido");
                    System.out.println("Vuelva a intentarlo");
                    System.out.println("");
                    cont2++;
                }
                for (int j = 0; j < perros.size(); j++) {
                    if (c[j] == cont) {
                        System.out.println("El perro solicitado ya fue adoptado");
                        System.out.println("Vuelva a intentarlo");
                        System.out.println("");
                        cont2++;
                    }
                }
            } while (cont2 != 0);
            c[i] = cont;
        }

        for (int i = 0; i < rest; i++) {
            cont1 = 0;
            for (Persona persona : personas) {
                if (cont1 == i) {
                    System.out.println("");
                    System.out.println(persona);
                    System.out.println("ADOPTO A:");
                }
                cont1++;
            }
            cont = 0;
            for (Perro perro : perros) {
                if (c[i] == cont) {
                    System.out.println(perro);
                }
                cont++;
            }
        }

        System.out.println("");
        if (perros.size() > personas.size()) {
            System.out.println("Hay mas perros que personas");
            System.out.println("Quedaron perros sin adoptar:");
            for (int i = 0; i < rest; i++) {
                cont = 0;
                for (Perro perro : perros) {
                    if (c[i] != cont) {
                        System.out.println(perro);
                    }
                    cont++;
                }
            }
            System.out.println("");
        } else if (perros.size() < personas.size()) {
            System.out.println("Hay mas personas que perros a adoptar");
            System.out.println("Personas que quedaron sin poder adoptar un perro:");
            cont = 0;
            for (Persona persona : personas) {
                if (cont >= perros.size()) {
                    System.out.println(persona);
                }
                cont++;
            }
            System.out.println("");
        } else {
            System.out.println("Todos los perros fueron adoptados");
        }
    }
}
