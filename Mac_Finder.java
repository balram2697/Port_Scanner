
public class Mac_Finder
{
    
    public static void main(String[] args)
    {
		Runtime runtime = Runtime.getRuntime();
		try {
   		 Process p1 = runtime.exec("cmd /c start G:\\macFinder.");
		} catch(Exception ex) {
		}
    }

}