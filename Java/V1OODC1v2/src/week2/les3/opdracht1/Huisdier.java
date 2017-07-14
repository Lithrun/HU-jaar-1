package week2.les3.opdracht1;

public class Huisdier {
	
	private String naam;
	private String ras;
	private double gewicht;
	private Eigenaar baasje;
	
	public Huisdier(String nm, String r){
		naam = nm;
		ras = r;
	}
	
	public void setBaasje(Eigenaar e){
		baasje = e;
	}
	
	public Eigenaar getBaasje(){
		return baasje;
	}
	
	public String toString(){
		
		String s = naam + " is een " + ras + " en weegt " + gewicht + "kg. \nEn de eigenaar is: " + baasje;
		return s;
		
		
	}
	

}
