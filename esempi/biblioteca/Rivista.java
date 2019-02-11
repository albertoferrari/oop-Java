package biblioteca;

/**
 * @author cisita
 *
 */
public class Rivista extends Pubblicazione {

	private int numero;
	
	/**
	 * @param titolo
	 * @param data
	 * @param data 
	 */
	public Rivista(String titolo, String data, int numero) {
		super(titolo, data);
		this.numero = numero;
	}

	/**
	 * 
	 */
	public Rivista() {
		super();
		numero = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() + "  numero=" + numero;
	}

	
}
