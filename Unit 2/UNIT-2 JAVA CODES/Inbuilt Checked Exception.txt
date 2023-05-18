//Inbuilt checked exception example:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test 
{
    public static void main(String[] args)
    {
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader r=new BufferedReader(isr);
            System.out.println("Enter your name:");
            String nm=r.readLine(); 	//need to be encapsulated in try-catch block.
            System.out.println("Welcome"+nm);
        }catch(IOException ex)
        {
            System.out.println(ex);
        }
        System.out.println("main end"); //executed as program ended normally
    }    
}

/*
Output:
Enter your name:
TEST
WelcomeTEST
main end
*/