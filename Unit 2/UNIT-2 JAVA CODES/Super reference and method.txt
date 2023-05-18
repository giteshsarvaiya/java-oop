//Super method and Reference

class A
{
    public A()
    {
        System.out.println("Default Constructor of Class-A");
    }
    public A(int i)
    {
        System.out.println("Parameterized Constructor of Class-A");
    }
    void test()
    {
        System.out.println("test() method in Class-A");
    }
}
class B extends A
{
    public B()
    {
        super(10);
	//calling the parameterized constructor of parent class, i.e. class-A
	//this would not allow the default constructor to be called while
//creating class-A’s un-named instance inside class-B instance.

        System.out.println("Default Constructor of Class-B");
        super.test();
	//calling the test() method of parent class, i.e. class-A
    }
}
public class UsingSuper 
{
    public static void main(String arg[])
    {
        B ob=new B();
    }
}

/*
Output:
Parameterized Constructor of Class-A
Default Constructor of Class-B
test() method in Class-A
*/