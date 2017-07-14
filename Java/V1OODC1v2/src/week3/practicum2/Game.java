package week3.practicum2;

import java.time.LocalDate;

public class Game {
	
	private String naam;
	private int releaseJaar;
	private double nieuwprijs;
	
	public Game(String nm, int rJ, double nwpr) {
		
		naam = nm;
		releaseJaar = rJ;
		nieuwprijs = nwpr;
		
	}
	
	public String getNaam(){
		return naam;
	}
	
	public double huidigeWaarde(){
		
		int verschil = LocalDate.now().getYear() - releaseJaar;
		double waarde = nieuwprijs;
		
		
		for (int i = 0; i < verschil; i++) {
			waarde = waarde * 0.7;
		}
		
		return Math.round(waarde*100.0)/100.0;
	}
	
	public boolean equals(Object andereObject){
		boolean gelijkeObjecten = false;
		
		if (andereObject instanceof Game){
			Game andereGame = (Game) andereObject;
			
			if (this.naam.equals(andereGame.naam) &&
				this.releaseJaar == (andereGame.releaseJaar) &&
				this.nieuwprijs == (andereGame.nieuwprijs)) 
			{
				gelijkeObjecten = true;
			}
		}
		
		return gelijkeObjecten;
		
	}
		
	public String toString(){
		return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + nieuwprijs + " nu voor: " + huidigeWaarde() + "\n";
	}

}
