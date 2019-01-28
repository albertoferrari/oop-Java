package assicurazione;

public class Main {

	public static void main(String[] args) {
		Proprietario p1,p2,p3;
		p1 = new Proprietario("Bianchi","Aldo",22,"Milano");
		p2 = new Proprietario("Neri","Bruno",32,"Roma");
		p3 = new Proprietario("Verdi","Giuseppe",21,"Parma");	
		Automobile a1,a2,a3,a4;
		a1 = new Automobile(p1,1400,"Fiat Panda");
		a2 = new Automobile(p2,3000,"Ferrari CISITA");
		a3 = new Automobile(p2,1400,"Audi A2");
		a4 = new Automobile(p3,2500,"Mercedes Classe A");
		System.out.println(Assicurazione.costo(a1));
		System.out.println(Assicurazione.costo(a2));
		System.out.println(Assicurazione.costo(a3));
		System.out.println(Assicurazione.costo(a4));		
	}

}
