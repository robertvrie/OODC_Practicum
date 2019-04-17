package practicum3B;

public class Auto {
	public String type;
	public double prijsPerDag;
	
	public Auto(String tp, double prPd) {
		type = tp;
		prijsPerDag = prPd;
	}
	
	public void setPrijsPerDag(double prPd) {
		prijsPerDag = prPd;
	}
	
	public double getPrijsPerDag() {
		return prijsPerDag;
	}
	
	public String toString() {
		String s = type + " met prijs per dag: " + prijsPerDag;
		return s;		
	}
}
