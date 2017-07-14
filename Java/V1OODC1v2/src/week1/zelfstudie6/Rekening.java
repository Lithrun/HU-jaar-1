package week1.zelfstudie6;

public class Rekening {
	
	private int nummer;
	private double saldo;
	
	public Rekening(int nr)
	{
		nummer = nr;
	}

	public int getNummer()
	{
		return nummer;
	}
	
	public double getSaldo()
	{
		return saldo;
	}
	
	public void stort(double bedrag)
	{
		if (bedrag > 0)
		{
			saldo += bedrag;
		}
		
		else
		{
			System.out.println("Voer geen negative waarden in!");
		}
	}
	
	public void neemOp(double bedrag)
	{
		if (bedrag > 0)
		{
			if (saldo - bedrag >= 0)
			{
				saldo -= bedrag;
			}
			else
			{
				System.out.println("U heeft niet genoeg geld op uw rekening!");
			}
		}
		else
		{
			System.out.println("Voer geen negative waarden in!");
		}
	}
	
	public String toString()
	{
		String s = "Rekening: " + nummer + " heeft een saldo van " + saldo;
		return s;
	}
	
}
