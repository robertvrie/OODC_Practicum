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
			boolean i = false;
			if(i == g.getNaam().contentEquals(game.getNaam())) {
				if(koper.budget >= g.huidigeWaarde()) {
					koperHeeftGameNietEnGenoegBudget = true;
				}
			}
		}
		
		if(verkoperHeeftGame == true && koperHeeftGameNietEnGenoegBudget == true) {
			kanVerkopen = true;
			mijnGames.remove(g);
			koper.mijnGames.add(g);
			koper.budget = budget - g.huidigeWaarde();
			budget = budget + g.huidigeWaarde();
		}
		return kanVerkopen;
		
	}
	
	public String toString() {
		String s = "";
		return s.toString();
	}
}