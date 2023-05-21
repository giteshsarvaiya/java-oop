// Multi Level Inheritance Example:

class A
{
    public A()
    {
        System.out.println("Constructor of class-A called");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("Constructor of class-B called");
    }
}

class C extends B
{
    public C()
    {
        System.out.println("Constructor of class-C called");
    }
}
public class MyInherit {

    public static void main(String[] args) {
        C ob=new C();
    }    
}

/*
Output:
Constructor of class-A called
Constructor of class-B called
Constructor of class-C called
*/