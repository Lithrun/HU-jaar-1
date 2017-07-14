package week2.les4.opdracht3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg){
		ArrayList<Double> getallen = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);
		
		double getal = 1;
		
		while (getal != 0){
		
			System.out.println("Voer een getal in");
			String getal_in = scanner.nextLine();
			getal = Double.parseDouble(getal_in);
			if (getal > 0){
				getallen.add(getal);
			}
		}
		
		System.out.println(getallen);
		System.out.println("Einde systeem");
		scanner.close();
	}

}
