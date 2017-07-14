package week4.practicum1;
import java.util.*;

public class BedrijfsInventaris {
	
	private String bedrijfsnaam;
	private double budget;
	private ArrayList<Goed> alleGoederen;
	
	public BedrijfsInventaris(String nm, double bud){
		bedrijfsnaam = nm;
		budget = bud;
		alleGoederen = new ArrayList<Goed>();
	}
	
	public void schafAan(Goed g){
		
		boolean gelijk = false;
		
		if (budget >= g.huidigeWaarde()){
			
			budget -= g.huidigeWaarde();
		
			for (Goed goederen : alleGoederen){
				if (g.equals(goederen)){
					gelijk = true;
				}
			}
			
			if (gelijk == false){
				alleGoederen.add(g);
			}
		}	
	}
	
	public String toString(){
		
		
		String s = bedrijfsnaam + " heeft een budget van: €" + budget + "\n";
		for (Goed g : alleGoederen){
			s = s + g + "\n";
		}
		return s;
	}

}