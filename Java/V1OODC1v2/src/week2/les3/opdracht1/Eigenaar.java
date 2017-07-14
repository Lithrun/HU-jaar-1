package week2.les3.opdracht1;

public class Eigenaar {
	
	private String naam;
	private int giroNr;
	
	public Eigenaar(String nm){
		naam = nm;
	}
	
	public void setGiroNr(int nr){
		giroNr = nr;
	}
	
	public int getGiroNr(){
		return giroNr;
	}
	
	public String getNaam(){
		return naam;
	}
	
	public String toString(){
		String s = naam + " heeft giro: " + giroNr;
		return s;
	}

}
