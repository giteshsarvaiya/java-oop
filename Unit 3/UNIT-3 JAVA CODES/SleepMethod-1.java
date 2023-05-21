//Sleep() method example

class MyClass extends Thread
{
   public void  run()
   {
       show();
   }
   
   void show()
   {
       try
        {
            for(int i=1;i<=5;i++)
            {
                Thread.sleep(500);	
//throws InterruptedException, hence try-catch is required
//puts the current thread to sleep or suspended state for the specified milliseconds

                System.out.println("Thread Name:- "+Thread.currentThread().getName());
            }
        }catch(Exception ex){System.out.println(ex);}
   }
}

public class MyThread
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
