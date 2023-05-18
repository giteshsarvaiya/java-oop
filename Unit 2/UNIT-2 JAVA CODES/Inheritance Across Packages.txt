package MyPack2;
import MyPack1.A;
//Inheritance across packages

class C extends A
{
    void test9()    // accessible to classes only within the package and to the child classes
    {
        System.out.println("This is test9() from Class-C");
    }
    private void test10()    //not accessible to any class outside this class
    {
        System.out.println("This is test10() from Class-C");
    }
    protected void test11()  // accessible to classes only within the package and to the child classes
    {
        System.out.println("This is test11() from Class-C");
    }
    public void test12() //accessible to all classes within and outside the package
    {
        System.out.println("This is test12() from Class-C");
    }
}
public class InheritTest 
{
    public static void main(String arg[])
    {
        C ob=new C();
        //ob.test1(); //did not get inherited as we are outside the package where test1() is declared
        //ob.test2(); //did not get inherited as it is declared as private
        //ob.test3(); //did not get inherited as it is declared as protected
        ob.test4(); //got inherited as it is declared public
        ob.test9();
        //ob.test10(); //cannot be accessed as it is declared private
        ob.test11();
        ob.test12();        
    }
}

/*
Output:
This is test4() from Class-A
This is test9() from Class-C
This is test11() from Class-C
This is test12() from Class-C
*/