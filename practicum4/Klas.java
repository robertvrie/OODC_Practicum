package practicum4;
import java.util.ArrayList;

public class Klas {
	public String klasCode;
	public ArrayList<Leerling> deLeerlingen;
	
	public Klas(String kC){
		klasCode = kC;
		deLeerlingen = new ArrayList<Leerling>();
	}
	
	public void voegLeerlingToe(Leerling l) {
		deLeerlingen.add(l);
		deLeerlingen.get(0);
	}
	
	public void wijzigCijfer(String nm, double nweCijfer) {
		for (Leerling l: deLeerlingen) {
	        String naam = l.getNaam();
	        if(naam.contentEquals(nm)) {
	        	l.setCijfer(nweCijfer);
	        }
	    }
	}
	
	public ArrayList<Leerling> getLeerlingen() {
		return deLeerlingen;
	}
	
	public int aantalLeerlingen() {
		int i = 0;
		for(Leerling l : deLeerlingen) {
			i++;
		}
		return i;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("In klas " + klasCode + " zitten de volgende leerlingen:\n");
		
		for (Leerling l : deLeerlingen) {
			s.append(l);
		}
		
		return s.toString();
	}
}
