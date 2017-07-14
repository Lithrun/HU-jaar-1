package week2.practicum2;

public class AutoHuur {
	private int aantalDagen;
	private Klant huurder;
	private Auto gehuurdeAuto;

	public AutoHuur() {

	}

	public void setAantalDagen(int aD) {
		aantalDagen = aD;
	}

	public void setGehuurdeAuto(Auto gA) {
		gehuurdeAuto = gA;
	}

	public Auto getGehuurdeAuto() {
		return gehuurdeAuto;
	}

	public void setHuurder(Klant k) {
		huurder = k;
	}

	public Klant getHuurder() {
		return huurder;
	}

	public double totaalPrijs() {

		if (gehuurdeAuto == null || huurder == null) {
			return 0.0;
		}

		else {
			return aantalDagen * gehuurdeAuto.getPrijsPerDag() * ((100 - huurder.getKorting()) / 100);
		}

	}

	public String toString() {
		String s = "";
		if (gehuurdeAuto == null) {
			s = s + " er is geen auto bekend\n";
		} else {
			s = s + gehuurdeAuto + "\n";
		}

		if (huurder == null) {
			s = s + " er is geen huurder bekend\n";
		} else {
			s = s + huurder + "\n";
		}

		s = s + " aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();

		return s;
	}

}
