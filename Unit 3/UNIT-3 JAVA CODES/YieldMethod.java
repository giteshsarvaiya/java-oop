class MyThread extends Thread 
{ 
    String message; 
 
    MyThread ( String message ) 
    { 
        this.message = message; 
    } 
     public void run() 
    { 
        for(int i=1;i<=5;i++) 
        {  
            System.out.println( message );
            try
            {
                Thread.sleep(700);  //without sleep the alternate behaviour cannot be seen
            }catch(Exception ex)
            {
                System.out.println("Error: "+ex);
            }
                
            yield(); 
        } 
   } 
} 


public class MyThreads 
{
    public static void main( String args [] ) 
    { 
        new MyThread("A").start(); 
        new MyThread("B").start(); 
    }     
}
