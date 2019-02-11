package biblioteca;

/**
 * @author cisita
 *
 */
public class Libro extends Pubblicazione {

	private String autore;
	
	/**
	 * @param autore
	 * @param titolo 
	 * @param data
	 */
	public Libro(String autore, String titolo, String data) {
		super(titolo, data);
		this.autore = autore;
	}

	/**
	 * 
	 */
	public Libro() {
		super();
		autore = "no author";
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	@Override
	public String toString() {
		return "autore=" + autore + " " + super.toString();
	}
	
}
