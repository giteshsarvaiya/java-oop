// Hierachical Inheritance Example:

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

class C extends A
{
    public C()
    {
        System.out.println("Constructor of class-C called");
    }
}
public class MyInherit {

    public static void main(String[] args) {
        B ob1=new B();
        C ob2=new C();
    }    
}

/*
Output:
Constructor of class-A called
Constructor of class-B called
Constructor of class-A called
Constructor of class-C called
*/