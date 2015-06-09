package tryCatch;
import java.util.InputMismatchException;
//import java.io.*; //For 2nd and 3rd Example mains

public class TryCatch {
	public static void main(String[] args){	
		try{
			int a = 0;
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("Enter an Integer:");
			a = sc.nextInt();
			sc.close();
			System.out.println(a);
		}
		//Catch InputMismatch
		catch(InputMismatchException e)
		{
			System.out.println("I cannot take that input!");
		}
		//Catch any Exception
		catch(Exception  e)
		{
			System.out.println("I cannot take that input!");
		}
		
		//IOException, SQLException, IOException|SQLException
		
		/*	A) Class Throwable
		 *		A) Throwable: B.1) Error, B.2) Exception
		 *			B.2) Exception: C.1) RuntimeException, C.2) InterruptedException, C.3) IOException
		 *				C.1) RuntimeException: C.1_D.1)IllegalArgumentException, C.1_D.2)ArrayIndexOutOfBoundsException
		 *					D.1) IllegalArgumentException: E.1) NumberFormatExcepation
		 *				C.3) IOException: C.3_D.1) EOFException, C.3_D.2) SocketException
		 */
		
		/*
		 * function() throws exception1, exception2
		 */
	}//END static void main
}//END class TryCatch
	/*
	 * More Examples
	 */
	
	/*
	public static void main(String[] args){
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\myfile.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int k;
		
		try{ 
			while((k=fis.read())!=-1)	
				System.out.print((char)k);	}
		catch (IOException e1){	
			e1.printStackTrace(); 
		}
		
		try {
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//END main
*/
/*
	public static void main(String[] args) throws IOException, FileNotFoundException{
		FileInputStream fis = null;
		fis = new FileInputStream("c:\\myfile.txt");
		int k;
		while((k=fis.read())!=-1){
			System.out.print((char)k);
		}//END while
		fis.close();
	}//END main
*/
	
	
	

