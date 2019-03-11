package articoli_cd;

/**
 * @author cisita
 * compact disc
 */
public class CompactDisc extends Articolo {

	/** numero di tracce del CD */
	private int numTracce;

	/**
	 * @return numero di tracce del CD
	 */
	public int getNumTracce() {
		return numTracce;
	}
	
	/**
	 * imposta a 0 il numero di tracce
	 */
	public CompactDisc() {
		super();
		this.numTracce = 0;
	}

	/**
	 * @param numTracce
	 */
	public CompactDisc(int codice, String descrizione, double costo, int numTracce) {
		super(codice, descrizione, costo);
		setNumTracce(numTracce);
	}

	/**
	 * imposta numero di tracce
	 * @param numTracce se negativo imposta a 0
	 */
	public void setNumTracce(int numTracce) {
		if (numTracce >= 0)
			this.numTracce = numTracce;
		else
			this.numTracce = 0;
	}

	@Override
	public String toString() {
		return super.toString() + " - Cd con " + numTracce + " tracce";
	}
	
}