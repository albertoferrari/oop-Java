package assicurazione;

/**
 * Proprietario di un'automobile
 * @author A.Ferrari
 */
public class Proprietario {
	
	/** cognome */
	private String cognome;
	
	/** nome */
	private String nome;
	
	/** età (sostituire con data di nascita in versione 2.0 */
	private int eta;
	
	/** città di residenza */
	private String citta;

	/**
	 * imposta valori nulli
	 */
	public Proprietario() {
		this("","",0,"");
	}

	/**
	 * @param cognome cognome del proprietario
	 * @param nome nome del proprietario
	 * @param eta (se negativa posta a 0)
	 * @param citta città di residenza
	 */
	public Proprietario(String cognome, String nome, int eta, String citta) {
		this.cognome = cognome;
		this.nome = nome;
		setEta(eta);
		this.citta = citta;
	}

	/**
	 * @return cognome del proprietario
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome del proprietario
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return nome del proprietario
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome del proprietario
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return età
	 */
	public int getEta() {
		return eta;
	}

	/**
	 * @param eta età del proprietario (0 se negativa)
	 */
	public void setEta(int eta) {
		if (eta >0)
			this.eta = eta;
		else
			this.eta = 0;
	}

	/**
	 * @return the citta
	 */
	public String getCitta() {
		return citta;
	}

	/**
	 * @param citta the citta to set
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}

	/**
	 * calcolo tipologia del proprietario
	 * @return tipologia (A,B,C)
	 */
	public char tipologia() {
		String[] blackList = {"Milano","Roma","Napoli","Bologna"};
		for (String c: blackList) {
			if (this.citta.equals(c))
				return 'C';
		}
		if (this.eta<25)
			return 'B';
		return 'A';
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Proprietario [cognome=" + cognome + ", nome=" + nome + ", eta=" + eta + ", citta=" + citta + "]";
	}
	
}
