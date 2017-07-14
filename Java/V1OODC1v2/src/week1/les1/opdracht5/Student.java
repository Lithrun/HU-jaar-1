package week1.les1.opdracht5;

public class Student {
	
	private String naam;
	private int studentNummer;
	
	public Student(String nm)
	{
		naam = nm;
	}
	
	public Student(String nm, int stNr)
	{
		naam = nm;
		studentNummer = stNr;
	}
	
	public String getNaam()
	{
		return naam;
	}
	
	public int getStudentNummer()
	{
		return studentNummer;
	}
	
	public void setStudentNummer(int stNr)
	{
		studentNummer = stNr;
	}
	
	public String toString()
	{
		String s = "Student naam: " + naam + " en de studentnummer: " + studentNummer;
		return s;
	}

}
