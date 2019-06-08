package practicum7;

import java.time.LocalDate;

public class Computer implements Goed{
	public String type;
	public String macAdres;
	public Double aanschafPrijs;
	public int productieJaar;
	int ditJaar = LocalDate.now().getYear();
	
	public Computer(String tp, String adr, double pr, int jr) {
		type = tp;
		macAdres = adr;
		aanschafPrijs = pr;
		productieJaar = jr;
	}
	
	public double huidigeWaarde() {
		double prijs = 0;
		if(productieJaar<ditJaar) {
			prijs = (aanschafPrijs*0.6);
			return prijs;}
		else {
			return aanschafPrijs;
		}
	}
	
	public boolean equals(Object obj) {
		boolean trueFalse = false;
		if(obj instanceof Computer) {
			Computer andereComputer = (Computer) obj;
			if(this.type.equals(andereComputer.type) &&
			this.macAdres.equals(andereComputer.macAdres) && 
			this.aanschafPrijs.equals(andereComputer.aanschafPrijs) && 
			this.productieJaar == andereComputer.productieJaar) {
				trueFalse = true;
			}
		}
		return trueFalse;
	}
	
	public String toString(){
		String s = "Computer: HP " + type + " heeft een waarde van: €" + huidigeWaarde();
		return s;
	}
}