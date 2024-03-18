
package guia4.Extras;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int[] promedio = new int[10];
        int num, suma, aprob=0, desap=0;
        for (int i = 0; i < 10; i++) {
            suma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingresa la nota " + (i+1) + "° nota del " + (j+1) + "° alumno");
                num = leer.nextInt();
                suma += num;
            }
            promedio[i] = suma / 4;
            System.out.println("El promedio del " + (i+1) + "° alumno es " + promedio[i]);
            if (promedio[i] >= 7) {
                aprob++;
            }else{
                desap++;
            }
        }
        System.out.println("Cantidad de alumnos aprobados " + aprob);
        System.out.println("Cantidad de alumnos desaprobados " + desap);
    }
}
