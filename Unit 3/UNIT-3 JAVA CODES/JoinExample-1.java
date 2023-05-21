//Example 1: when two threads join.

class T1 extends Thread
{
    static Thread waitFor=null;
    public void run()
    {
            System.out.println("T1 going to wait for T2 to complete");
            try
            {
                waitFor.join();
            }
            catch(Exception e){}
            System.out.println("T1 out of wait");


            for(int i=1;i<=5;i++)
            {
                System.out.println("T1 working");
                try{Thread.sleep(500);}catch(Exception e){}
            }
            System.out.println("T1 Finished");
    }
}
class T2 extends Thread 
{
    static Thread waitFor=null;
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("T2 working");
            try{Thread.sleep(500);}catch(Exception e){}
        }
        System.out.println("T2 Finished");
    }
}
public class NewClass 
{
    public static void main(String arg[]) 
    {  
        T1 ob1=new T1();
        T2 ob2=new T2();
        T1.waitFor=ob2;
        ob1.start();
        ob2.start();
    }
}

/*
One of the possible Output:
T1 going to wait for T2 to complete
T2 working
T2 working
T2 working
T2 working
T2 working
T2 Finished
T1 out of wait	// T1 thread resumes only after thread T2 completes
T1 working
T1 working
T1 working
T1 working
T1 working
T1 Finished
*/