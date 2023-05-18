//Example 1: synchronized method – object level lock:
class A implements Runnable
{
    public synchronized void run()
    {        
        for(int i=1;i<=5;i++)
        {
            String tn=Thread.currentThread().getName();
            System.out.println(tn);
            try{Thread.sleep(500);}
            catch(InterruptedException ex){}
        }
    }
}
public class NewClass {
    public static void main(String arg[])
    {
        A ob=new A();
        Thread t1=new Thread(ob, "Child1");
        Thread t2=new Thread(ob, "Child2");
        Thread t3=new Thread(ob, "Child3");
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
Output:
Child2
Child2
Child2
Child2
Child2
Child3
Child3
Child3
Child3
Child3
Child1
Child1
Child1
Child1
Child1
Every thread completes to finish once started
*/
