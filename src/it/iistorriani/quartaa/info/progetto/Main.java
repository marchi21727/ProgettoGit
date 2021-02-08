/**
 * classe main, l'utente sceglierà tra le opzioni disponibili cosa far fare al programma,
 * tramite un input da tastiera. ogni scelta è legata a una classe esterna creata da ognuno di noi
 *
 * @author Marchi, Budei, Anghel, Ben, Somma
 */
package it.iistorriani.quartaa.info.progetto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource") // per evitare avvertimenti di eclipse nella riga successiva
        Scanner scan = new Scanner(System.in);
        int risp = 1;
        System.out.println("Benvenuto!\n");
        while(risp > 0) {
            System.out.println("MENU:\n");
            System.out.println("1) Gioco punteggio");
            System.out.println("2) Opzione 2");
            System.out.println("3) Opzione 3");
            System.out.println("4) Opzione 4");
            System.out.println("5) Opzione 5");
            System.out.println("0) Chiudi programma");
            risp = scan.nextInt();
            switch (risp) {
                case 1:
                    GiocoPunteggio g1 = new GiocoPunteggio();
                    boolean stop = false;
                    while(stop == false) {
                        if(g1.isAnnulla() == true) {
                            System.out.println("hai perso... :(\n");
                            stop = true;
                        }
                        else {
                            g1.setAnnulla();
                            g1.setPunteggio();
                            if (g1.getPunteggio() > 0 && g1.getPunteggio() < 10) {
                                System.out.println(g1.getPunteggio());
                                System.out.println("Continuare? (1 = Sì, Altro = No)");
                                int i = scan.nextInt();
                                if(i != 1) {
                                    stop = true;
                                }
                            }
                            if(g1.getPunteggio() >= 10) {
                                System.out.println("Hai vinto! ;)\n");
                                stop = true;
                            }
                        }
                    }
                    break;
                case 2:
                	// TODO
                    break;
                case 3:
                	// TODO
                    break;
                case 4:
                	// TODO
                    break;
                case 5:
                	// TODO
                    break;
                default: System.out.println("Inserire i numeri richiesti!\n");
            }
        }
        System.out.println("CHIUSURA...");
    }
}
