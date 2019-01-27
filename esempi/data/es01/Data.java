package data;

/**
 * @author A.Ferrari
 * data del 2019
 */
public class Data {

	private int giorno;
	private int mese;
	/** numero di giorni dei vari mesi */
	private int[] gm = {31,28,31,30,31,30,31,31,30,31,30,31};
	/** giorno della settimana */
	private String[] gs = {"lun","mar","mer","gio","ven","sab","dom"};
	/** giorno della settimana del 1 gennaio */
	private int GIORNO_01_01 = 1;	// nel 2019 martedì
	
	/**
	 * default 01/01
	 */
	public Data() {
		this(1,1);
	}
	
	/**
	 * se dati non corretti default 01/01
	 * @param giorno giorno da impostare
	 * @param mese	 mese da impostare
	 */
	public Data(int giorno, int mese) {
		if (corretti(giorno, mese)) {
			this.giorno = giorno;
			this.mese = mese;
		} 
		else {
			this.giorno = 1;
			this.mese = 1;
		}
	}
	
	/**
	 * giorno
	 * @return giorno del mese
	 */	
	public int getGiorno() {
		return giorno;
	}

	/**
	 * mese
	 * @return numero del mese
	 */
	public int getMese() {
		return mese;
	}

	/**
	 * aggiunge giorni alla data attuale
	 * @param g numero di giorni da aggiungere
	 */
	public void aggiungiGiorni(int g) {
		giorno += g;
		int m = mese - 1;
		while (giorno > gm[m]) {
			giorno -= gm[m];
			m = (m + 1) % 12;
		}
		mese = m + 1;
	}

	/**
	 * confronto fra date
	 * @param d	data da confrontare
	 * @return true se la data d è precedente
	 */	
	public boolean maggiore(Data d) {
		if (this.mese > d.mese)
			return true;
		if (this.mese == d.mese && this.giorno > d.giorno)
			return true;
		return false;
	}

	/**
	 * differenza date
	 * @param d	data da confrontare
	 * @return numero di giorni fra la data attuale e la data d (sempre positivo)
	 */
	public int differenzaGiorni(Data d) {
		return Math.abs(this.gPassati()-d.gPassati());
	}
	
	/**
	 * giorni passati dal 01/01
	 * @return numero di giorno dal 01/01
	 */
	private int gPassati() {
		int gp = giorno;
		for (int m=0; m<mese-1; m++) {
			gp += gm[m];
		}
		return gp;
	}
	
	/**
	 * giorno della settimana
	 * @return giorno della settimana
	 */
	public String giornoSettimana() {
		int g = (GIORNO_01_01 - 1 + gPassati()) % 7;	
		return gs[g];
	}
	
	/**
	 * verifica la correttezza di una data
	 * @param g	giorno
	 * @param m	mese
	 * @return true se data corretta
	 */
	private boolean corretti(int g, int m) {
		if (m<1 || m>12)
			return false;
		if (g<1 || g>gm[m-1])
			return false;
		return true;
	}
	
	/**
	 * rappresentazione nel formato gg/mm
	 */
	public String toString() {
		String s = "";
		if (giorno<10)
			s += "0";
		s = s + giorno + "/";
		if (mese<10)
			s += "0";
		s += mese;
		return s;
	}
	
}
