
public class DiffTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wertX = 18;
	}
	
	public Diff f(double x) {
		
		double f = x*(4+x)/(3-x);
		double fstrich = ((-2)*x-x*x+12)/(9-6*x+x*x);
		
		Diff ausgabe = Diff.diffVar(f);
		
		return ausgabe;
				
	}

}
