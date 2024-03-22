
package entidad;

import java.util.Scanner;

public class Cuenta {
    private int numCuenta, DNI, saldoActual;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int DNI, int saldoActual) {
        this.numCuenta = numCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    
    public void crearCuenta(){
        System.out.println("Ingrese su numero de cuenta: ");
        this.numCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        this.DNI = leer.nextInt();
        System.out.println("Ingrese su saldo actual");
        this.saldoActual = leer.nextInt();
    }
    
    public void ingresar(){
        System.out.println("¿Cuanto desea ingresar?");
        int in = leer.nextInt();
        this.saldoActual += in;
    }
    
    public void retirar(){
        System.out.println("¿Cuanto desea retirar?");
        int re = leer.nextInt();
        if (re > this.saldoActual) {
            System.out.println("El monto ingresado es mayor al saldo actual " + this.saldoActual);
            System.out.println("Solo se retiro " + (re - this.saldoActual));
            this.saldoActual = 0;
        } else {
            this.saldoActual -= re;
        }
    }
    
    public void extraccionRapida(){
        System.out.println("No puede retirar mas del 20% de su saldo actual");
        System.out.println("Ingrese cuanto desea retirar: ");
        int re = leer.nextInt();
        if (re > (re*this.saldoActual)/100) {
            System.out.println("El monto ingresado supera el 20% de su saldo actual");
            System.out.println("Se ah retirado " + (re-this.saldoActual));
             this.saldoActual -= re;
            System.out.println("Su saldo actual es " + this.saldoActual);
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es " + this.saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("Datos de la cuenta:");
        System.out.println("Numero de Cuenta: " + this.numCuenta);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Saldo Actual: " + this.saldoActual);
    }
}
