package geometria;
/**
 * Cerchio
 * @author cisita
 */
public class Cerchio {
	
	/** raggio del cerchio */
	private double raggio;

	/**
	 * imposta il raggio a 1
	 */
	public Cerchio() {
		this(1);
	}

	/**
	 * @param raggio se negativo valore assoluto
	 */
	public Cerchio(double raggio) {
		setRaggio(raggio);
	}
	
	/**
	 * @param c cerchio da duplicare
	 */
	public Cerchio(Cerchio c) {
		this.raggio = c.raggio;
	}	


	/**
	 * raggio del cerchio
	 * @return raggio
	 */
	public double getRaggio() {
		return raggio;
	}


	/**
	 * imposta il raggio
	 * @param raggio (sempre positivo)
	 */
	public void setRaggio(double raggio) {
		this.raggio = Math.abs(raggio);
	}
	
	/**
	 * circonferenza
	 * @return circonferenza
	 */
	public double circonferenza() {
		return 2 * Math.PI * raggio;
	}
	
	/**
	 * area
	 * @return area
	 */
	public double area() {
		return Math.PI * Math.pow(raggio, 2);
	}


	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + "]";
	}

}
