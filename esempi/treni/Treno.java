package treno;

import java.util.ArrayList;

/**
 * @author cisita
 * treno con vagoni merci e passeggeri
 */
public class Treno {

	private ArrayList<Vagone> vagoni;
	
	public Treno() {
		vagoni = new ArrayList<Vagone>();
	}

	public void aggiungi(Vagone v) {
		vagoni.add(v);
	}
	
	public double pesoTotale() {
		double pt = 0;
		for (Vagone v: vagoni)
			pt += v.pesoMassimo();
		return pt;
	}
	
	public int lunghezzaTotale() {
		int lt = 0;
		for (Vagone v: vagoni)
			lt += v.lunghezza;
		return lt;
	}

	@Override
	public String toString() {
		String s = "Composizione treno:\n";
		for (Vagone v: vagoni)
			s += v.toString() + "\n";
		return s;
	}
	
	
}
