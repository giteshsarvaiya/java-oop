//CLIENT SOCKET program:

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class TheTCPClient implements Runnable
{
    Socket s=null;
    InputStreamReader isr=null;
    BufferedReader reader=null;
    PrintWriter pw=null;
    Scanner sc=new Scanner(System.in);
    void startClient() throws Exception 
    {
        System.out.println("Client Started...");
        s=new Socket("localhost",8899);
        if(s.isConnected())
        {
            isr=new InputStreamReader(s.getInputStream());
            reader=new BufferedReader(isr);
            pw=new PrintWriter(s.getOutputStream());
            System.out.println("Client Connected to Server");
        }
        else
        {
            System.err.println("Client Unable to Connect to Server");
        }        
    }    
    public void run()
    {
        try
        {
            startClient();            
            while(true)
            {
                System.out.println("Enter 1 to Send Message: ");
                System.out.println("Enter 2 to Receive Message: ");
                System.out.println("Enter 3 to Exit: ");
                int n=sc.nextInt();
                switch(n)
                {
                    case 1:
                        System.out.println("Enter Message to Send: ");
                        sc.nextLine(); //to consume the new line due to println
                        String msg=sc.nextLine();
                        pw.println(msg);
                        pw.flush();
                        break;
                    case 2:
                        String msg2=reader.readLine();
                        System.out.println(msg2);
                        break;
                    case 3:
                        throw new Exception("END");
                }
            }
        }catch(Exception ex){System.err.println(""+ex);}
        System.out.println("END OF COMMUNICATION...");
    }
}
public class MyTCPSocketClient 
{
    public static void main(String arg[])
    {
        TheTCPClient tcpclient=new TheTCPClient();
        Thread t=new Thread(tcpclient);
        t.start();
    }
}
