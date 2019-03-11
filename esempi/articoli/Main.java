package articoli_cd;

public class Main {

	public static void main(String[] args) {
		// articolo art1 con codice 123, 
		// descrizione “Articolo di esempio” e costo 10 Euro
		Articolo art1 = new Articolo(123,"Articolo di esempio",10);
				
		//	aumenta il costo di art1 del 5% 
		art1.aumentaCosto(5);
		
		//	visualizza art1
		System.out.println(art1.toString());

		
		// compactDisc cd1 formato da 12 tracce con codice 321, descrizione “Canzoni di Natale” e costo di 12 Euro 
		CompactDisc cd1 = new CompactDisc(321,"Canzoni di Natale",12,12);
		
		// diminuisce il costo del 30%
		cd1.aumentaCosto(-30);
		
		// visualizza cd1
		System.out.println(cd1);
		
		// istanzia il Negozio neg 
		Negozio neg = new Negozio();
		
		// aggiunge gli articoli art1 e cd1 in neg
		neg.aggiungiArticolo(art1);
		neg.aggiungiArticolo(cd1);
				
		// visualizza il contenuto del negozio
		neg.visualizza();
		
		CompactDisc cd2 = new CompactDisc();
		if (neg.presente(cd2))
			System.out.println(cd2 + " presente");
		else
			System.out.println(cd2 + " non presente");
	}

}
