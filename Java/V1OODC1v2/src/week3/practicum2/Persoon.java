package week3.practicum2;

import java.util.ArrayList;

public class Persoon {

	private String naam;
	private double budget;
	private ArrayList<Game> mijnGames;

	public Persoon(String nm, double bud) {

		naam = nm;
		budget = bud;
		mijnGames = new ArrayList<Game>();
	}

	public boolean koop(Game g) {
		
		for (Game game : mijnGames) {
			if (game.equals(g)) { // controleer of de game niet al in de list zit
				return false;
			}
		}

		if (budget >= g.huidigeWaarde()) {
			mijnGames.add(g);
			budget -= g.huidigeWaarde();
			return true;
		}

		else {
			return false;
		}

	}

	public boolean verkoop(Game g, Persoon koper) {

		// TO DO

		for (Game game : mijnGames) {
			if (game.equals(g)) { // staat game in de lijst van mijn games
				if (koper.koop(g)) { // Kan de koper de game kopen?
					mijnGames.remove(g);
					budget += g.huidigeWaarde();
					return true;
				}
			}
		}
		return false;

	}
	
	public Game zoekGameOpNaam(String nm){ // practicum 3
		
		
		for (Game game : mijnGames) {
			if (nm.equals(game.getNaam())) {
				return game;
			}
		}
		
		return null;
		
		
	}

	public String toString() {

		String s = naam + " heeft een budget van €" + budget + " en bezit de volgende games: \n";
		for (Game game : mijnGames) {
			s = s + "    " + game;
		}
		return s;

	}
}
