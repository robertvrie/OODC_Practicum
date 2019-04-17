package practicum6A;

import java.time.LocalDate;

public class Game {
	public String naam;
	public int releaseJaar;
	public double nieuwPrijs;
	
	public Game(String nm, int rJ, double nwpr) {
		naam = nm;
		releaseJaar = rJ;
		nieuwPrijs = nwpr;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public double huidigeWaarde() {
		int huidigeJaar = LocalDate.now().getYear();
		int verschil = huidigeJaar - releaseJaar;
		double huidig = 0;
		if(verschil == 1) {
			huidig = nieuwPrijs * .7;
		}
		else if(verschil == 2) {
			huidig = (nieuwPrijs * .7) * .7;
		}
		return huidig;
		
	}	
}
