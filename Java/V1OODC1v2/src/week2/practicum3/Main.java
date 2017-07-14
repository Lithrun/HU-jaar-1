package week2.practicum3;

public class Main {

	public static void main(String[] arg) {
		Klas k = new Klas("V1D");
		Leerling l = new Leerling(new String ("Hans"));
		k.voegLeerlingToe(l);
		l = new Leerling("Jan");
		k.voegLeerlingToe(l);
		l = new Leerling("Wim");
		k.voegLeerlingToe(l);
		System.out.println(k);
		k.wijzigCijfer("Hans", 7.6);
		k.wijzigCijfer("Klaas", 7.8); // Klaas zit niet in de ArrayList
		System.out.println(k.toString());
		System.out.println("Aantal leerlingen: " + k.aantalLeerlingen());

	}

}
