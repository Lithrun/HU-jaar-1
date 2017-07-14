package week3.les6.opdracht2;

import java.util.ArrayList;

public class FacebookAccount {

	private String naam;
	private ArrayList<Vriend> mijnVrienden;

	public FacebookAccount(String in_naam) {
		naam = in_naam;
		mijnVrienden = new ArrayList<Vriend>();
	}

	public String getNaam() {
		return naam;
	}

	public void voegVriendToe(Vriend nwV) {
		
		for (Vriend vriend : mijnVrienden){
			
			if (vriend.equals(nwV) == false){
				mijnVrienden.add(nwV);
			}
			
		}

	}

	public boolean verwijderVriend(Vriend exV) {
		return mijnVrienden.remove(exV);
	}
	
	public boolean isVriendMet(Vriend v){
		
		for (Vriend vriend : mijnVrienden){
			if (vriend.equals(v)){
				return true;
			}
		}
		
		return false; // TO DO
	}

	public int aantalVrienden() {
		int aantal = 0;
		for (Vriend vriend : mijnVrienden) {
			aantal++;
		}
		return aantal;
	}
	
	public String toString(){
		String s = naam + "\n";
		for (Vriend vriend : mijnVrienden){
			s = s + vriend + "\n";
		}
		return s;
	}

}
