
/*
MAP interface
interface Map (does not extend Collection)
An object that maps keys to values
Each key can have at most one value
Implemented by: 
HashMap, TreeMap, Hashtable
*/

import java.util.*;

public class MapDemo 
{
   public static void main(String[] args) 
   {
      Map m1 = new HashMap(); // Un-Sorted, No Duplicates
      m1.put("Three", "8");
      m1.put("One", "31");
      m1.put("Two", "12");
      m1.put("Four", "2");
      m1.put("Four", "9");
      m1.put("Four", "9");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
      
      Map m2 = new TreeMap(); // Sorted, No Duplicates
      m2.put("3", "8");
      m2.put("1", "31");
      m2.put("2", "12");
      m2.put("4", "2");
      m2.put("4", "9");
      m2.put("4", "9");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m2);
   }
}


