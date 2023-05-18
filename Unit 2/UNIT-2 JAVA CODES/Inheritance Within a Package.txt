package MyPack1;
//Inheritance within a Package

public class A  //had to declare class-A as public as we want to use it in another package
{
    void test1()    // accessible to classes only within the package and to the child classes
    {
        System.out.println("This is test1() from Class-A");
    }

    private void test2()    //not accessible to any class outside this class
    {
        System.out.println("This is test2() from Class-A");
    }
    protected void test3()  //accessible to classes only within the package and to the child classes
    {
        System.out.println("This is test3() from Class-A");
    }
    public void test4() //accessible to all classes within and outside the package
    {
        System.out.println("This is test4() from Class-A");
    }
}
class B extends A
{
    void test5()    //accessible to classes only within the package and to the child classes
    {
        System.out.println("This is test5() from Class-B");
    }
    private void test6()    //not accessible to any class outside this class
    {
        System.out.println("This is test6() from Class-B");
    }
    protected void test7()  //accessible to classes only within the package and to the child classes
    {
        System.out.println("This is test7() from Class-B");
    }
    public void test8() //accessible to all classes within and outside the package
    {
        System.out.println("This is test8() from Class-B");
    }
}

class InheritTest 
{
    public static void main(String arg[])    {
        B ob=new B();
        ob.test1();
        //ob.test2(); //cannot be accessed as its not inherited
        ob.test3();
        ob.test4();
        ob.test5();
        //ob.test6(); //cannot be accessed from outside the class
        ob.test7();
        ob.test8();
    }    
}

/*
Output:
This is test1() from Class-A
This is test3() from Class-A
This is test4() from Class-A
This is test5() from Class-B
This is test7() from Class-B
This is test8() from Class-B
*/
