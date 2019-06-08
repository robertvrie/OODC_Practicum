package practicum7;

import java.time.LocalDate;

public class Auto extends Voertuig {
	
	public String kenteken;
	int ditJaar = LocalDate.now().getYear();
	
	public Auto(String tp, double pr, int jr, String kt) {
		super(tp, pr, jr);
		kenteken = kt;
		type = tp;
		nieuwprijs = pr;
		bouwjaar = jr;
	}
	
	public double huidigeWaarde() {
		double prijs = 0;
		if(bouwjaar<ditJaar) {
			prijs = (nieuwprijs*0.7);
			return prijs; }
		else{
			return nieuwprijs;
		}
	}
	
	public boolean equals(Object obj) {
		boolean trueFalse = false;
		if(obj instanceof Auto) {
			Auto andereAuto = (Auto) obj;
			if(this.kenteken.equals(andereAuto.kenteken) &&
			this.type.equals(andereAuto.type) &&
			this.nieuwprijs.equals(andereAuto.nieuwprijs) &&
			this.bouwjaar == andereAuto.bouwjaar) {
				trueFalse = true;
			}
		}
		return trueFalse;
	}
	
}
