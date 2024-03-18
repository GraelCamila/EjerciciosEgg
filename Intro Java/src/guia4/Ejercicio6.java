
package guia4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese 9 numeros del 0 al 9");
        int num, cont;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    cont = 0;
                    num = leer.nextInt();
                    if (num >= 0 && num <= 9) {
                        m[i][j] = num;
                    } else {
                        System.out.println("Numero ingresado no valido");
                        System.out.println("Vuelva a intentarlo");
                        cont++;
                    }
                } while (cont!= 0);
            }
        }
        
        System.out.println("");
        System.out.println("Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] < 0) {
                    System.out.print(" |" + m[i][j]);
                } else {
                    System.out.print(" | " + m[i][j]);
                }
            }
            System.out.println("");
        }
        int cont1=0, cont2=0, cont3=0, conth=0, contv=0, contd=0;
        
        //HORIZONTAL:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (i){
                    case 0:
                        cont1 += m[i][j];
                        break;
                    case 1:
                        cont2 += m[i][j];
                        break;
                    case 2:
                        cont3 += m[i][j];
                        break;
                }
            }
        }
        
        //VERTICAL:
        conth = cont1;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        cont1 += m[i][j];
                        break;
                    case 1:
                        cont2 += m[i][j];
                        break;
                    case 2:
                        cont3 += m[i][j];
                        break;
                }
            }
        }
        
        //DIAGONAL:
        contv = cont1;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    contd += m[i][j];
                }
                if (i == 0 && j == 2) {
                    cont1 = m[i][j];
                }
                if (i == 1 && j == 1) {
                    cont2 = m[i][j];
                }
                if (i == 2 && j == 0) {
                    cont3 = m[i][j];
                }
            }
        }

        cont = cont1+cont2+cont3;
        if (conth == contv) {
            if (conth == contd && conth == cont) {
                System.out.println("Es un cuadrado magico");
            } else{
                System.out.println("No es un cuadrado magico porque la suma de los numeros diagonales no son identicas a la suma de los numeros verticales y horizontales");
            }
        } else{
            System.out.println("No es un cuadrado magico porque la suma de los numeros horizontales y verticales no son identicas");
        }
    }
}
