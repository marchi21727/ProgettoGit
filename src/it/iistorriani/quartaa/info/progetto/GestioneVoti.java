/** @author Sami Ben
 * Questo Metodo Statico aiuta alla gestione generale dei voti,
 *  senza andare troppo nello specifico nelle materie,
 *  ma a calcolare generalmente una media e dare un feedback del rendimento,
 *  Per questioni di vincolo il gestore DEVE avere 5 voti di imput;
 */
package it.iistorriani.quartaa.info.progetto;

public class GestioneVoti {
    public static void calcolaMedia(int[] voti){
        int media;
        media = (voti[0]+voti[1]+voti[2]+voti[3]+voti[4])/5;
        System.out.println("la media è" + media);
        if(media < 6){
            System.out.println("Stai andando male");

        }
        else
            System.out.println("Stai andando bene");
    }
}
