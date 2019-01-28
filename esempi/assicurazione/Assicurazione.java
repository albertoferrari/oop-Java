package assicurazione;

public class Assicurazione {
	public static double costo(Automobile a) {
		double c;
		if (a.tipologia() == 'a')
			c = 200;
		else
			c = 250;
		if (a.getProprietario().tipologia() == 'C')
			c = c * 1.25;
		else if (a.getProprietario().tipologia() == 'B')
			c = c * 1.2;
		return c;
	}
}
