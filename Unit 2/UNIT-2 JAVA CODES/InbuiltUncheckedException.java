//Inbuilt un-checked exception example:

public class Test 
{
    public static void main(String[] args)
    {
        System.out.println("main start"); //executed normally
        int a=10/0;	//generated exception
        System.out.println("main end"); //not executed due to abnormal program termination
    }    
}

/*
Output:
main start
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Test.main(Test.java:6)
Java Result: 1
*/