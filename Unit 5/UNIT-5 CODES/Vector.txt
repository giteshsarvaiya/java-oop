import java.util.*;
import java.io.*;
 
public class MyVector
{
    public static void main(String cmdln[])
    {
        Vector v=new Vector();
        String inpt[]=new String[5];
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader reader=new BufferedReader(isr);        
        try
        {
            for(int i=0;i < inpt.length;i++)
            {
                System.out.println("Enter a String: ");
                inpt[i]=reader.readLine();
            }
        }catch(Exception e)
        {
            System.out.println("Error: "+e);
        }

        System.out.println("\nUsing addElement() and elementAt()");
        for(int i=0;i < inpt.length;i++)
        {
                v.addElement(inpt[i]);
        }
        for(int i=0;i < v.size();i++)
        {
                String str1=(String)v.elementAt(i);
                System.out.println("Vector Element:- "+ str1);
        }

        System.out.println("\nNumber of Elements in the Vector is:- "+v.size());

        System.out.println("\nUsing insertElementAt()");
        String str2 = "INSERTED ELEMENT";
        v.insertElementAt(str2,1);
        System.out.println("\nNumber of Elements in the Vector is:- "+v.size());
        for(int i=0;i < v.size();i++)
        {
                String str1=(String)v.elementAt(i);
                System.out.println("Vector Element:- "+ str1);
        }

        System.out.println("\nUsing removeElementAt()");		
        v.removeElementAt(1);
        System.out.println("\nNumber of Elements in the Vector is:- "+v.size());
        for(int i=0;i < v.size();i++)
        {
                String str1=(String)v.elementAt(i);
                System.out.println("Vector Element:- "+ str1);
        }

        System.out.println("\nUsing setElementAt()");		
        String str3 = "CHANGED ELEMENT";
        v.setElementAt(str3,1);
        System.out.println("\nNumber of Elements in the Vector is:- "+v.size());
        for(int i=0;i < v.size();i++)
        {
                String str1=(String)v.elementAt(i);
                System.out.println("Vector Element:- "+ str1);
        }

        System.out.println("\nUsing contains()");		
        System.out.println("Does the String CHANGED ELEMENT exist in Vector? :- "+ v.contains(str3));
        String str4="NEW ELEMENT";
        System.out.println("Does the String NEW ELEMENT exist in Vector? :- "+ v.contains(str4));

        System.out.println("\nUsing removeAllElements()");		
        v.removeAllElements();
        System.out.println("\nNumber of Elements in the Vector is:- "+v.size());
        for(int i=0;i < v.size();i++)
        {
                String str1=(String)v.elementAt(i);
                System.out.println("Vector Element:- "+ str1);
        }
        System.out.println("Nothing is Displayed as Vector is completely empty");

    }
}