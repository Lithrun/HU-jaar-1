package week4.les7.opdracht1;

public class Huis extends Gebouw {

	public boolean isGeisoleerd;
	public int laatsteRenovatie;
	
	public Huis(){
		
		this(false);
		
	}
	
	public Huis(boolean isG){
		this(10,10,2);
		isGeisoleerd = isG;
		
	}
	
	public Huis(int l, int b, int aV){
		super(l, b, aV);
	}
	
	public Huis(int l, int b, int aV, boolean isG){
		super(l, b, aV);
		isGeisoleerd = isG;
	}
	
	public void isoleer(){
		isGeisoleerd = true;
	}
	
	public void renoveer(int binnen){
		laatsteRenovatie = binnen;
	}
	
	public void renoveer(int binnen, int buiten){
		laatsteRenovatie = binnen;
		super.renoveer(buiten);
	}
	
	public int berekenHuur(){
		return super.oppervlakte() * 100;
	}
	
	public String toString(){
		return "Het huis is in " + laatsteRenovatie + " binnen gerenoveerd" + " en is " + isGeisoleerd + " geisoleerd.\n" + super.toString()  ;
	}
	
}
