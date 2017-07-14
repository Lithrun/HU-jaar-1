package week2.zelfstudie2;

public class Main {
	
	public static void main(String[] arg) {
		Cirkel c1 = null, c2 = null;

		//try {
			c1 = new Cirkel(10, 0, 10);
			c2 = new Cirkel(0, 10, 10);
		//} catch (IllegalArgumentException iae) {
			//System.out.println(iae.getMessage());
		//}

		System.out.println(c1);
		System.out.println(c2);
	}

}

// Code werkt niet meer omdat de try-catch is weggehaald