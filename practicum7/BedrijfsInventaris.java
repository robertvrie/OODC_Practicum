package practicum7;

import java.util.ArrayList;

public class BedrijfsInventaris {
	public String bedrijfsNaam;
	public double budget;
	ArrayList<Goed> alleGoederen = new ArrayList<Goed>();
	
	public BedrijfsInventaris(String nm, double bud) {
		bedrijfsNaam = nm;
		budget = bud;
	}
	
	public void schafAan(Goed g) {
		if(!alleGoederen.contains(g)) {
			alleGoederen.add(g);
			budget = budget - g.huidigeWaarde();
		}
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("HU met inventaris:\n");
		
		for(Goed g : alleGoederen) {
			s.append(g + "\n");
		}
		
		return s.toString();
	}
}