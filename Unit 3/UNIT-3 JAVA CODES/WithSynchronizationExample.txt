//Example 6: Accessing a shared object by threads with synchronization:

class Accnt
{
    int bal=1200;
    void withdraw(int amt)
    {
        Thread t=Thread.currentThread();
        String nm=t.getName();
        if((bal-amt)<800)
        {
            try{Thread.sleep(500);}catch(InterruptedException e){}
            System.out.println("Insufficient Balance");
        }
        else
        {
            try{Thread.sleep(500);}catch(InterruptedException e){}
            bal-=amt;            
            System.out.println("Withdrawal by:"+nm+" Balance="+bal);
        }
    }
}
class Cust implements Runnable
{
    Accnt ac;
    Cust(Accnt acc){ac=acc;}
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            synchronized(ac)
            {
                ac.withdraw(200);
            }            
        }
    }
}

public class NewClass2 
{
    public static void main(String arg[])
    {
       Accnt ac=new Accnt();
       Cust c=new Cust(ac);
       Thread t1=new Thread(c,"1");
       Thread t2=new Thread(c,"2");
       Thread t3=new Thread(c,"3");
       t1.start();
       t2.start();
       t3.start();
    }    
}

/*
Output:
Withdrawal by:1 Balance=1000
Withdrawal by:3 Balance=800
Insufficient Balance
Insufficient Balance
Insufficient Balance
Insufficient Balance
Insufficient Balance
Insufficient Balance
Insufficient Balance
Due synchronous access of threads to same object the balance amount does not go below 800.
*/