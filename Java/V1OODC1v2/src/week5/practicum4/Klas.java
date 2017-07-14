package week5.practicum4;

import java.io.Serializable;
import java.util.ArrayList;

public class Klas implements Serializable {

	private String klasCode;
	private ArrayList<Leerling> deLeerlingen;

	public Klas(String kC) {
		klasCode = kC;
		deLeerlingen = new ArrayList<Leerling>();
	}

	public void voegLeerlingToe(Leerling l) {
		deLeerlingen.add(l);
	}

	public void wijzigCijfer(String nm, double nweCijfer) {
		for (Leerling leerling : deLeerlingen) {
			if (leerling.getNaam().equals(nm)) {
				leerling.setCijfer(nweCijfer);
			}
		}

	}


	public ArrayList<Leerling> getLeerlingen() {
		return deLeerlingen;
	}

	public int aantalLeerlingen() {
		int aantal = 0;
		for (int i = 0; i < deLeerlingen.size(); i++) {
			aantal++;
		}
		return aantal;
	}

	public String toString() {
		String s = "In klas " + klasCode + " zitten de volgende leerlingen: \n";

		for (Leerling leerling : deLeerlingen) {
			s = s + leerling + "\n";
		}

		return s;
	}

}
