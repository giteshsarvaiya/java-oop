//Class Inheritance

class Animal
{
    public Animal(){ System.out.println("Iam an Animal"); }
}
class Cow extends Animal
{
    public Cow(){ System.out.println("Iam a Cow"); }
}
public class MyClass {
    public static void main(String args[]) {
      Cow c=new Cow();
      System.out.println("Cow IS-An Animal: "+ (c instanceof Animal));
    }
}

/*
Output:
Iam an Animal
Iam a Cow
Cow IS-An Animal: true
*/