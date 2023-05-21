//Sleep() method example

class MyClass implements Runnable
{
    String tname;
    public void run()
    {
        try
        {
            for(int i=0;i <= 5;i++)
            {
                System.out.println("Before Sleep Thread Name:- "+Thread.currentThread().getName()+"  Data:- "+i);
                Thread.sleep(500);	
//throws InterruptedException, hence try-catch is required
//puts the current thread to sleep or suspended state for the specified milliseconds

                System.out.println("After Sleep Thread Name:- "+Thread.currentThread().getName()+"  Data:-  "+i);
            }
        }catch(Exception ex){System.out.println(ex);}
    }	
}
  
public class MyRunnable
{
    public static void main(String a[])
    {
        MyClass ob=new MyClass();
        Thread t1=new Thread(ob,"First");
        Thread t2=new Thread(ob,"Second");
        Thread t3=new Thread(ob,"Third");        
        t1.start();
        t2.start();
        t3.start();        
    }
}
