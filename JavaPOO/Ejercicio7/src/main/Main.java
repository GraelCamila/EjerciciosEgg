
package main;

import entidad.Persona;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        Persona per3 = new Persona();
        Persona per4 = new Persona();
        
        int[] imc = new int[4];
        boolean[] edad = new boolean[4];
        
        per1.crearPersona();
        imc[0] = per1.calcularIMC();
        edad[0] = per1.esMayorDeEdad();
        
        per2.crearPersona();
        imc[1] = per2.calcularIMC();
        edad[1] = per2.esMayorDeEdad();
        
        per3.crearPersona();
        imc[2] = per3.calcularIMC();
        edad[2] = per3.esMayorDeEdad();
        
        per3.crearPersona();
        imc[3] = per4.calcularIMC();
        edad[3] = per4.esMayorDeEdad();
        
        int contEd=0, contEd1=0, cont1=0,cont2=0,cont3=0;
        
        for (int i = 0; i < 4; i++) {
            switch(imc[i]) {
                case -1:
                    cont1++;
                case 0:
                    cont2++;
                case 1:
                    cont3++;
            }
            
            if (edad[i] == true) {
                contEd++;
            } else {
                contEd1++;
            }
            
        }
        
        System.out.println("El porcentaje de personas mayores de edad es " + ((contEd+4)/100));
        System.out.println("El porcentaje de personas menores de edad es " + ((contEd1+4)/100));
        System.out.println("El porcentaje de personas debajo de su peso ideal es " + ((cont1+4)/100));
        System.out.println("El porcentaje de personas que se encuentran dentro de su peso ideal es " + ((cont2+4)/100));
        System.out.println("El porcentaje de personas que se encuentran sobre su peso ideal es " + ((cont3+4)/100));
    }
}
