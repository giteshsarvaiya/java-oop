

/*
LIST interface
interface List extends Collection
An Unordered collection of Heterogenous objects
Duplicates allowed
Implemented by: 
ArrayList, LinkedList, Vector
*/

import java.util.*;

public class ListDemo
{

   public static void main(String[] args) 
   {
      List a1 = new ArrayList();
      a1.add("Three");
      a1.add("One");
      a1.add("Two");
      a1.add(new Integer(10));
      a1.add("Two");
      a1.add("Four");
      a1.add(new Integer(1));
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);

      List a2 = new ArrayList(); // to sort its elements we need a homogenous list
      a2.add("Three");
      a2.add("One");
      a2.add("Two");
      //a2.add(new Integer(10));
      a2.add("Two");
      a2.add("Four");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a2);
      Collections.sort(a2);
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a2);

      List l1 = new LinkedList();
      l1.add("Three");
      l1.add("One");
      l1.add("Two");
      l1.add(new Integer(10));
      l1.add("Two");
      l1.add("Four");
      l1.add(new Integer(1));
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

   }
}





