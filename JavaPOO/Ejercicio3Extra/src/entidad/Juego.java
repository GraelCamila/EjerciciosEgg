
package entidad;

import java.util.Scanner;

public class Juego {
    private int num, ad, inte, gan1;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Juego() {
    }

    public Juego(int num, int ad, int inte, int gan1) {
        this.num = num;
        this.ad = ad;
        this.inte = inte;
        this.gan1 = gan1;
    }

    public int getNum() {
        return num;
    }

    public int getAd() {
        return ad;
    }

    public int getInte() {
        return inte;
    }

    public int getGan1() {
        return gan1;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public void setGan1(int gan1) {
        this.gan1 = gan1;
    }
    
    
    public boolean iniciar_juego(){
        int cont=0;
        gan1=0;
        boolean ret;
        System.out.println("El otro jugador elije el numero a adivinar");
        this.num = leer.nextInt();
        System.out.println("Ingrese la cantidad de intentos");
        this.inte = leer.nextInt();
        do {
            ret = false;
            System.out.println("Intenta adivinar");
            this.ad = leer.nextInt();
            cont++;
            if (this.ad == this.num) {
                System.out.println("Adivinaste!");
                ret = true;
            } else {
                System.out.println("Incorrecto");
                if (this.ad > this.num && cont < this.inte) {
                    System.out.println("Mas bajo");
                } else if (this.ad < this.num && cont < this.inte){
                    System.out.println("Mas alto");
                } else {
                    System.out.println("");
                    System.out.println("Perdiste! El numero era: " + this.num);
                }
            }
            
        } while (cont < this.inte && this.ad != this.num);
        return ret;
    }
    
}
