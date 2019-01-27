package data;

/**
 * @author A.Ferrari
 * data del 2019
 */
public class Data {

	/** giorni trascorsi da inizio anno */
	private int gt;
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
			this.gt = gPassati(giorno, mese);
		} 
		else {
			this.gt = 1;
		}
	}
	
	/**
	 * giorno
	 * @return giorno del mese
	 */
	public int getGiorno() {
		int g = gt;			// giorni da inizio anno
		int m = 0;			// mese (0 gennaio)
		while (g > gm[m]) {	// più giorni di quelli del mese
			g -= gm[m];		// sottrazione giorni del mese
			m = (m +1) % 12;// passaggio a mese successivo
		}
		return g;
	}

	/**
	 * mese
	 * @return numero del mese
	 */
	public int getMese() {
		int g = gt;			// giorni da inizio anno
		int m = 0;			// mese (0 gennaio)
		while (g > gm[m]) {	// più giorni di quelli del mese
			g -= gm[m];		// sottrazione giorni del mese
			m = (m +1) % 12;// passaggio a mese successivo
		}
		return m + 1;
	}

	/**
	 * aggiunge giorni alla data attuale
	 * @param g numero di giorni da aggiungere
	 */
	public void aggiungiGiorni(int g) {
		gt = (gt + g) % 365;
	}
	
	/**
	 * confronto fra date
	 * @param d	data da confrontare
	 * @return true se la data d è precedente
	 */
	public boolean maggiore(Data d) {
		if (this.gt > d.gt)
			return true;
		return false;
	}
	
	/**
	 * differenza date
	 * @param d	data da confrontare
	 * @return numero di giorni fra la data attuale e la data d (sempre positivo)
	 */
	public int differenzaGiorni(Data d) {
		return Math.abs(this.gt-d.gt);
	}
	
	/**
	 * giorni passati dal 01/01
	 * @return numero di giorno dal 01/01
	 */
	private int gPassati(int giorno, int mese) {
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
		int g = (GIORNO_01_01 - 1 + gt) % 7;	
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
		int giorno = getGiorno();
		int mese = getMese();
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
