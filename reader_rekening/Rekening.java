package reader_rekening;
public class Rekening {

	private int nummer; // de 2 attributen
	private double saldo;
	
	
	// de constructor
	public Rekening(int nr) {
		nummer = nr;
	}
	
	
	public int getNummer() { return nummer; }
	public double getSaldo() { return saldo; }
	
	
	// "echte" methoden:
	public void stort(double bedrag) {
		if(bedrag<0) {
			System.out.println("Kan geen negatief bedrag storten!");
		} else {
			saldo = saldo + bedrag; // saldonieuw = saldooud + bedrag
		}
	}
	
	
	public void neemOp(double bedrag) {
		if(bedrag<0) {
			System.out.println("Kan geen negatief bedrag opnemen!");
		} else{
			saldo = saldo - bedrag; // saldonieuw = saldooud - bedrag
		}
	}
	
	
	public String toString() {
		String s = "Op rekening " + nummer + " staat " + saldo;
	return s;
	
	}

}