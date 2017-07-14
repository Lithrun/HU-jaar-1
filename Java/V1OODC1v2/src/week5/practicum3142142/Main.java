package week5.practicum2;
import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] arg) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		boolean isGetal = false;
		String location = "C:/Users/nickw/workspace/V1OODC1v2/src/week5/practicum2/";
		
		double koers = 0;
		System.out.println("Vul de koers in: ");
		while (isGetal == false) {
			try {
			koers = Double.parseDouble(scanner.nextLine());
			isGetal = true;
			}
			catch (NumberFormatException nfe) {
				System.out.println("Ongeldig getal. Voer een geldig getal in:  ");
			}
		}
		
		System.out.println("Vul de naam van het bronbestand in: ");
		String doelbestand = scanner.nextLine();
		doelbestand += ".txt";
		doelbestand = location + doelbestand;
		System.out.println(doelbestand);
		
		File file_doelbestand = new File (doelbestand);
		
		while (file_doelbestand.exists() == false && file_doelbestand.isFile() == false){
			System.out.println("Bestand bestaat niet. Vul een bestaand doelbestand in: ");
			doelbestand = scanner.nextLine();
			doelbestand += ".txt";
			doelbestand = location + doelbestand;
			file_doelbestand = new File(doelbestand);
		}
		
		System.out.println("Vul de naam van het bestemmingsbestand in: ");
		String bestemmingsbestand = scanner.nextLine();
		
		while (bestemmingsbestand == null)
		{
			System.out.println("Bestemmingsbestand mag niet leeg zijn. Vul een naam in: ");
			bestemmingsbestand = scanner.nextLine();
		}
		
		bestemmingsbestand += ".txt";
		bestemmingsbestand = location + bestemmingsbestand;
		File f2 = new File(bestemmingsbestand);
		System.out.println(f2.getAbsolutePath());
		
		FileWriter fw = new FileWriter(bestemmingsbestand);
		PrintWriter writer = new PrintWriter(fw);
		
		FileReader fr = new FileReader(doelbestand);
		BufferedReader br = new BufferedReader(fr);
		
		String regel = br.readLine();
		
		while (regel != null){
			String[] values = regel.split(" : ");
			String naam = values[0];
			double prijs = (int) ((Double.parseDouble(values[1]) * koers)/100.0 * 100.0);
			
			//System.out.printf("%s : %s %n",naam,prijs);
			
			writer.printf("%s : %s %n",naam,prijs);
			regel = br.readLine();
				
		}
		br.close();
		writer.close();
		scanner.close();
	}
}
