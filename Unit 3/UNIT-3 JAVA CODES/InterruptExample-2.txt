//Example 2:  using infinite sleep() and interrupt():

class A implements Runnable
{
    public void run()
    {
        try
        {
            while(true)
            {
                String tn=Thread.currentThread().getName();
                System.out.println(tn+" Before Infinite Sleep");
                Thread.sleep(500);
            }
        }catch(InterruptedException ex)
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
ChildThread Before Infinite Sleep
Sleep Interrupted
*/