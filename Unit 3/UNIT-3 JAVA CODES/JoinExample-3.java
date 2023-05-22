//Example 3: illustrating DEADLOCK:

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
            System.out.println("T2 going to wait for T1 to complete");
            try
            {
                waitFor.join();
            }
            catch(Exception e){}
            System.out.println("T2 out of wait");
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
        T2.waitFor=ob1;
        ob1.start();
        ob2.start();
    }
}



/*

One of the probable Output:
T2 working
T1 going to wait for T2 to complete
T2 going to wait for T1 to complete

// both the threads go to infinite wait, waiting for each other to complete
// this is the deadlock situation (T1 is in deadlock with T2)
*/