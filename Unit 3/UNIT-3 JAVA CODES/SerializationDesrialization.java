//Serialization and De-Serialization basic Example:
import java.io.*;
class C1  implements Serializable
{
    int i=10;
    int j=20;
}
public class NewClass10 
{
    public static void main(String ar[]) throws Exception
    {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\SerFile.txt"));
        C1 ob1=new C1();
        ob1.i=100;
        ob1.j=100;
        System.out.println("Before Serialization:");
        System.out.println(ob1.i+"......"+ob1.j);        
        oos.writeObject(ob1);
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\SerFile.txt"));
        C1 ob2=(C1)ois.readObject();
        System.out.println("After De-Serialization:");
        System.out.println(ob2.i+"......"+ob2.j);
    }
}

/*
Output:
Before Serialization:
100......100
After De-Serialization:
100......100
*/