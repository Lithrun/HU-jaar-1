package week1.zelfstudie6;

public class Main {
	
	public static void main(String[] arg)
	{
		Rekening r1 = new Rekening(1);
		r1.stort(40);
		r1.stort(-10); // Negative
		r1.neemOp(50); // Rekening heeft slecht 40
		r1.neemOp(-10); // Negative
		r1.neemOp(10); // 40 - 10 = 30
		System.out.println(r1);
	}

}
