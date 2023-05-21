import java.util.Scanner;

interface Shape
{
    public void area();
}

class Circle implements Shape
{
    int r;
    public void area()
    {        
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter Radius");
        r=sc.nextInt();
        System.out.println("\n Area = " + (r*r));
    }
}

class Rectangle implements Shape
{
    int l,h;
    public void area()
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("\n Enter Length");
        l=reader.nextInt();
        System.out.println("\n Enter Heigth");
        h=reader.nextInt();
        System.out.println("\n Area = " + (l*h));
    }
}
public class NewClass
{
    public static void main(String arg[])
    {
        Shape ob;
        while(true)
        {
            System.out.println("\n MENU");
            System.out.println("Enter 1 for Circle ");
            System.out.println("Enter 2 for Rectangle ");
            System.out.println("Enter 3 to Exit");            
            Scanner reader=new Scanner(System.in);
            int inpt=reader.nextInt();
            switch(inpt)
            {
                case 1: ob=new Circle();
                        ob.area();	//area() of Circle class would be bound to this call to area()
                        break;
                case 2: ob=new Rectangle();
                       ob.area();	//area() of Rectangle class would be bound to this call to area()
                        break;
                case 3: return;
            }
            
        }
    }
}
