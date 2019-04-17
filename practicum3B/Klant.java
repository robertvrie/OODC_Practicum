package practicum3B;

public class Klant {
	public String naam;
	public double kortingsPercentage;
	
	public Klant(String nm) {
		naam = nm;
	}
	
	public void setKorting(double kP) {
		kortingsPercentage = kP;
	}
	
	public double getKorting() {
		return kortingsPercentage;
	}
	
	public String toString() {
		if(naam==null) {
			String s = "er is nog geen huurder bekend/n";
			kortingsPercentage = 0;
			return s;
		} else {
			String s = "op naam van: " + naam + " (" + kortingsPercentage + ")";
			return s;
		}
	}
}
