//Example of Reading through URL:
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class MyURLReader 
{
   public static void main(String arg[])
   {
       try {
           URL myurl = new URL("http://www.google.com/");
           BufferedReader in = new BufferedReader(new InputStreamReader(myurl.openStream()));
           String inputLine;
           while ((inputLine = in.readLine()) != null)
               System.out.println(inputLine);
           in.close();
       } catch (Exception ex) 
       {
           System.err.println(""+ex);
       }
   }
}
