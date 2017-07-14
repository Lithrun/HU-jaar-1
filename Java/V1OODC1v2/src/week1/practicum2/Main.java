package week1.practicum2;

public class Main {
	public static void main(String[] arg) {
		Voetbalclub ajx = new Voetbalclub("Ajax      ");
		System.out.println(ajx.toString());

		Voetbalclub feij = new Voetbalclub("Feijenoord");
		feij.verwerkResultaat('w');
		feij.verwerkResultaat('w');
		feij.verwerkResultaat('w');
		feij.verwerkResultaat('g');
		//System.out.println(feij.toString());
		System.out.println(feij);
	}
}