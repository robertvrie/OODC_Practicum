package practicum2B;

public class Voetbalclub {
	public String naam;
	private int aantalGewonnen;
	private int aantalGelijk;
	private int aantalVerloren;
	
	public Voetbalclub(String nm, int aGew, int aGel, int aVer) {
		naam = nm;
		aantalGewonnen = aGew;
		aantalGelijk = aGel;
		aantalVerloren = aVer;
	}
	
	public String getNaam() { return naam; }
	public int getAantalGewonnen() { return aantalGewonnen; }
	public int getAantalGelijk() { return aantalGelijk; }
	public int getAantalVerloren() { return aantalVerloren; }
	
	public void verwerkResultaat(char ch) {
	    if (ch == 'w')
	      aantalGewonnen = aantalGewonnen + 1;
	    if (ch == 'g')
	      aantalGelijk = aantalGelijk + 1;
	    if (ch == 'v')
	      aantalVerloren = aantalVerloren + 1;
	}
	
	public int aantalGespeeld(){
		int result = aantalGewonnen + aantalGelijk + aantalVerloren;
		return result;
	}
	
	public int aantalPunten() {
		int result = (aantalGewonnen * 3) + aantalGelijk;
		return result;
	}
	
	
	public String toString() {
		String s = naam + "    " + aantalGespeeld() + "  " + aantalGewonnen + "  " + aantalGelijk + "  " + aantalVerloren + "    " + aantalPunten();
		return s;
	}
}
