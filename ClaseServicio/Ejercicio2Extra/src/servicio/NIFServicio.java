
package servicio;

import entidad.NIF;
import java.util.Scanner;

public class NIFServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNif(){
        NIF nif = new NIF();
        
        System.out.println("Ingrese su DNI");
        nif.setDNIs(leer.nextInt());
        switch(nif.getDNIs()%23){
            case 0:
                nif.setLetra('T');
                break;
            case 1:
                nif.setLetra('R');
                break;
            case 2:
                nif.setLetra('W');
                break;
            case 3:
                nif.setLetra('A');
                break;
            case 4:
                nif.setLetra('G');
                break;
            case 5:
                nif.setLetra('M');
                break;
            case 6:
                nif.setLetra('Y');
                break;
            case 7:
                nif.setLetra('F');
                break;
            case 8:
                nif.setLetra('P');
                break;
            case 9:
                nif.setLetra('D');
                break;
            case 10:
                nif.setLetra('X');
                break;
            case 11:
                nif.setLetra('B');
                break;
            case 12:
                nif.setLetra('N');
                break;
            case 13:
                nif.setLetra('J');
                break;
            case 14:
                nif.setLetra('Z');
                break;
            case 15:
                nif.setLetra('S');
                break;
            case 16:
                nif.setLetra('Q');
                break;
            case 17:
                nif.setLetra('V');
                break;
            case 18:
                nif.setLetra('H');
                break;
            case 19:
                nif.setLetra('L');
                break;
            case 20:
                nif.setLetra('C');
                break;
            case 21:
                nif.setLetra('K');
                break;
            default:
                nif.setLetra('E');
                break; 
        }
        return nif;
    }
    
    public void mostrar(NIF nif){
        System.out.println(nif.getDNIs() + "-" + nif.getLetra());
    }
}
