package week1.les2.opdracht1;

public class Main {
	public static void main(String[] arg)
	{
		Piloot p1 = new Piloot("Nick");
		p1.setSalaris(123456.78);
		System.out.println("Zonder vlieguren: " + p1.toString());
		p1.verhoogVliegurenMet(10);
		System.out.println("Met vlieguren: " + p1.toString());
	}
}