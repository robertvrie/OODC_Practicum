package practicum3A;

public class Persoon {
	public String naam;
	public int leeftijd;
	
	public Persoon(String nm, int lft) {
		naam = nm;
		leeftijd = lft;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public int getLeeftijd() {
		return leeftijd;
	}
	
	public String toString() {
		String s = naam + "; leeftijd " + leeftijd + " jaar";
		return s;
	}
}
