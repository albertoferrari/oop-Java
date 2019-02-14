package treno;

/**
 * @author cisita
 * vagone standard
 */
public class Vagone {

	/** matricola vagone*/
	protected String matricola;
	/** peso in Kg */
	protected double peso;
	/** lunghezza in cm */
	protected int lunghezza;
	
	/**
	 * matricola "m00", peso 4500 Kg., lunghezza 1800 cm
	 */
	public Vagone() {
		this("m00",4500,1800);
	}

	/**
	 * @param matricola matricola in formato mxxx
	 * @param peso peso in kg
	 * @param lunghezza lunghezza in cm
	 */
	public Vagone(String matricola, double peso, int lunghezza) {
		this.setMatricola(matricola);
		this.setPeso(peso);
		this.setLunghezza(lunghezza);
	}

	/**
	 * 
	 * @return matricola del treno
	 */
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = Math.abs(peso);
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = Math.abs(lunghezza);
	}

	@Override
	public String toString() {
		return "matricola=" + matricola + ", peso=" + peso + ", lunghezza=" + lunghezza;
	}
	
	/**
	 * peso massimo del vagone
	 * @return peso a pieno carico
	 */
	public double pesoMassimo() {
		return peso;
	}	
}
