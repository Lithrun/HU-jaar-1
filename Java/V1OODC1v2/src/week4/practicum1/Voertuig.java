package week4.practicum1;

public abstract class Voertuig implements Goed {

	private String type;
	protected double nieuwprijs;
	protected int bouwjaar;

	public Voertuig(String tp, double pr, int jr) {
		type = tp;
		nieuwprijs = pr;
		bouwjaar = jr;
	}

	public boolean equals(Object andereObject) {
		boolean gelijkeObjecten = false;

		if (andereObject instanceof Voertuig) {

			Voertuig andereVoertuig = (Voertuig) andereObject;

			if (this.type.equals(andereVoertuig.type) && 
					this.nieuwprijs == andereVoertuig.nieuwprijs
					&& this.bouwjaar == andereVoertuig.bouwjaar) {

				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;
	}
	
	public String toString(){
		
		return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: " ;
	}

}
