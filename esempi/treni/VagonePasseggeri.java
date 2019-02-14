package treno;

public class VagonePasseggeri extends Vagone {

	/** numero massimo passeggeri */
	private int numPass;
	
	/**
	 * default 50 passeggeri
	 */
	public VagonePasseggeri() {
		super();
		numPass = 50;
	}

	public VagonePasseggeri(String matricola, double peso, int lunghezza, int numPass) {
		super(matricola, peso, lunghezza);
		this.setNumPass(numPass);
	}

	public int getNumPass() {
		return numPass;
	}

	public void setNumPass(int numPass) {
		this.numPass = Math.abs(numPass);
	}

	/**
	 * peso massimo del vagone
	 * @return peso a pieno carico
	 */
	public double pesoMassimo() {
		return peso + 70 * this.numPass;
	}	
	
	@Override
	public String toString() {
		return super.toString() + " passeggeri=" + numPass;
	}
	
}
