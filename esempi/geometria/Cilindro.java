package geometria;

/**
 * Cilindro (composizione)
 * @author cisita
 *
 */
public class Cilindro {

	private Cerchio base;
	private double altezza;
	
	
	
	/**
	 * altezza 1
	 */
	public Cilindro() {
		this(new Cerchio(), 1);
	}

	/**
	 * @param base del cilindro
	 * @param altezza del cilindro
	 */
	public Cilindro(Cerchio base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public Cerchio getBase() {
		return base;
	}

	public void setBase(Cerchio base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double supTotale() {
		return base.area() * 2 + base.circonferenza() * altezza;
	}
	
	public double volume() {
		return base.area() * altezza;
	}
	
	@Override
	public String toString() {
		return "Cilindro [base=" + base + ", altezza=" + altezza + "]";
	}
	
	
}
