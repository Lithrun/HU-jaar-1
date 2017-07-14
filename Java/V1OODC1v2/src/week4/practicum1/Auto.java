package week4.practicum1;

import java.time.LocalDate;

public class Auto extends Voertuig {
	private String kenteken;
	
	public Auto(String tp, double pr, int jr, String kt){
		super(tp, pr, jr);
		kenteken = kt;
	}
	
	public double huidigeWaarde() {

		int huidigJaar = LocalDate.now().getYear();
		int verschil = huidigJaar - super.bouwjaar;
		double huidigeWaarde = super.nieuwprijs;
		if (verschil > 0) {
			for (int i = 0; i < verschil; i++) {
				huidigeWaarde *= 0.7;
			}
		}
		return Math.round(huidigeWaarde*100.0)/100.0;

	}
	
	public boolean equals(Object andereObject) {
		boolean gelijkeObjecten = false;

		if (super.equals(andereObject) && andereObject instanceof Auto) {

			Auto andereAuto = (Auto) andereObject;

			if (this.kenteken.equals(andereAuto.kenteken)) {

				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
	
	public String toString(){
		
		return super.toString() + huidigeWaarde();
	}

}
