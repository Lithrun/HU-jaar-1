package week2.zelfstudie2;

public class Cirkel {

	
	private int radius;
	private int xPositie;
	private int yPositie;
	
	public Cirkel(int rad, int x, int y){
		if (rad <= 0){
			throw new IllegalArgumentException();
		}
		
		
		radius = rad;
		xPositie = x;
		yPositie = y;
	}
	
	public String toString(){
		
		if (radius <= 0){
			return "Radius moet groter dan 0 zijn!";
		}
		
		else {
			return "cirkel " + " (" + xPositie + ", " + yPositie + " ) met radius :" + radius;
		}
		
		
		
	}
	
}
