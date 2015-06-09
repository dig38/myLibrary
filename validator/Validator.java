package validator;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import apacheStreamShield.CloseShieldInputStream;

public class Validator {
	public static String getString(String prompt){
		/*
		InputStream is = System.in;
		CloseShieldInputStream csis = new CloseShieldInputStream(is);
		Scanner sc = new Scanner(csis);
		*/
		Scanner sc = new Scanner(new CloseShieldInputStream(System.in));
		String entry = null;
		while(!(entry == null) || !(entry == "")){
			System.out.print(prompt);
			entry = sc.next();
			if(entry != null && entry != ""){
				sc.close();
				return(entry);
			}else{
				System.err.println("\nError. Nothing was entered.");
			}//END if else
		
		}//END while
		sc.close();
		return("Error");
	}//END getString
	public static String getString(Scanner sc, String prompt){
		String entry = null;
		while(!(entry == null) || !(entry == "")){
			System.out.print(prompt);
			entry = sc.next();
			if(entry != null && entry != "")
				return(entry);
			else{
				System.err.println("\nError. Nothing was entered.");
			}//END if else
		}//END while
		
		return("Error");
	}//END getString
	public static int getint(Scanner sc, String str){
		int enteredNumber = 0;
		Boolean flag = true;
		while(flag){
			System.out.print(str);
			try{
				enteredNumber = sc.nextInt();
				flag = false;
				return(enteredNumber);				
			}catch(InputMismatchException e){
				System.out.println("\nError. An integer was not entered.");
				flag = true;
				sc.next();
			}//END try catch
		}//END while
		return(enteredNumber);
	}//END getint	
	public static int getint(Scanner sc, String str, int int1, int int2){
		int enteredNumber = getint(sc, str);
		while((enteredNumber < int1) || (enteredNumber > int2)){
			System.out.println("\nPlease enter an integer between " + int1 +" and "+ int2);
			enteredNumber = getint(sc, str);
		}//END while
		return(enteredNumber);
	}//END getint
	public static double getdouble(){
		InputStream is = System.in;
		CloseShieldInputStream csis = new CloseShieldInputStream(is);
		Scanner sc = new Scanner(csis);
		double enteredNumber = 0;
		Boolean flag = true;
		while(flag){
			System.out.print("Please enter a number.");
			try{
				enteredNumber = sc.nextDouble();
				flag = false;
				return(enteredNumber);				
			}catch(InputMismatchException e){
				System.out.println("\nError. Please enter a single number.");
				flag = true;
				sc.next();
			}//END try catch
		}//END while
		sc.close();
		return(enteredNumber);
	}//END getdouble
	public static double getdouble(String str){
		InputStream is = System.in;
		CloseShieldInputStream csis = new CloseShieldInputStream(is);
		Scanner sc = new Scanner(csis);
		double enteredNumber = 0;
		Boolean flag = true;
		while(flag){
			System.out.print(str);
			try{
				enteredNumber = sc.nextDouble();
				flag = false;
				return(enteredNumber);				
			}catch(InputMismatchException e){
				System.out.println("\nError. Please enter a single number.");
				flag = true;
				sc.next();
			}//END try catch
		}//END while
		sc.close();
		return(enteredNumber);
	}//END getdouble
	public static double getdouble(Scanner sc, String str){
		double enteredNumber = 0;
		Boolean flag = true;
		while(flag){
			System.out.print(str);
			try{
				enteredNumber = sc.nextDouble();
				flag = false;
				return(enteredNumber);				
			}catch(InputMismatchException e){
				System.out.println("\nError. A number was not entered.");
				flag = true;
				sc.next();
			}//END try catch
		}//END while
		return(enteredNumber);
	}//END getdouble
	public static double getdouble(Scanner sc, String str, double double1, double double2){
		double enteredNumber = getdouble(sc, str);
		while( (enteredNumber < double1) || (enteredNumber > double2)) {
			System.out.println("\nPlease enter an integer between " + double1 +" and "+ double2);
			System.out.print(str);
			enteredNumber = getdouble(sc, str);
		}//END while
		return(enteredNumber);
	}//END getdouble
	public static char getChoice(Scanner sc, String prompt){	
		String choice = "";
		while(!choice.equalsIgnoreCase("c") && !choice.equalsIgnoreCase("e")){
			System.out.print(prompt);
			choice = sc.next();
			if(choice.equalsIgnoreCase("c")){
				System.out.println();
				return('c');
			}
			else if(choice.equalsIgnoreCase("e")){
				System.out.println();
				return('e');
			}
			else
				System.err.println("\nError. Please enter \"c\" or \"e\".");
		}//END while
		return('0');
	}//END getChoice
	public static boolean inRange(double number, double min, double max)
	{
		if(number <= min || number >= max)
			return(false);
		else 
			return(true);
	}//END inRange
	public static boolean tooSmall(double number, double min)
	{
		if(number <= min)
			return(false);
		else 
			return(true);
	}//END tooSmall
	public static boolean tooGreat(double number, double max)
	{
		if(number >= max)
			return(false);
		else 
			return(true);
	}//END tooGreat
	public static void rangeValidator(double total, double min, double max){
		if(Validator.tooSmall(total, 0.0)){
			System.out.println("Error. Your invoice is too small. Your invoice will not be procecesed\n");
		}else if(Validator.tooGreat(total , 10000.0)){
			System.out.println("Error. Your invoice is too small. Your invoice will not be procecesed\n");
		}//end if, else if
	}//END rangeValidator
}//END class Validator