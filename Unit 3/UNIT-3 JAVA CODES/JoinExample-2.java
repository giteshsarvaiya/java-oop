//Example 2: making the parent thread join inside the child thread:

class A extends Thread
{
	static Thread mainthread;
	public void run()
	{
		try{mainthread.join();}catch(InterruptedException ex){}
		for(int i=1;i<=10;i++)
		System.out.println("Child Thread");
	}
}

class ThreadTest
{
 public static void main(String arg[])
 {
	A.mainthread=Thread.currentThread();
	A ob=new A();
	Thread t1=new Thread(ob);
	t1.start();
	for(int i=1;i<=10;i++)
	System.out.println("Main Thread");
	
 }
}

/*
Output:
Main Thread
Main Thread
Main Thread
.
.
.
Child Thread
Child Thread
Child Thread
.
.
*/



