/**
 * @author Somma William
 * Classe che contiene metodo per il gioco della morra cinese
 */
package it.iistorriani.quartaa.info.progetto;

import java.util.Scanner;

public class GiocoMorraCinese {
	
	//costruttore privato
	
	public static void GiocoMC() {
		double numCasuale = (int)(Math.random()*3);
		Scanner tastiera = new 
				Scanner(System.in);
		System.out.println("Inserire scelta (scrivere 'carta', 'sasso' o 'forbici')");
		String scelta = tastiera.next();
		//possibilità
		if(scelta.equals("carta") && numCasuale == 1) {
			System.out.println("carta!");
			System.out.println("PAREGGIO!");
		}
		if(scelta.equals("carta") && numCasuale == 2) {
			System.out.println("sasso!");
			System.out.println("HAI VINTO!");
		}
		if(scelta.equals("carta") && numCasuale == 3) {
			System.out.println("forbici!");
			System.out.println("HAI PERSO!");
		}
		if(scelta.equals("sasso") && numCasuale == 1) {
			System.out.println("carta!");
			System.out.println("HAI PERSO!");
		}
		if(scelta.equals("sasso") && numCasuale == 2) {
			System.out.println("sasso!");
			System.out.println("PAREGGIO!");
		}
		if(scelta.equals("sasso") && numCasuale == 3) {
			System.out.println("forbici!");
			System.out.println("HAI VINTO!");
		}
		if(scelta.equals("forbici") && numCasuale == 1) {
			System.out.println("carta!");
			System.out.println("HAI VINTO!");
		}
		if(scelta.equals("forbici") && numCasuale == 2) {
			System.out.println("sasso!");
			System.out.println("HAI PERSO!");
		}
		if(scelta.equals("forbici") && numCasuale == 3) {
			System.out.println("forbici!");
			System.out.println("PAREGGIO!");
		}
	}
}
