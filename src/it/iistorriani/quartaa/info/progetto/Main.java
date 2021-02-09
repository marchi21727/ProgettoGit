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
            System.out.println("2) Calcola area e volume di una sfera");
            System.out.println("3) Gestore voti");
            System.out.println("4) Gioco morra-cinese (tu VS pc)");
            System.out.println("5) Sasso Carta Forbice");
            System.out.println("5) Opzione 5");
            System.out.println("0) Chiudi programma");
            risp = scan.nextInt();
            switch (risp) {
                case 1:
                    GiocoPunteggio g1 = new GiocoPunteggio();
                    boolean stop = false;
                    while(!stop) {
                        if(g1.isAnnulla()) {
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
                	System.out.println("Inserire il raggio della sfera in cm:");
                	double rag = scan.nextDouble();
                	String ris = CalcolaSfera.calcola(rag);
                	System.out.println(ris);
                    break;
                case 3:

                    break;
                case 4:
                    GiocoMorraCinese.GiocoMC();
                    break;
                case 5:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Sasso Carta Forbice!");

                    //Use a while(true) loop and only break the loop if the user wants to quit
                    while(true) {

                        //Get the user's move through user input
                        System.out.print("Scrivi sasso, carta o forbice per giocare, oppure esci per uscire.");
                        String myMove = in.nextLine();

                        //Check if the user wants to quit the game
                        if(myMove.equals("esci")) {
                            break;
                        }
                        //Check if the user's move is valid (rock, paper, or scissors)
                        if(!myMove.equals("sasso") && !myMove.equals("carta") && !myMove.equals("forbice")) {
                            System.out.println("Invalido riprova");
                        } else {
                            int rand = (int)(Math.random()*3);
                            String opponentMove;
                            if(rand == 0) {
                                opponentMove = "sasso";
                            } else if(rand == 1) {
                                opponentMove = "carta";
                            } else {
                                opponentMove = "forbice";
                            }
                            System.out.println("Mossa dell'avversario: " + opponentMove);

                            if(myMove.equals(opponentMove)) {
                                System.out.println("PAREGGIO");
                            } else if((myMove.equals("sasso") && opponentMove.equals("forbice")) || (myMove.equals("forbice") && opponentMove.equals("carta")) || (myMove.equals("carta") && opponentMove.equals("sasso"))) {
                                System.out.println("HAI VINTO");
                            } else {
                                System.out.println("HAI PERSO");
                            }
                        }
                    }
                    break;
                default: System.out.println("Inserire i numeri richiesti!\n");
            }
        }
        System.out.println("CHIUSURA...");
    }
}
