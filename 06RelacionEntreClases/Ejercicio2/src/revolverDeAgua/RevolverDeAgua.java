
package revolverDeAgua;
import java.util.Random;
import java.util.Scanner;

public class RevolverDeAgua {
    
    private int posActual, posAgua;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Random random = new Random();
    
    public void llenarRevolver(){
        posActual = random.nextInt(6);
        posAgua = random.nextInt(6);
        System.out.println("posActual:" + posActual);
        System.out.println("posAgua: " + posAgua);
    }
    
    public boolean mojar(){
        return posAgua == posActual;
    }
    
    public void siguienteChorro(){
        if (posActual == 5) {
            posActual = 0;
        } else {
            posActual = posActual+1;
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + ", leer=" + leer + '}';
    }
    
}
