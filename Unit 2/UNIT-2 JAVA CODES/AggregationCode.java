//Aggregation
class Wheel
{
    private String type;
    private int dia;
    public void fill(String t,int d){ type=t; dia=d; }
    public void show(){ System.out.println("Wheel Type: "+type+" Wheel Diameter (inches): "+dia); }
}
class Car 
{
    Wheel wheels[]=new Wheel[4];
    public void fill(){
        for(int i=0;i<3;i++)
        {
            wheels[i]=new Wheel();
            wheels[i].fill("Tubeless",20);
        }
    }
    public void show(){
        for(int i=0;i<3;i++)
        {
            wheels[i].show();
        }
    }
}
public class MyClass {
    public static void main(String args[]) {
      Car c1=new Car();
      c1.fill();
      c1.show();
    }
}

/*
Output:
Wheel Type: Tubeless   Wheel Diameter (inches): 20
Wheel Type: Tubeless   Wheel Diameter (inches): 20
Wheel Type: Tubeless   Wheel Diameter (inches): 20
*/
