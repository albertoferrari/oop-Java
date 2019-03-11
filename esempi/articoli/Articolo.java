package articoli_cd;

/**
 * @author cisita
 * Generico articolo
 */
public class Articolo {

	/** codice intero >=0 */
	protected int codice;
	
	/** descrizione */
	protected String descrizione;
	
	/** costo intervallo [0..1000] */
	protected double costo;

	/**
	 * valori di default 0,"",0
	 */
	public Articolo() {
		this(0,"",0);
	}

	/**
	 * @param codice 		codice articolo
	 * @param descrizione	descrizione articolo
	 * @param costo			costo articolo
	 */
	public Articolo(int codice, String descrizione, double costo) {
		setCodice(codice);
		this.descrizione = descrizione;
		setCosto(costo);
	}

	/**
	 * @return codice articolo
	 */
	public int getCodice() {
		return codice;
	}

	/**
	 * imposta codice sempre positivo
	 * @param codice codice articolo
	 */
	public void setCodice(int codice) {
		this.codice = Math.abs(codice);
	}

	public double getCosto() {
		return costo;
	}

	/**
	 * imposta costo (0 se non corretto)
	 * @param costo costo articolo
	 */
	private void setCosto(double costo) {
		if (costo >= 0 && costo <= 1000)
			this.costo = costo;
		else
			costo = 0;
	}
	
	/**
	 * aumenta/diminuisce costo
	 * @param percentuale di aumento
	 */
	public void aumentaCosto(int percentuale) {
		setCosto(this.costo + this.costo * percentuale / 100);
	}

	@Override
	public String toString() {
		return "Cod.=" + codice + " Desc.=" + descrizione + " Costo=" + costo + " Euro";
	}

}
