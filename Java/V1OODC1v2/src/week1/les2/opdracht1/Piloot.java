package week1.les2.opdracht1;

public class Piloot {
	
	private String naam;
	private double salaris;
	private int vlieguren;
	
	public Piloot(String nm)
	{
		naam = nm;
	}
	
	public void setSalaris(double sl)
	{
		salaris = sl;
	}
	
	public int getVlieguren(){
		return vlieguren;
	}
	
	public double getSalaris(){
		return salaris;
	}
	
	public void verhoogVliegurenMet(int vlgu)
	{
		vlieguren += vlgu;
	}
	
	public String toString()
	{
		String s = naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
		return s;
	}

}
