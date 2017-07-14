package week4.practicum1;

import java.time.LocalDate;

public class Computer implements Goed {

	private String type;
	private String MacAdres;
	private double aanschafPrijs;
	private int productieJaar;

	public Computer(String tp, String adr, double pr, int jr) {
		type = tp;
		MacAdres = adr;
		aanschafPrijs = pr;
		productieJaar = jr;
	}

	public double huidigeWaarde() {

		int verschil = LocalDate.now().getYear() - productieJaar;
		double huidigeWaarde = aanschafPrijs;
		if (verschil > 0) {
			for (int i = 0; i < verschil; i++) {
				huidigeWaarde *= 0.6;
			}
		}
		return Math.round(huidigeWaarde*100.0)/100.0;

	}
	
	public boolean equals(Object andereObject){
		
		boolean gelijkeObjecten = false;
		
		if (andereObject instanceof Computer){
			
			Computer andereComputer = (Computer) andereObject;
			
			if (
				this.MacAdres.equals(andereComputer.MacAdres)
				)
			gelijkeObjecten = true;
		}
		return gelijkeObjecten;
	}
	
	public String toString(){
		return "Computer: " + type + " heeft een waarde van: " + huidigeWaarde();
	}

}
