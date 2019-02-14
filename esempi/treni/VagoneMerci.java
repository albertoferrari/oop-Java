package treno;

/**
 * @author cisita
 *
 */
public class VagoneMerci extends Vagone {

	private double caricoMassimo;
	
	public VagoneMerci() {
		super();
		this.caricoMassimo = 0;
	}

	public VagoneMerci(String matricola, double peso, int lunghezza, double caricoMassimo) {
		super(matricola, peso, lunghezza);
		this.setCaricoMassimo(caricoMassimo);
	}

	public double getCaricoMassimo() {
		return caricoMassimo;
	}

	public void setCaricoMassimo(double caricoMassimo) {
		this.caricoMassimo = Math.abs(caricoMassimo);
	}

	/**
	 * peso massimo del vagone
	 * @return peso a pieno carico
	 */
	public double pesoMassimo() {
		return peso + caricoMassimo;
	}
	
	@Override
	public String toString() {
		return super.toString() + " caricoMassimo=" + caricoMassimo;
	}

}
