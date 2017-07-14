package week1.les1.opdracht3;

public class Student {
	
	private String naam;
	
	public Student(String nm)
	{
		naam = nm;
	}
	
	public String toString()
	{
		String s = "Naam van de student: " + naam;
		return s;
	}

}
