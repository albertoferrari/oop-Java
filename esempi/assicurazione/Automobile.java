package assicurazione;

/**
 * Automobile
 * @author A.Ferrari
 *
 */
public class Automobile {

	/** proprietario dell'automobile */
	private Proprietario proprietario;
	
	/** cilindrata dell'automobile */
	private int cilindrata;
	
	/** modello dell'automobile */
	private String modello;

	/**
	 * imposta tutti i valori nulli
	 */
	public Automobile() {
		this(null, 0, "");
	}

	/**
	 * @param proprietario proprietario dell'auto
	 * @param cilindrata cilcindrata (sempre positiva)
	 * @param modello marca e modello
	 */
	public Automobile(Proprietario proprietario, int cilindrata, String modello) {
		this.proprietario = proprietario;
		setCilindrata(cilindrata);
		this.modello = modello;
	}

	/**
	 * @return proprietario dell'auto
	 */
	public Proprietario getProprietario() {
		return proprietario;
	}

	/**
	 * @param proprietario proprietario dell'auto
	 */
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	/**
	 * @return cilindrata
	 */
	public int getCilindrata() {
		return cilindrata;
	}

	/**
	 * @param cilindrata sempre postiva
	 */
	public void setCilindrata(int cilindrata) {
		this.cilindrata = Math.abs(cilindrata);
	}

	/**
	 * @return marca e modello
	 */
	public String getModello() {
		return modello;
	}

	/**
	 * @param modello marca e modello
	 */
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	/**
	 * tipologia auto
	 * @return 'a' con cilindrata <2000 'b' altrimenti
	 */
	public char tipologia() {
		if (cilindrata < 2000)
			return 'a';
		return 'b';
	}
	
}
