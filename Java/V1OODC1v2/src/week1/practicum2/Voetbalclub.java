package week1.practicum2;

public class Voetbalclub {

	private String clubNaam;
	private int aantalGewonnen;
	private int aantalGelijk;
	private int aantalVerloren;

	public Voetbalclub(String cln) {
		clubNaam = cln;
	}

	public void verwerkResultaat(char ch) {

		if (ch == 'w') {
			aantalGewonnen += 1;
		} else if (ch == 'g') {
			aantalGelijk += 1;
		} else if (ch == 'v') {
			aantalVerloren += 1;
		}
	}

	public int aantalGespeeld() {
		int totaal = aantalGewonnen + aantalGelijk + aantalVerloren;
		return totaal;
	}

	public int aantalPunten() {
		int totaal_punten = aantalGewonnen * 3 + aantalGelijk;
		return totaal_punten;
	}

	public String toString() {
		return clubNaam + "   " + aantalGespeeld() + "      " + aantalGewonnen + "   " + aantalGelijk + "   " + aantalVerloren + "     " + aantalPunten();
	}

}
