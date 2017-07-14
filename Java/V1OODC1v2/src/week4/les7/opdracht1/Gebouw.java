package week4.les7.opdracht1;

public class Gebouw {
	
	private int lengte;
	private int breedte;
	private int aantalVerdiepingen;
	public int laatsteRenovatie;
	
	public Gebouw(){
		this(10,10,2);
	}
	
	public Gebouw(int l, int b, int aV){
		
		lengte = l;
		breedte = b;
		aantalVerdiepingen = aV;
		
	}
	
	public int oppervlakte(){
		return lengte * breedte;
	}

	public void renoveer(int jaarBuiten){
		laatsteRenovatie = jaarBuiten;
	}
	
	public int berekenHuur(){
		return oppervlakte() * 75;
	}
	
	public String toString(){
		
		return "Het gebouw is " + lengte + " bij " + breedte + " , en heeft " + aantalVerdiepingen + " verdiepingen . Het is buiten gerenoveerd in : " + laatsteRenovatie;
	}
	
	
}
