package it.iistorriani.quartaa.info.progetto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource") // per evitare avvertimenti di eclipse nella riga successiva
        Scanner scan = new Scanner(System.in);
        int risp = 1;
        System.out.println("Benvenuto!\n");
        while (risp > 0) {
            System.out.println("MENU:\n");
            System.out.println("1) Gioco punteggio");
            System.out.println("2) Calcola area e volume di una sfera");
            System.out.println("3) Gestore voti");
            System.out.println("4) Gioco morra-cinese (tu VS pc)");
            System.out.println("5) Bot");
            System.out.println("0) Chiudi programma");
            risp = scan.nextInt();
            switch (risp) {
				case 1 : {
                    GiocoPunteggio g1 = new GiocoPunteggio();
                    boolean stop = false;
                    while (!stop) {
                        if (g1.isAnnulla()) {
                            System.out.println("hai perso... :(\n");
                            stop = true;
                        } else {
                            g1.setAnnulla();
                            g1.setPunteggio();
                            if (g1.getPunteggio() > 0 && g1.getPunteggio() < 10) {
                                System.out.println(g1.getPunteggio());
                                System.out.println("Continuare? (1 = Sì, Altro = No)");
                                int i = scan.nextInt();
                                if (i != 1) {
                                    stop = true;
                                }
                            }
                            if (g1.getPunteggio() >= 10) {
                                System.out.println("Hai vinto! ;)\n");
                                stop = true;
                            }
                        }
                    }
                }
				case 2 : {
                    System.out.println("Inserire il raggio della sfera in cm:");
                    double rag = scan.nextDouble();
                    String ris = CalcolaSfera.calcola(rag);
                    System.out.println(ris);
                }
				case 3 : {
                    int[] voti = new int[5];
                    for (int i = 0; i < 5; i++) {
                        voti[i] = scan.nextInt();
                    }
                    GestioneVoti.calcolaMedia(voti);
                }
				case 4 : GiocoMorraCinese.GiocoMC();
				case 5 : {
                    System.out.println("Ciao, sono Bot, parla con me e ti rispoderò");
                    String frase;
                    int i = 1;
                    while (i != 0) {
                        frase = scan.next();
                        switch (frase) {
                            case "ciao" : System.out.println("ciao anche a te! Come va?");
                            break;
                            case "bene" : System.out.println("Sono contento che va tutto bene");
                            break;
                            case "come-va" : System.out.println("Bene, tu?");
                            break;
                            case "arrivederci" : {
                                System.out.println("a presto!");
                                i = 0;
                            }

                            default : System.out.println("Non comprendo ripeti");
                        }
                    }

                }
                default : System.out.println("Inserire i numeri richiesti!\n");
            }
            System.out.println("CHIUSURA...");
        }
    }
}
