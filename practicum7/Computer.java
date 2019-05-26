package practicum7;

import java.time.LocalDate;

public class Computer {
	public String type;
	public String macAdres;
	public double aanschafPrijs;
	public int aanschafJaar;
	int ditJaar = LocalDate.now().getYear();
	
	public Computer(String tp, String adr, double pr, int jr) {
		type = tp;
		macAdres = adr;
		aanschafPrijs = pr;
		aanschafJaar = jr;
	}
	
	public double huidigeWaarde() {
		double prijs = 0;
		if(aanschafJaar<ditJaar) {
			prijs = (aanschafJaar*0.6);}
		System.out.println(prijs);
		return prijs;
	}
	
	public String toString(){
		String s = "Computer: HP " + type + " heeft een waarde van: €" , huidigeWaarde;
		return s;
	}
}
