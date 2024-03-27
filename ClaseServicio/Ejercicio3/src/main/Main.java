package main;

import entidad.Persona;
import servicio.PersonaServicio;

public class Main {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();

        Persona[] personas = new Persona[4];

        int[] imc = new int[4];
        boolean[] edad = new boolean[4];

        for (int i = 0; i < 4; i++) {
            
            personas[i] = ps.crearPersona();
            imc[i] = ps.calcularIMC(personas[i]);
            edad[i] = ps.esMayorDeEdad(personas[i]);
        }
        
        double contEd=0, contEd1=0, cont1=0,cont2=0,cont3=0;
        
        for (int i = 0; i < 4; i++) {
            switch(imc[i]) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                case 1:
                    cont3++;
                    break;
            }
            
            if (edad[i] == true) {
                contEd++;
            } else {
                contEd1++;
            }
        }
        
        System.out.println("El porcentaje de personas mayores de edad es " + ((contEd/4)*100));
        System.out.println("El porcentaje de personas menores de edad es " + ((contEd1/4)*100));
        System.out.println("El porcentaje de personas debajo de su peso ideal es " + ((cont1/4)*100));
        System.out.println("El porcentaje de personas que se encuentran dentro de su peso ideal es " + ((cont2/4)*100));
        System.out.println("El porcentaje de personas que se encuentran sobre su peso ideal es " + ((cont3/4)*100));
    }
}
