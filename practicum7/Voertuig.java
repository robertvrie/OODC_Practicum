package practicum7;

public abstract class Voertuig implements Goed {
	public String type;
	protected Double nieuwprijs;
	protected int bouwjaar;
	
	public Voertuig(String tp, double pr, int jr) {
		type = tp;
		nieuwprijs = pr;
		bouwjaar = jr;
	}
	
	public void setType(String t) { type = t; }
	public void setNieuwprijs(double n) { nieuwprijs = n; }
	public void setBouwjaar(int b) { bouwjaar = b; }
	
	public String getType() { return type; }
	public double getNieuwprijs() { return nieuwprijs; }
	public int getBouwjaar() { return bouwjaar; }
	
	public boolean equals(Object obj) {
		boolean trueFalse = false;
		if(obj instanceof Voertuig) {
			Voertuig anderVoertuig = (Voertuig) obj;
			if(this.type.equals(anderVoertuig.type) && 
			this.nieuwprijs.equals(anderVoertuig.nieuwprijs) && 
			this.bouwjaar == anderVoertuig.bouwjaar) {
				trueFalse = true;
			}
		}
		return trueFalse;
	}
	
	public String toString() {
		String s = "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + huidigeWaarde();
		return s;
	}
}
