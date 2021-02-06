/**
 * il gioco consiste nel partire con un punteggio (0), ad ogni giro puoi decidere se aumentarlo di un numero tra
 * 1 e 3, e c'e' il rischio che si riparta dall'inizio (annulla). Se arrivi a 10 vinci
 *
 * @author Martino Marchi
 */
package it.iistorriani.quartaa.info.progetto;

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
    public int setPunteggio(){
        if(annulla == true){
            this.punteggio = 0;
        }
        else{
            this.punteggio += (int)(Math.random()*3);
        }
        return punteggio;
    }

    public int getPunteggio() {
        return this.punteggio;
    }

    public boolean isAnnulla() {
        return annulla;
    }

}
