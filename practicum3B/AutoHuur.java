package practicum3B;

public class AutoHuur {
	public int aantalDagen;
	public Auto gehuurdeAuto;
	public Klant huurder;
	
	public AutoHuur() {};
	
	public void setAantalDagen(int aD) {
		aantalDagen = aD;
	}
	
	public void setGehuurdeAuto(Auto gA) {
		gehuurdeAuto = gA;
	}
	
	public Auto getGehuurdeAuto() {
		return gehuurdeAuto;
	}
	
	public void setHuurder(Klant k) {
		huurder = k;
	}
	
	public Klant getHuurder() {
		return huurder;
	}
	
	public double totaalPrijs() {
		if(gehuurdeAuto==null && huurder==null) {
			aantalDagen = 0;
			return 0;
		}
		double totaalPrijs = (gehuurdeAuto.prijsPerDag * aantalDagen)/100 * (100 - huurder.kortingsPercentage);
		return totaalPrijs;
	}
	
	public String toString() {
		if(gehuurdeAuto==null && huurder==null) {
			String s = "  er is geen auto bekend\n  er is geen huurder bekend  \n  aantal dagen: 0 en dat kost: 0.0";
			return s;
		}
		String s = "  autotype: " + gehuurdeAuto + "\n  " + huurder + "\n  aantaldagen: " + aantalDagen + " en dat kost " + totaalPrijs();
		return s;
	}
}
