//Example when an exception occurs, which is handled by the JVM

class A
{
    void test(){System.out.println("Class-A test()");}
}
public class MyException1 
{
    public static void main(String arg[])
    {
        System.out.println("stmt1");
        try
        {
            A ob1=new A();
            System.out.println("stmt2");
            A ob2=null;
            System.out.println("stmt3");
            ob1.test();
            System.out.println("stmt4");            
            ob2.test();            
            System.out.println("stmt5");
        }catch(Exception ex)
        {
            System.out.println("stmt6: "+ex);
            int a=10/0;
        }
        finally
        {
            System.out.println("stmt7");
        }
        System.out.println("stmt8");
        }    
}

/*
Output:
stmt1
stmt2
stmt3
Class-A test()
stmt4
stmt6: java.lang.NullPointerException
stmt7
Exception in thread "main" java.lang.ArithmeticException: / by zero
	At MyException1.main(MyException1.java:26)
Java Result: 1
*/