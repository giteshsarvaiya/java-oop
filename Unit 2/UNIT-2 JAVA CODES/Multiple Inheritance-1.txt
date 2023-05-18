// Multiple Inheritance example (using class and interface both):

class A
{
    public A()
    {
        System.out.println("Constructor of class-A called");
    }
}
interface B
{
    public final int v1=100;
    public void test();
}
class C extends A implements B
{
    public C()
    {
        System.out.println("Constructor of class-C called");
    }
    public void test()
    {
        System.out.println("test() has to be overridden or implemented here in class C");
        System.out.println("value of v1="+v1+" cannot be changed");
    }
}

public class MyInherit {

    public static void main(String[] args) {
        C ob=new C();
        ob.test();
    }    
}

/*
Output:
Constructor of class-A called
Constructor of class-C called
test() has to be overridden or implemented here in class C
value of v1=100 cannot be changed
*/