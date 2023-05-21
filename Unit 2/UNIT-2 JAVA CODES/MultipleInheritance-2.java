// Multiple Inheritance (using interfaces ):

interface A
{
    public final int v1=100;
    public void test1();
}
interface B
{
    public final int v2=100;
    public void test2();
}


class C implements A,B
{
    public C()
    {
        System.out.println("Constructor of class-C called");
        System.out.println("value of v1="+v1+" cannot be changed");
        System.out.println("value of v2="+v2+" cannot be changed");
    }
    public void test1()
    {
        System.out.println("test1() has to be overridden or implemented here in class C");        
    }
    public void test2()
    {
        System.out.println("test2() has to be overridden or implemented here in class C");        
    }
}






public class MyInherit {

    public static void main(String[] args) {
        C ob=new C();
        ob.test1();
        ob.test2();
    }    
}

/*
Output:
Constructor of class-C called
value of v1=100 cannot be changed
value of v2=100 cannot be changed
test1() has to be overridden or implemented here in class C
test2() has to be overridden or implemented here in class C
*/