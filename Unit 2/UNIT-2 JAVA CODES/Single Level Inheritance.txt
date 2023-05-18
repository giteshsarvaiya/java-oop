// Single Level Inheritance Example:

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
public class SingleInherit {

    public static void main(String[] args) {
        B ob=new B();
    }
    
}
/*
Output:
Constructor of class-A called
Constructor of class-B called
*/
