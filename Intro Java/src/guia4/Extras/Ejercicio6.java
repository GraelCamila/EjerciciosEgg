package guia4.Extras;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[][] matrizP = new String[20][20];
        String[] pal = new String[5];

        int cont;
        for (int i = 0; i < 5; i++) {
            do {
                cont = 0;
                System.out.println("Ingrese una palabra de minimo 3 caracteres y maximo 5");
                String p = leer.next();
                if (p.length() <= 5 && p.length() >= 3) {
                    pal[i] = p;
                } else {
                    System.out.println("Palabra ingresada no valida");
                    System.out.println("Vuelva a intentarlo");
                    cont++;
                }
            } while (cont != 0);
        }

        int num1;
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                num1 = (int) (Math.random() * 21);
                matrizP[i][j] = "" + num1;
                if (num1 <= 9) {
                    matrizP[i][j] = "  " + num1 + " |";
                } else {
                    matrizP[i][j] = " " + num1 + " |";
                }
            }
        }
        
        int[] vert = new int[5];
        int[] hor = new int[5];
        int menos, num2, b, largo1, largo2;
        cont=0;
        for (int i = 0; i < 5; i++) {
            menos = pal[i].length();
            b = 0;
            largo1 = 0;
            largo2 = 0;
            num1 = (int) (Math.random() * 20);
            num2 = (int) (Math.random() * (20 - menos));
            
            if (i!=0) {
                do {
                    if (vert[b] == num1) {
                        largo1 = (pal[i].length() - 1) + num2;
                        largo2 = (pal[b].length() - 1) + hor[b];
                        if (num2 <= largo2 && num2 >= hor[b]) {
                            num2 = (int) (Math.random() * (20 - menos));
                            cont=1;
                            largo1 = (pal[i].length() - 1) + num2;

                        } else if (largo1 <= largo2 && largo1 >= hor[b]) {
                            num2 = (int) (Math.random() * (20 - menos));
                            cont=1;
                            largo1 = (pal[i].length() - 1) + num2;
                        }
                    }
                    if (cont==1) {
                        b=0;
                    } else {
                        b++;
                    }
                    cont=0;
                } while (b <= 4);
            }
            vert[i] = num1;
            hor[i] = num2;
            
        }
        
        
        int a = 0;
        for (int k = 0; k < 5; k++) {
            cont = pal[k].length();
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (i == vert[k] && j == hor[k]) {
                        do {
                            matrizP[i][j] = "  " + pal[k].substring(a, (a + 1)) + " |";
                            j++;
                            cont--;
                            a++;
                        } while (cont != 0);
                        a = 0;
                    }
                }
            }
        }

        System.out.println("");
        System.out.println("SOPA DE LETRAS");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matrizP[i][j]);
            }
            System.out.println("");
        }
    }
}
