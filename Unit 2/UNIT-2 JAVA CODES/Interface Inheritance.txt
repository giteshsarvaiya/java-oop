//Interface Inheritance

interface Mammal
{
    public void setLegs(int l);
    public void getLegs();
}
class Cow implements Mammal
{
    int legcnt;
    public Cow(){ System.out.println("Iam a Cow"); }
    public void setLegs(int l){ legcnt=l; }
    public void getLegs(){ System.out.println("I have "+legcnt+" Legs"); }
}
class Person implements Mammal
{
    int legcnt;
    public Person(){ System.out.println("Iam a Person"); }
    public void setLegs(int l){ legcnt=l; }
    public void getLegs(){ System.out.println("I have "+legcnt+" Legs"); }
}
public class MyClass {
    public static void main(String args[]) {
      Cow c=new Cow();
      c.setLegs(4);
      c.getLegs();
      Person p=new Person();
      p.setLegs(2);
      p.getLegs();
    }
}

/*
Output:
Iam a Cow
I have 4 Legs
Iam a Person
I have 2 Legs
*/