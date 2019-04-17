package practicum4;

public class Leerling {
	public String naam;
	public double cijfer;
	
	public Leerling(String nm) {
		naam = nm;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public double getCijfer() {
		return cijfer;
	}
	
	public void setCijfer(double c) {
		cijfer = c;
	}
	
	public String toString() {
		String s = naam + " heeft cijfer: " + cijfer + "\n";
		return s;
	}
}
