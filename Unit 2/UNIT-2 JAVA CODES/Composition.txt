//Composition
class Brain
{
    public Brain(){ System.out.println("Iam the Brain"); }
}
class Heart
{
    public Heart(){ System.out.println("Iam the Heart"); }
}
class Leg
{
    public Leg(){ System.out.println("Iam the Leg"); }
}
class Person
{
    Brain b=new Brain();
    Heart h=new Heart();
    Leg l=new Leg();
    public Person(){ System.out.println("Iam a Person"); }
}
public class MyClass {
    public static void main(String args[]) {
      Person p=new Person();
    }
}
/*
Output:
Iam the Brain
Iam the Heart
Iam the Leg
Iam a Person
*/
