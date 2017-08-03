
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
	
	public Diff plus (Diff v) {
		
		Diff ausgabe = new Diff((this.getF() + v.getF()) , (this.getDf() + v.getDf()));
		return ausgabe;
		
	}
	public Diff minus (Diff v) {
	
		Diff ausgabe = new Diff((this.getF() - v.getF()) , (this.getDf() - v.getDf()));
		return ausgabe;
	}
	public Diff times (Diff v) {
		
		Diff ausgabe = new Diff((this.getF() * v.getF()) , (this.getF() * v.getDf() + this.getDf() * v.getF()));
		return ausgabe;
		
	}
	public Diff divby (Diff v) {
		
		Diff ausgabe = new Diff((this.getF() / v.getF()) , ((this.getDf() - this.getF() * v.getDf()) / v.getF()));
		return ausgabe;
		
	}
	
	public double getF() {
		return funktionswert;
	}
	
	public double getDf() {
		return ableitungswert;
	}
}
