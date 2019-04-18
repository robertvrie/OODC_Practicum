package practicum6A;

import java.util.ArrayList;

import practicum4.Leerling;

public class Persoon {
	public String naam;
	public double budget;
	public ArrayList<Game> mijnGames;


	public Persoon(String nm, double bud) {
		naam = nm;
		budget = bud;
		mijnGames = new ArrayList<Game>();
	}
	
	public boolean koop(Game g) {
		boolean jaNee = false;
		boolean dubbel = true;
		boolean genoegBudget = true;
		for(Game game : mijnGames) {
			if(g.getNaam().contentEquals(game.getNaam())) {
				dubbel = false;
			}
		}
		if(budget < g.huidigeWaarde()) {
			genoegBudget = false;
		}
		if(dubbel == true && genoegBudget == true) {
			jaNee = true;
			mijnGames.add(g);
			budget = budget - g.huidigeWaarde();
		}
		return jaNee;
	}
	
	public boolean verkoop(Game g, Persoon koper) {
		boolean kanVerkopen = false;
		boolean verkoperHeeftGame = false;
		boolean koperHeeftGameNietEnGenoegBudget = false;
		for(Game game : mijnGames) {
			if(g.getNaam().contentEquals(game.getNaam())) {
				verkoperHeeftGame = true;
			}
		}
		
		for(Game game : koper.mijnGames) {
			if(g.getNaam().contentEquals(game.getNaam())) {
				break;
			}
			else {
				if(koper.budget >= g.huidigeWaarde()) {
					koperHeeftGameNietEnGenoegBudget = true;
					break;
				}
			}
		}
		
		if(verkoperHeeftGame == true && koperHeeftGameNietEnGenoegBudget == true) {
			mijnGames.remove(g);
			koper.mijnGames.add(g);
			koper.budget = koper.budget - g.huidigeWaarde();
			budget = budget + g.huidigeWaarde();
			kanVerkopen = true;
		}
		return kanVerkopen;
		
	}
	
	Game zoekGameOpNaam(String gameNaam) {
		Game gelijk = null;
		for(Game g : mijnGames) {
			if(gameNaam.equals(g.getNaam())) {
				gelijk = g;
			}
		}
		return gelijk;
		
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:\n	");
		for(Game g : mijnGames) {
			s.append(g.getNaam() + ", uitgegeven in 2014; nieuwprijs: " + g.nieuwPrijs + " nu voor: " + String.format("%.2f", g.huidigeWaarde()) + "\n	");
		}
		return s.toString();
	}
}