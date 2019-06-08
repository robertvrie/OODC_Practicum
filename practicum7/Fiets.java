package practicum7;

import java.time.LocalDate;

public class Fiets extends Voertuig {
	
	public int framenummer;
	int ditJaar = LocalDate.now().getYear();
	
	public Fiets(String tp, double pr, int jr, int fnr) {
		super(tp, pr, jr);
		framenummer = fnr;
		type = tp;
		nieuwprijs = pr;
		bouwjaar = jr;
	}
	
	public double huidigeWaarde() {
		double prijs = 0;
		if(bouwjaar<ditJaar) {
			prijs = (nieuwprijs*0.9);
			return prijs; }
		else{
			return nieuwprijs;
		}
	}
	
	public boolean equals(Object obj) {
		boolean trueFalse = false;
		if(obj instanceof Fiets) {
			Fiets andereFiets = (Fiets) obj;
			if(this.framenummer == andereFiets.framenummer &&
			this.type.equals(andereFiets.type) && 
			this.nieuwprijs.equals(andereFiets.nieuwprijs) &&
			this.bouwjaar == andereFiets.bouwjaar) {
				trueFalse = true;
			}
		}
		return trueFalse;
	}
}
