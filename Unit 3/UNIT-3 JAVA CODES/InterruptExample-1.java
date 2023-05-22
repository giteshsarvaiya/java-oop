//Example 1: using sleep() and interrupt():

class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            String tn=Thread.currentThread().getName();
            System.out.println(tn+" Before Sleep");
        }
        try{Thread.sleep(500);}
        catch(InterruptedException ex)
        {
            System.out.println("Sleep Interrupted");
        }        
    }
}

public class NewClass {
    public static void main(String arg[])
    {
        A ob=new A();
        Thread t1=new Thread(ob, "ChildThread");
        t1.start();
        t1.interrupt();
        System.out.println("Main End");
    }
}

/*
Output: (This output we will get always.)
Main End
ChildThread Before Sleep
ChildThread Before Sleep
ChildThread Before Sleep
ChildThread Before Sleep
ChildThread Before Sleep
ChildThread Before Sleep
ChildThread Before Sleep
ChildThread Before Sleep
ChildThread Before Sleep
ChildThread Before Sleep
Sleep Interrupted
*/