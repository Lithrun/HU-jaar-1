package week2.zelfstudie3;

import week2.zelfstudie1.Cirkel;

public class Main {

	public static void main(String[] arg) {
		Cirkel c1 = null, c2 = null;

		try {
			c1 = new Cirkel(10, 0, 10);
			c2 = new Cirkel(0, 10, 10);
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}

		System.out.println(c1);
		System.out.println(c2);
	}

}
