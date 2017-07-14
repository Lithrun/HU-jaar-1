package aottg.compiler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] arg) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		String location = "C:/Users/nickw/Documents/AoT/compiler/";
		
		String bronbestand = "compile.txt";
		bronbestand = location + bronbestand;
		System.out.println("Starting");
		
		File file_doelbestand = new File (bronbestand);
		
		String bestemmingsbestand = "result.txt";
		bestemmingsbestand = location + bestemmingsbestand;
		File f2 = new File(bestemmingsbestand);

		FileWriter fw = new FileWriter(bestemmingsbestand);
		PrintWriter writer = new PrintWriter(fw);
		
		FileReader fr = new FileReader(bronbestand);
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();

		String regel = br.readLine();
		
		while (regel != null){ // read the array list
			l1.add(regel);
			regel = br.readLine();		
		}
		
		Iterator<String> iterator = l1.iterator();

        while (iterator.hasNext())
        {
            String o = (String) iterator.next();
            if(!l2.contains(o)) l2.add(o);
        }
        
        for (String s : l2) {
        	writer.println(s);
        }
		

		System.out.println("Thanks for using Erwin Smiths / Nickernator's AottG map compiler.");
		
		br.close();
		writer.close();
		scanner.close();
	}
}
