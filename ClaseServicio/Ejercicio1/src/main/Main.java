
package main;

import entidad.Cuenta;
import java.util.Scanner;
import servicio.CuentaServicio;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CuentaServicio cs = new CuentaServicio();
        
        Cuenta cuenta1 = cs.crearCuenta();
        
        int op, cont=0;
        
        do {
            System.out.println("");
            System.out.println("1- Ingresar");
            System.out.println("2- Retirar");
            System.out.println("3- Extraccion rapida");
            System.out.println("4- Consultar saldo");
            System.out.println("5- Consultar datos");
            System.out.println("6- Salir");
            op = leer.nextInt();
            switch(op){
                case 1:
                    cs.ingresar(cuenta1);
                    break;
                case 2:
                    cs.retirar(cuenta1);
                    break;
                case 3:
                    cs.extraccionRapida(cuenta1);
                    break;
                case 4:
                    cs.consultarSaldo(cuenta1);
                    break;
                case 5:
                    cs.consultarDatos(cuenta1);
                    break;
                case 6:
                    cont++;
                    break;
                default:
                    System.out.println("Opcion ingresada no valida");
            }
        } while (cont==0);
        
        
    }
}
