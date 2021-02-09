/** @author Sami Ben
 * Questo Metodo Statico aiuta alla gestione generale dei voti,
 *  senza andare troppo nello specifico nelle materie,
 *  ma a calcolare generalmente una media e dare un feedback del rendimento,
 *  Per questioni di vincolo il gestore DEVE avere 5 voti di imput;
 */
package it.iistorriani.quartaa.info.progetto;

public class GestioneVoti {
    String calcolaMedia(int votoUno, int votoDue, int votoTre, int votoQuattro, int votoCinque){
        int media;
        media = (votoUno + votoDue + votoTre + votoQuattro + votoCinque)/5;
        return "la media è" + media;
        if(media < 6){
            return "Stai andando male";
        }
        if(media > 5){
            return "Stai andando bene";
        }
    }
}
