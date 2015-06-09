package formating;

import java.text.NumberFormat;

public class Formating {
	public static String getCurrencyFormat(int number){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return(currency.format(number));
	}
	
	public static String getCurrencyFormat(double number){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return(currency.format(number));
	}
	
	public static String getPercentFormat(int number){
		NumberFormat percent = NumberFormat.getPercentInstance();
		return(percent.format(number));
	}
	
	public static String getPercentFormat(double number){
		NumberFormat percent = NumberFormat.getPercentInstance();
		return(percent.format(number));
	}
	
}
