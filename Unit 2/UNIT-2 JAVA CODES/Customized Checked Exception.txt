//Customized checked exception example:

class A extends Exception
{
    public String toString(){return "MY EXCEPTION";}
}
class B
{
    public void test() throws A
    {
        throw new A();
    }
            
}
public class Test 
{
    public static void main(String[] args)
    {
        try {
            B ob=new B();
            ob.test();            
        } catch (A ex) {
            System.out.println("Caught:"+ex);
        }
        System.out.println("main end"); //executed as program ended normally
    }    
}

/*
Output:
Caught:MY EXCEPTION
main end
*/