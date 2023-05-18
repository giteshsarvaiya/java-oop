//Example 4: illustrating STARTVATION of parent thread:

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
    public void run()
    {
        while(true)		// T2 thread goes to infinite loop
        {
            System.out.println("T2 working");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
public abstract class NewClass 
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
One of the probable Output:
T1 going to wait for T2 to complete
T2 working
T2 working
T2 working
.
.
.
Thread T2 never ends and T1 thread never gets a chance to complete itself (infinite busy/loop). Thread T1 suffers from starvation.
*/