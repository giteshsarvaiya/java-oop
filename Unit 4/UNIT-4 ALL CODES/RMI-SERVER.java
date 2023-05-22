//Example code for RMI-SERVER:

//The Interface – “ProcessMessage.java”:
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProcessMessage extends Remote
{
    public String talk(String msg) throws RemoteException;
}

The Server class – “TheRMIServer.java”:
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class TheRMIServer implements ProcessMessage
{
    public TheRMIServer() throws RemoteException
    {
        super();
        //This constructor just invokes the superclass constructor, 
        //which is the no-argument constructor of the Object class. 
        //Although the superclass constructor gets invoked even if 
        //omitted from here, it is included for clarity.
    }
    @Override
    public String talk(String msg) throws RemoteException 
    {
        System.out.println("Message from Client: "+msg);
        msg="Message Received by the Server: "+msg;
        return msg;
    }
    
    public static void main(String arg[])
    {
        if(System.getSecurityManager()==null)
        {
            System.setSecurityManager(new SecurityManager());
        }
        try
        {
            ProcessMessage pm=new TheRMIServer();
            ProcessMessage stub=(ProcessMessage)UnicastRemoteObject.exportObject(pm, 0);
            Registry reg=LocateRegistry.getRegistry();
            reg.rebind("PM", stub);
            System.out.println("RMI Server Started...");
        }catch(Exception ex){System.out.println(""+ex);}        
    }
}

/*
The Security (Policy) Permission File – “ServerPolicy.policy”:
grant {permission java.security.AllPermission; } ;


Running the RMI-SERVER:

	javac  ProcessMessage.java

	javac  TheRMIServer.java

	rmic  TheServer

	start  rmiregistry

	java  -Djava.security.policy=ServerPolicy.policy  TheRMIServer
*/