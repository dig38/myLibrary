package tryparse;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class TryParse {
	public static void main(){



	}
	
	public static boolean tryParse(String code){  
		try{  	  
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			int a = compiler.run(System.in, System.out, System.err, code);
			System.out.println(a);
			return(true);
		} catch(Exception e){  
			return(false);  
		}  
	}//END tryParse
}//END class TryParse
