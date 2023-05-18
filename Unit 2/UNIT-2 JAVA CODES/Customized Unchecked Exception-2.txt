//Customized Unchecked Exception

class A extends RuntimeException
{
    public String toString(){return "MY EXCEPTION";}
}
class B
{
    public void test()
    {
        throw new A();
    }
            
}
public class Test 
{
    public static void main(String[] args)
    {
        B ob=new B();
        ob.test();
        System.out.println("main end"); //not executed as program is terminated abnormally
    }    
}

/*
Output: 
Exception in thread "main" MY EXCEPTION
	at B.test(Test.java:9)
	at Test.main(Test.java:18)
Java Result: 1
*/