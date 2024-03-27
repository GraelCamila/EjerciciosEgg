
package servicio;

import entidad.Cuenta;
import java.util.Scanner;

public class CuentaServicio {
    
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
        Cuenta cuenta = new Cuenta();
        System.out.println("Ingrese su numero de cuenta: ");
        cuenta.setNumCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        cuenta.setDNI(leer.nextInt());
        System.out.println("Ingrese su saldo actual");
        cuenta.setSaldoActual(leer.nextInt());
        return cuenta;
    }
    
    public void ingresar(Cuenta cuenta){
        System.out.println("¿Cuanto desea ingresar?");
        cuenta.setSaldoActual(leer.nextInt()+cuenta.getSaldoActual());
    }
    
    public void retirar(Cuenta cuenta){
        System.out.println("¿Cuanto desea retirar?");
        int re = leer.nextInt();
        if (re > cuenta.getSaldoActual()) {
            System.out.println("El monto ingresado es mayor al saldo actual");
            System.out.println("Solo se retiro " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else {
            System.out.println("La extraccion fue correcta");
            cuenta.setSaldoActual(cuenta.getSaldoActual()-re);
        }
    }
    
    public void extraccionRapida(Cuenta cuenta){
        System.out.println("Se retiro " + (20*cuenta.getSaldoActual())/100);
        cuenta.setSaldoActual((80*cuenta.getSaldoActual())/100);
    }
    
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("Su saldo actual es " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta cuenta){
        System.out.println("Datos de la cuenta:");
        System.out.println("Numero de Cuenta: " + cuenta.getNumCuenta());
        System.out.println("DNI: " + cuenta.getDNI());
        System.out.println("Saldo Actual: " + cuenta.getSaldoActual());
    }
}
