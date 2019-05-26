package week1.les1.opdracht3;

public class Student {
	private String naam;
	private String adres;
	private String plaats;
	
	public Student(String nm, String adr, String pl) {
		naam = nm;
		adres = adr;
		plaats = pl;
	}
	//een getter om de objecten op te halen, anders krijg je de referentie waarde
	public String getNaam() { return naam; }
	public String getAdres() { return adres; }
	public String getPlaats() { return plaats; }
	
	//publieke setter
	public void setAdres(String nwAdr) { adres = nwAdr; }
	public void setPlaats(String nwPl) { plaats = nwPl; }
		
	//haal de waarde uit het object dat de getter returned
	public String toString() {
		String s = naam + " woont op " + adres + " in " + plaats;
		return s;
	}
}