package week2.les3.oefen1;

public class Rekening {

	private int nummer;
	private double saldo;
	private Klant rekeninghouder;

	public Rekening(int nr) {
		nummer = nr;
	}
	
	public void setRekeninghouder(Klant kl){
		rekeninghouder = kl;
	}
	
	public Klant getRekeninghouder(){
		return rekeninghouder;
	}

	public int getNummer() {
		return nummer;
	}

	public double getSaldo() {
		return saldo;
	}

	public void stort(double bedrag) {
		if (bedrag > 0) {
			saldo += bedrag;
		}

		else {
			System.out.println("Voer geen negative waarden in!");
		}
	}

	public void neemOp(double bedrag) {
		if (bedrag > 0) {
			if (saldo - bedrag >= 0) {
				saldo -= bedrag;
			} else {
				System.out.println("U heeft niet genoeg geld op uw rekening!");
			}
		} else {
			System.out.println("Voer geen negative waarden in!");
		}
	}

	public String toString() {
		String s = "Rekening: " + nummer + " heeft een saldo van " + saldo;
		
		if (rekeninghouder == null){
			s = s + " en de rekeninghouder is onbekend";
			
		}
		else {
			s = s + ";\nen de rekening houder is: " + rekeninghouder;
		}
		
		return s;
	}

}