package biblioteca;

/**
 * @author cisita
 *
 */
public class Pubblicazione {

	protected String titolo;
	protected String data;
	
	/**
	 * @param titolo titolo pubblicazione
	 * @param data	data pubblicazione (modificare in LocalDate) 
	 */
	public Pubblicazione(String titolo, String data) {
		this.titolo = titolo;
		this.data = data;
	}

	/**
	 * valori default
	 */
	public Pubblicazione() {
		this("no title","01/01/2000");
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "titolo=" + titolo + ", data=" + data;
	}
	
}
