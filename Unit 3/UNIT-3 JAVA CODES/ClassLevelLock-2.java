//Example 4: synchronized block – class level lock:

class A implements Runnable
{
    public void test()
    {
        synchronized(A.class)
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
    public void run()
    {
        test();
    }
}
public class NewClass {
    public static void main(String arg[])
    {
        A ob1=new A();
        A ob2=new A();
        Thread t1=new Thread(ob1, "Child1");
        Thread t2=new Thread(ob2, "Child2");
        t1.start();
        t2.start();
    }
}


/*
Output:
Child2
Child2
Child2
Child2
Child2
Child1
Child1
Child1
Child1
Child1
Every thread completes to finish once started
*/