package week4.practicum1;

import java.time.LocalDate;

public class Fiets extends Voertuig {
	
	private int framenummer;
	
	public Fiets(String tp, double pr, int jr, int fnr){
		super(tp,pr,jr);
		framenummer = fnr;
	}
	
	public double huidigeWaarde() {

		int huidigJaar = LocalDate.now().getYear();
		int verschil = huidigJaar - super.bouwjaar;
		double huidigeWaarde = super.nieuwprijs;
		if (verschil > 0) {
			for (int i = 0; i < verschil; i++) {
				huidigeWaarde *= 0.9;
			}
		}
		return Math.round(huidigeWaarde*100.0)/100.0;

	}
	
	public boolean equals(Object andereObject) {
		boolean gelijkeObjecten = false;

		if (andereObject instanceof Fiets) {

			Fiets andereFiets = (Fiets) andereObject;

			if (this.framenummer == andereFiets.framenummer) {

				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
	
	public String toString(){
		
		return super.toString() + huidigeWaarde();
	}

}
