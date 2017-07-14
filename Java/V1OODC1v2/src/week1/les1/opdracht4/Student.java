package week1.les1.opdracht4;

public class Student {
	
	private String naam;
	
	public Student(String nm){
		naam = nm;
	}
		
	public String getNaam(){
		return naam;
	}
	
	public String toString(){
		String s = "De naam van deze student is: " + naam;
		return s;
	}

}
