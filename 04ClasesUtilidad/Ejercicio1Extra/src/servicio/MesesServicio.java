
package servicio;

import entidad.Meses;
import java.util.Scanner;

public class MesesServicio {
    
    Meses meses = new Meses();
    
    public void asignarMeses(){
        meses.getMeses()[0] = "Enero";
        meses.getMeses()[1] = "Febrero";
        meses.getMeses()[2] = "Marzo";
        meses.getMeses()[3] = "Abril";
        meses.getMeses()[4] = "Mayo";
        meses.getMeses()[5] = "Junio";
        meses.getMeses()[6] = "Julio";
        meses.getMeses()[7] = "Agosto";
        meses.getMeses()[8] = "Septiembre";
        meses.getMeses()[9] = "Octubre";
        meses.getMeses()[10] = "Noviembre";
        meses.getMeses()[11] = "Diciembre";
    }
    
    public void asignarSecreto(){
        meses.setMesSecreto(meses.getMeses()[9]);
    }
    
    public void preguntar(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cont;
        do {
            cont=0;
            System.out.println("Adivina el mes secreto:");
            String adivinar = leer.next();
            if (adivinar.equalsIgnoreCase(meses.getMesSecreto())) {
                System.out.println("ADIVINASTE!!");
            } else {
                System.out.println("No es...");
                System.out.println("Volve a intentarlo");
                cont++;
            }
        } while (cont!=0);     
    }
}
