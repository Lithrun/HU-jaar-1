package week1.les1.opdracht4;

public class Main {
	
	public static void main(String[] arg){ // comment
		Student st1 = new Student("Nick");
		System.out.println("getter: " + st1.getNaam() );
		System.out.println("toString: " + st1.toString());
		
		Student st2 = new Student("Jan");
		System.out.println("getter: " + st2.getNaam() );
		System.out.println("toString: " + st2.toString());
	}

}
