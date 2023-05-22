//Example: for demonstrating isAlive() and join() methods

class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            String tn=Thread.currentThread().getName();
            System.out.println(tn+" Is Alive="+Thread.currentThread().isAlive());            
        }
    }
}

public class NewClass {
    public static void main(String arg[])
    {
        A ob=new A();
        Thread t1=new Thread(ob, "ChildThread");
        t1.start();
        try{t1.join();}
        catch(InterruptedException ex){}
        System.out.println("Child Thread after join Is Alive="+t1.isAlive()); 
        System.out.println("Main End");
    }
}

/*
Output:
ChildThread Is Alive=true
ChildThread Is Alive=true
ChildThread Is Alive=true
ChildThread Is Alive=true
ChildThread Is Alive=true
Child Thread after join Is Alive=false
Main End

*/
