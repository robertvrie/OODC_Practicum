package practicum3A;

public class Huis {
	
	public String adres;
	public int bouwjaar;
	public Persoon huisbaas;
	
	public Huis(String adr, int bwjr) {
		adres = adr;
		bouwjaar = bwjr;
	}
	
	public void setHuisbaas(Persoon p) {
		huisbaas = p;
	}
	
	public Persoon getHuisbaas() {
		return huisbaas;
	}
	
	public String toString() {
		String s = "Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + huisbaas;
		return s;
	}
}
