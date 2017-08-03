
public class Diff {
	
	private double funktionswert;
	private double ableitungswert;
	
	private Diff(double funktionswert, double ableitungswert) {
		this.ableitungswert = ableitungswert;
		this.funktionswert = funktionswert;
	}
	
	public static Diff diffVar(double x) {
		
		Diff ausgabe = new Diff(x,1);
		
		return ausgabe;
	}
	
	public static Diff diffConst (double c) {
		
		Diff ausgabe = new Diff(c,0);
		
		return ausgabe;
	}
	
	public double getF() {
		return funktionswert;
	}
	
	public double getDf() {
		return ableitungswert;
	}
}
