package articoli_cd;

import java.util.ArrayList;

/**
 * @author cisita
 * negozio
 */
public class Negozio {
	
	/** insieme di articoli presenti in negozio */
	private ArrayList<Articolo> articoli;

	/**
	 * lista articoli vuota
	 */
	public Negozio() {
		articoli = new ArrayList<Articolo>();
	}
	
	/**
	 * aggiunge un articolo all'elenco di articoli
	 * @param a articolo da aggiungere
	 */
	public void aggiungiArticolo(Articolo a) {
		articoli.add(a);
	}
	
	/**
	 * visualizza l'elenco degli articoli presenti in negozio
	 */
	public void visualizza() {
		System.out.println("Articoli presenti in negozio:");
		for (Articolo a: articoli)
			System.out.println(a.toString());
	}
	
	/**
	 * verifica se un articolo è presente in negozio
	 * @param a articolo da cercare
	 * @return true se a è presente in negozio
	 */
	public boolean presente(Articolo a) {
		return articoli.contains(a);
	}
}