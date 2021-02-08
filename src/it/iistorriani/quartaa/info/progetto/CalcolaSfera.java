/**
 * @author Bogdan Budei
 *	Classe che prende in input il raggio in cm e calcola area e volume della sfera con lo stesso raggio
 */
package it.iistorriani.quartaa.info.progetto;

public class CalcolaSfera {
	
	private CalcolaSfera() {
		// costruttore privato
	}
	
	public static String calcola(double raggio) {
		double area = (4 * Math.PI * (Math.pow(raggio, 2)));
		double volume = ((4 * Math.PI * (Math.pow(raggio, 3))) / 3);
		return "Sfera: [raggio = " + raggio + "cm] + [area = " + area + "cm²] + [volume = " + volume + "cm³]";
	}
}
