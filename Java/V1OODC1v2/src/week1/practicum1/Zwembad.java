package week1.practicum1;

public class Zwembad {
	
	private double breedte;
	private double lengte;
	private double diepte;
	
	public Zwembad()
	{
		
	}
	
	public Zwembad(double bre, double len, double dpt)
	{
		breedte = bre;
		lengte = len;
		diepte = dpt;
		
	}
	
	public double getBreedte()
	{
		return breedte;
	}
	
	public double getLengte()
	{
		return lengte;
	}
	
	public double getDiepte()
	{
		return diepte;
	}
	
	public void setBreedte(double bre)
	{
		breedte = bre;
	}
	
	public void setLengte(double len)
	{
		lengte = len;
	}
	
	public void setDiepte(double dpt)
	{
		diepte = dpt;
	}
	
	public double inhoud()
	{
		double inhoud = breedte * lengte * diepte;
		return inhoud;
	}
	
	public String toString()
	{
		String s = "Dit zwembad is " + breedte + " breed, " + lengte + " lang, en " + diepte + " meter diep";
		return s;
	}

}
