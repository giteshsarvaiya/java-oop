//Example code for RMI-CLIENT:

//The Client class – “TheRMIClient.java”:
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class TheRMIClient 
{
    public static void main(String arg[])
    {
        if(System.getSecurityManager()==null)
        {
            System.setSecurityManager(new SecurityManager());
        }
        try
        {
            Scanner sc=new Scanner(System.in);        
            Registry reg=LocateRegistry.getRegistry("localhost");
            ProcessMessage pm=(ProcessMessage)reg.lookup("PM");
            while(true)
            {
                System.out.println("Enter 1 to Communicate Messages: ");
                System.out.println("Enter 2 to Exit: ");
                int n=sc.nextInt();
                switch(n)
                {
                    case 1:
                        System.out.println("Enter your message: ");
                        sc.nextLine();
                        String msg1=sc.nextLine();
                        String msg2=pm.talk(msg1);
                        System.out.println("Reply From Server: "+msg2);
                        break;
                    case 2:
                        throw new Exception("END OF COMMUNICATION");
                }            
            }
        }catch(Exception ex){System.out.println(""+ex);}
        
    }
}

/*
The Security (Policy) Permission File – “ClientPolicy.policy”:
grant { permission java.security.AllPermission; } ;


Running the RMI-CLIENT:

	javac  TheRMIClient.java

	start  rmiregistry

	java  -Djava.security.policy=ClientPolicy.policy  TheRMIClient
*/