
package servicio;

import entidad.Cliente;
import entidad.Cuota;
import entidad.Polizas;
import entidad.Vehiculo;
import enums.Color;
import enums.FormaDePago;
import enums.Tipo;
import enums.TipoCobertura;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class AseguradoraServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cliente GestionDeClientes(){
        
        Cliente c = new Cliente();
        System.out.println("Ingrese el nombre del cliente");
        c.setNombre(leer.next());
        System.out.println("Ingrese el apellido del cliente");
        c.setApellido(leer.next());
        System.out.println("Ingrese su dni");
        c.setDni(leer.nextInt());
        System.out.println("Ingrese su mail");
        c.setMail(leer.next());
        System.out.println("Ingrese su domicilio");
        c.setDomicilio(leer.next());
        System.out.println("Ingrese su telefono");
        c.setTel(leer.nextInt());
        return c;
    }
    
    public Vehiculo GestionDeVehiculos(){

        Vehiculo v = new Vehiculo();
        System.out.println("Ingrese la marca del vehiculo");
        v.setMarca(leer.next());
        System.out.println("Ingrese el modelo");
        v.setModelo(leer.next());
        System.out.println("Ingrese el año de elaboracion del auto");
        v.setAnio(leer.nextInt());
        System.out.println("Ingrese el numero del motor");
        v.setNumMotor(leer.nextInt());
        System.out.println("Ingrese el tipo de chasis");
        v.setChasis(leer.next());
        System.out.println("Ingrese el color del vehiculo:");
        System.out.println("1- Rojo");
        System.out.println("2- Verde");
        System.out.println("3- Blanco");
        System.out.println("4- Negro");
        System.out.println("5- Azul");
        System.out.println("6- Amarillo");
        System.out.println("7- Gris");
        int color = leer.nextInt();
        v.setColor(Color.values()[color-1]);
        System.out.println("Ingrese el tipo del vehiculo");
        System.out.println("1- Sedan");
        System.out.println("2- Camioneta");
        System.out.println("3- TresPuertas");
        int tipo = leer.nextInt();
        v.setTipo(Tipo.values()[tipo-1]);
        return v;
    }
    
    ArrayList<Integer> polizas = new ArrayList();
    Polizas p = new Polizas();
    Cuota c = new  Cuota();
    ArrayList<Integer> pagado = new ArrayList();
    
    public void CrearPoliza(){
        
        p.setCliente(GestionDeClientes());
        p.setVehiculo(GestionDeVehiculos());
        polizas.add(p.getNumPoliza().size()+1);
        pagado.add(0);
        p.setNumPoliza(polizas);
        ArrayList<Integer> cuotas = p.getCantCuotas();
        System.out.println("Numero de poliza:" + p.getNumPoliza().size() + "°");
        System.out.println("Ingrese la fecha de inicio");
        System.out.println("Dia:");
        int d = leer.nextInt();
        System.out.println("Mes:");
        int m = leer.nextInt();
        System.out.println("Año:");
        int a = leer.nextInt();
        p.setFechaInicio(LocalDate.of(a, m, d));
        System.out.println("Ingrese la fecha de fin de la poliza");
        System.out.println("Dia:");
        d = leer.nextInt();
        System.out.println("Mes:");
        m = leer.nextInt();
        System.out.println("Año:");
        a = leer.nextInt();
        p.setFechaFin(LocalDate.of(a, m, d));
        int cuot = Period.between(p.getFechaFin(), p.getFechaInicio()).getMonths();
        cuot = (cuot - cuot) - cuot;
        int y = Period.between(p.getFechaFin(), p.getFechaInicio()).getYears();
        y = (y - y) - y;
        while (y != 0) {
            y--;
            cuot = cuot + 12;
        }
        System.out.println("La cantidad de cuotas a pagar son: " + cuot);
        cuotas.add(cuot);
        p.setCantCuotas(cuotas);
        c.setPagado(pagado);
        System.out.println("Ingrese la forma de pago");
        System.out.println("1- Efectivo");
        System.out.println("2- Debito");
        System.out.println("3- Credito");
        System.out.println("4- Transferencia");
        System.out.println("5- Cheque");
        int pago = leer.nextInt();
        p.setPago(FormaDePago.values()[pago - 1]);
        System.out.println("Ingrese el monto total asegurado");
        p.setMontoTotalAsegurado(leer.nextInt());
        System.out.println("¿Incluye granizo? S/Otro");
        String sn = leer.next();
        if (sn.equalsIgnoreCase("S")) {
            p.setIncluyeGranizo(true);
            System.out.println("Ingrese el monto maximo de granizo asegurado");
            p.setMontoMaxGranizo(leer.nextInt());
        } else {
            p.setIncluyeGranizo(false);
        }
        System.out.println("Ingrese el tipo de cobertura");
        System.out.println("1- Total");
        System.out.println("2- Contra Terceros");
        System.out.println("3- Tecero Completo");
        int tipo = leer.nextInt();
        p.setTipoCobertura(TipoCobertura.values()[tipo-1]);
    }
    
    public void Cuotas(){
        int cont;
        
        System.out.println("Ingrese el numero de poliza");
        int numPol = leer.nextInt();
        
        if (numPol <= p.getNumPoliza().size()) {
            for (Integer pagado : p.getNumPoliza()) {
                if (pagado == numPol) {
                    if (c.getPagado().get(numPol-1) < p.getCantCuotas().get(numPol-1)) {
                        System.out.println("Nombre y apellido del cliente: " + p.getCliente().getNombre()+ p.getCliente().getApellido());
                        c.setNumDeCuota(c.getPagado().get(numPol-1) + 1);
                        System.out.println("Numero de cuota a pagar: " + c.getNumDeCuota() + "°");
                        c.setMontoTotalCuota(p.getMontoTotalAsegurado() / p.getCantCuotas().get(numPol-1));
                        System.out.println("El monto total a pagar por la cuota es: " + c.getMontoTotalCuota());
                        LocalDate v = p.getFechaInicio();
                        int g = v.getMonthValue() + c.getNumDeCuota();
                        cont = 0;
                        if (g > 12) {
                            do {
                                g = g - 12;
                                cont++;
                            } while (g > 12);
                        }
                        v = LocalDate.of(p.getFechaInicio().getYear() + cont, g, p.getFechaInicio().getDayOfMonth());
                        c.setFechaVencimiento(v);
                        System.out.println("Fecha de vencimiento de la cuota: " + c.getFechaVencimiento());
                        System.out.println("Ingrese la forma de pago:");
                        System.out.println("1- EFECTIVO");
                        System.out.println("2- DEBITO");
                        System.out.println("3- TRANDFERENCIA");
                        System.out.println("4- CREDITO");
                        System.out.println("5- CHEQUE");
                        int pago = leer.nextInt();
                        c.setFormaDePago(FormaDePago.values()[pago - 1]);
                        c.getPagado().set(numPol-1, c.getPagado().get(numPol-1) + 1);
                        System.out.println("Cantidad de cuotas pagadas " + c.getPagado().get(numPol-1));
                    } else {
                        System.out.println("La totalidad de la poliza (" + p.getMontoTotalAsegurado() + ") ya fue pagada");
                    }
                }
            }
        } else {
            System.out.println("El numero de poliza ingresado no existe");
        }
    }
}
