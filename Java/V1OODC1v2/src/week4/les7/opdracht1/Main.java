package week4.les7.opdracht1;

public class Main {

	public static void main(String args[]) {

		Gebouw g;
		Huis h = new Huis(10, 7, 3);
		g = h;

		//g = h; //wel toegestaan
		// g = new Huis(); //wel toegestaan
		//h = g; //niet toegestaan
		//h = (Huis)g; //niet toegestaan
		//if (g instanceof Huis) h = (Huis)g; //niet toegestaan
		//h.super.laatsteRenovatie = 1980; //niet toegestaan

		g.laatsteRenovatie = 1985;
		// binnen = 0, buiten is 1985 ;
		
		h.laatsteRenovatie = 1990;
		// binnen 1990, buiten is 1985;
		
		((Huis)g).laatsteRenovatie = 1995;
		// binnen 1995, buiten 1985
		
		h.renoveer(2000,2005);
		// binnen = 2000, buiten = 2005;
		
		//g.isGeisoleerd = true;
		// niet toegestaan

		
		h.berekenHuur();
		// Huis
		
		g.berekenHuur();
		// Gebouw
		
		//g.isoleer();
		// niet toegestaan
		
		((Huis)g).isoleer();
		// wel toegestaan
		
		System.out.println(h);

	}
}
