package biblioteca;

public class Main {

	public static void main(String[] args) {
		Libro l1 = new Libro("Dante","Divina Commedia","02/06/1304");
		Rivista r1 = new Rivista("Java for Dummies","11/02/2019",12);
		Biblioteca b = new Biblioteca();
		b.aggiungi(l1);
		b.aggiungi(r1);
		b.stampa();

	}

}
