//SERVER SOCKET program:

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TheTCPServer implements Runnable
{
    ServerSocket ss=null;
    Socket s=null;
    InputStreamReader isr=null;
    BufferedReader reader=null;
    PrintWriter pw=null;
    Scanner sc=new Scanner(System.in);
    void startServer() throws Exception 
    {
        System.out.println("Server Started...");
        ss=new ServerSocket(8899);
        s=ss.accept();
        if(s.isConnected())
        {
            isr=new InputStreamReader(s.getInputStream());
            reader=new BufferedReader(isr);
            pw=new PrintWriter(s.getOutputStream());
            System.out.println("Server Connected to Client");
        }
        else
        {
            System.err.println("Server Unable to Connect to Client");
        }        
    }

    public void run()
    {
        try
        {
            startServer();            
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
public class MyTCPSocketServer 
{
    public static void main(String arg[])
    {
        TheTCPServer tcpserver=new TheTCPServer();
        Thread t=new Thread(tcpserver);
        t.start();
    }
}
