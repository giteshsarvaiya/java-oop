

/*
SET interface
interface Set extends Collection.
No duplicate elements.
Same methods as Collection.
Implemented by: HashSet, TreeSet
*/

import java.util.*;

public class SetDemo 
{

   public static void main(String[] args) 
   {
      
      Set s1 = new HashSet(); //Heterogenous set, Unordered, No Duplicates
      s1.add("One");
      s1.add("Three");
      s1.add("Two");
      s1.add("Two");
      s1.add("Four");
      s1.add("B");
      s1.add("A");
      s1.add(new Integer(3));
      s1.add(new Integer(2));
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);
      
      s1 = new TreeSet(); //Homogenous set, Sorted, No Duplicates
      s1.add("One");
      s1.add("Three");
      s1.add("Two");
      s1.add("Two");
      s1.add("Four");
      s1.add("B");
      s1.add("A");
      //s1.add(new Integer(3)); Integers not allowed as the set will be Strings only
      //s1.add(new Integer(2)); as the first object is String
      System.out.println();
      System.out.println(" Set Elements");
      System.out.print("\t" + s1);
   }
}





