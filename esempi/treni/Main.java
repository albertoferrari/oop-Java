package treno;

public class Main {

	public static void main(String[] args) {
		VagoneMerci vm1 = new VagoneMerci();
		VagonePasseggeri vp1 = new VagonePasseggeri();
		VagoneMerci vm2 = new VagoneMerci("mm02",5600,2200,8500);
		VagonePasseggeri vp2 = new VagonePasseggeri("mp02",5000,2850,66);
		
		Treno t = new Treno();
		t.aggiungi(vm1);
		t.aggiungi(vp1);
		t.aggiungi(vm2);
		t.aggiungi(vp2);
		
		System.out.println(t);
		System.out.println("peso del treno: " + t.pesoTotale() + " Kg");
		System.out.println("lunghezza del treno: " + t.lunghezzaTotale()/100. + " metri");		

	}

}
