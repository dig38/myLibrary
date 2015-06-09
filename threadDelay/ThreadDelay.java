package threadDelay;
public class ThreadDelay {
	public void main(String[] args){
		try {
		    Thread.sleep(100);
		} catch(InterruptedException e) {
		    Thread.currentThread().interrupt();
		}//END try catch
	}//END main
}//END Delay
