package geometria;

public class Main {

	public static void main(String[] args) {
		Cerchio c1 = new Cerchio(12);	// il raggio è 12
		System.out.println(c1.circonferenza());
		c1.setRaggio(10);
		System.out.println(c1.area());
		Cerchio c2 = new Cerchio();		// il raggio è 1
		Cerchio c3 = new Cerchio(c1);
		c1.setRaggio(8);
		System.out.println(c3.area());
		Cilindro cil1 = new Cilindro(c1,5);
		System.out.println(cil1);
		System.out.println("volume " + cil1.volume());
		System.out.println("sup. totale " + cil1.supTotale());
	}

}
