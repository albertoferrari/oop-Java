package biblioteca;

import java.util.ArrayList;

/**
 * @author cisita
 *
 */
public class Biblioteca {

	private ArrayList<Pubblicazione> elenco;

	/**
	 * elenco vuoto
	 */
	public Biblioteca() {
		elenco = new ArrayList<Pubblicazione>();
	}
	
	public void aggiungi(Pubblicazione p) {
		elenco.add(p);
	}
	
	public void stampa() {
		for (Pubblicazione p : elenco) {
			System.out.println(p);
		}
	}
}
