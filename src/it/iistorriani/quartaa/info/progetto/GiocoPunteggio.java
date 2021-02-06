/**
 * il gioco consiste nel partire con un punteggio (0), ad ogni giro puoi decidere se aumentarlo di un numero tra
 * 1 e 3, e c'e' il rischio che si riparta dall'inizio (annulla). Se arrivi a 10 vinci
 *
 * @author Martino Marchi
 */
package it.iistorriani.quartaa.info.progetto;

import java.util.Objects;
import java.util.Scanner;

public class GiocoPunteggio {
    Scanner scan = new Scanner(System.in);

    private int punteggio;
    private boolean annulla;

    public GiocoPunteggio() {
        this.punteggio = 0;
        this.annulla = false;
    }

    /**
     * tramite una casualita' decido di rimettere il punteggio a 0
     */
    public void setAnnulla (){
        int y = (int) (Math.random() * 10);
        if(y==10){
            this.annulla = true;
        }
    }

    /**
     * il punteggio aumenta casualmente tra 1 e 3, se annulla e' true il punteggio ritorna a 0
     */
    public int getPunteggio(){
        if(annulla == true){
            this.punteggio = 0;
        }
        else{
            this.punteggio += Math.random()*3;
        }
        return punteggio;
    }

    public int gioco(){
        String conferma = "si";
        String stop = "n";
        while(punteggio==0 || punteggio<10) {
                System.out.println(this.getPunteggio());
                if (this.punteggio > 0) {
                    System.out.println("continuare? (n=no, qualsiasi cosa=si)");
                    this.setAnnulla();
                    conferma = scan.nextLine();
                }
                //se arrivo a 10 vinco, di conseguenza formatto tutti i dati
                if(punteggio >= 10){
                    conferma = "n";
                    System.out.println("hai vinto! ;) \n");
                    this.annulla = false;
                    this.punteggio = 0;

                }
                //se 'annulla' e' true il punteggio torna a 0, quindi hai perso
                else {
                    conferma = "n";
                    System.out.println("hai perso :( \n");
                    this.annulla = false;

                }
        }
        return 0;
    }
}
