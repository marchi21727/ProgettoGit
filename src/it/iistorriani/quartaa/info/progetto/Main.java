/**
 * classe main, l'utente scegliera' tra le opzioni disponibili cosa far fare al programma,
 * tramite un input da tastiera. ogni scelta e' legata a una classe esterna creata da ognuno di noi
 *
 * @author Marchi, Bogdan, Anghel, Ben, Somma
 */
package it.iistorriani.quartaa.info.progetto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int risp = 1;
        System.out.println("Benvenuto!\n");
        while(risp>0){
            System.out.println("MENU:\n");
            System.out.println("1)opzione 1");
            System.out.println("2)opzione 2");
            System.out.println("3)opzione 3");
            System.out.println("4)opzione 4");
            System.out.println("5)opzione 5");
            System.out.println("0)chiudi programma");
            risp = scan.nextInt();

            switch (risp){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default: System.out.println("inserire i numeri richiesti!\n");
            }
        }
        System.out.println("CHIUSURA....");


    }
}
