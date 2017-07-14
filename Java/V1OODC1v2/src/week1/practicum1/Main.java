package week1.practicum1;

public class Main {
	public static void main(String[] arg)
	{
		Zwembad z1 = new Zwembad(2.0,5.5,1.5);
		System.out.println("Breedte: " + z1.getBreedte());
		System.out.println("Lengte: " + z1.getLengte());
		System.out.println("Diepte: " + z1.getDiepte());
		System.out.println("Inhoud: " + z1.inhoud() + "\n");
		
		Zwembad z2 = new Zwembad( );
		z2.setBreedte(2.5);
		z2.setLengte(100.0);
		z2.setDiepte(2.0);
		double inh = z2.inhoud();
		System.out.println("Gegevens zwembad: " + z2.toString());
		System.out.println("Berekende inhoud: " + inh);
		
		
	}
	

}
