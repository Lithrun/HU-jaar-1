package week1.les1.opdracht5;

public class Main {
	
	public static void main(String[] arg)
	{
		Student st1 = new Student("Nick");
		System.out.println(st1.getNaam());
		System.out.println(st1.getStudentNummer());
		st1.setStudentNummer(25);
		System.out.println(st1.toString());
	}

}