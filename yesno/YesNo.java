package yesno;
import java.io.InputStream;
import java.util.Scanner;

import apacheStreamShield.CloseShieldInputStream;
public abstract class YesNo {
	public static boolean getyesno(){
		System.out.print("\nContinue? (y/n) ");
		return(yesnoScanner());
	}//END getyesno
	
	public static boolean getyesno(Scanner sc){
		System.out.print("\nContinue? (y/n) ");
		return(yesno(sc));
	}//end getyesno
	
	public static boolean getyesno(String str){
		System.out.print("\n"+str);
		return(yesnoScanner());
	}//end getyesno
	
	public static boolean getyesno(Scanner sc, String str){
		System.out.print("\n"+str);
		return(yesno(sc));
	}//end getyesno
	
	
	private static boolean yesnoScanner(){
		InputStream is = System.in;
		CloseShieldInputStream csis = new CloseShieldInputStream(is);
		Scanner sc = new Scanner(csis);
		boolean yesno = yesno(sc);
		sc.close();
		return(yesno);
	}
	
	private static boolean yesno(Scanner sc){
		String choice = "";
		while(!choice.equalsIgnoreCase("y") || !choice.equalsIgnoreCase("n")){
			choice = sc.next();
			if(choice.equalsIgnoreCase("y")){
				System.out.println();
				return(true);
			}
			else if(choice.equalsIgnoreCase("n")){
				System.out.println();
				return(false);
			}
			else
				System.err.println("\nError. Please enter \"y\" or \"n\".");
		}//END while
		return(false);
	}//END yesno
}//end class YesNo
