//Method Overloading Example

class MyClass1
{
    public void add(int i,int j)
    {
        int sum=i+j;
        System.out.println("Sum= "+sum);
    }
    public void add(int i,int j,int k)
    {
        int sum=i+j+k;
        System.out.println("Sum= "+sum);
    }
    public void add(double i,double j)
    {
        double sum=i+j;
        System.out.println("Sum= "+sum);
    }
}
public class MethodOverloading 
{
    public static void main(String arg[])
    {
        MyClass1 ob=new MyClass1();
        ob.add(10.5, 20.25);    //add with two double input arguments is called
        ob.add(10, 20);         //add with two int input arguments is called
        ob.add(10, 20, 30);     //add with three int input arguments is called
    }
    
}

/*
Output:
Sum= 30.75
Sum= 30
Sum= 60
*/