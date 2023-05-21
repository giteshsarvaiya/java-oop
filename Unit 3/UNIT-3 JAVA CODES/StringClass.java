//String class methods
public class MyString
{
    public static void main(String args[])
    {
        String str1="HELLO";
        String str2=new String();
        String str3=new String("Welcome");
        char ar[]=new char[5];
        for(int i=0;i < 5;i++)
        {
            ar[i]=(char) 'Z';
        }
        String str4=new String(ar);
        System.out.println(" Str1 = > " + str1+" : str1.length(): "+str1.length());
        System.out.println(" Str2 = > " + str2+" : str2.length(): "+str2.length());
        System.out.println(" Str3 = > " + str3+" : str3.length(): "+str3.length());
        System.out.println(" Str4 = > " + str4+" : str4.length(): "+str4.length());
        String str5[]=new String[5];
        for(int i=0;i < 5;i++)
        {
            str5[i]=String.valueOf(i);
        }
        String str6="";
        for(int i=0;i < 5;i++)
        {
            str6 += str5[i];
        }
        System.out.println(str6);
        for(int i=0 ; i < str1.length() ;i++)
        {
            System.out.println(str1.charAt(i));
        }
        


        String str7="welcome";
        int result=str7.compareTo(str3);
        System.out.println("Result of Comparison of "+ str7 + " with " +str3+ " not ignoring case is = > "+result);
        result=str7.compareToIgnoreCase(str3);
        System.out.println("Result of Comparison of "+ str7 + " with " +str3+ " ignoring case is = > "+result);
        System.out.println("Index of B in string ABC = > "+ "ABC".indexOf( 'B' ));
        char ar2[]=str1.toCharArray();
        for(int i=0;i < ar2.length;i++)
        {
            System.out.println(ar2[i]);
        }
        String str8="ABCDEFGHIJKL";
        String str9=str8.substring(2,5);//from index 2 to index 4
        System.out.println("Substring = > " +str9);
        String str10="mnopqrstuvw";
        System.out.println("Converted str8 " + str8 + " to lowercase = > "+str8.toLowerCase());
        System.out.println("Converted str10 " + str10 + " to uppercase = > "+str10.toUpperCase());
        String str11="abc123abc123abc123";
        String str12=str11.replace("abc", "ABC");
        System.out.println("str11.replace(abc, ABC): " + str12);
        String str13=str11.replace('a', 'Z');
        System.out.println("str11.replace(a, Z): " + str13);
        String str14="abc";
        String str15="ABC";
        boolean b1=str14.equals(str15);
        boolean b2=str14.equalsIgnoreCase(str15);
        System.out.println("abc.equals(ABC): "+b1);
        System.out.println("abc.equalsIgnoreCase(ABC): "+b2);
        boolean b3=str11.contains("123");
        System.out.println("astr11.contains(123): "+b3);
        String str16="MyFile.txt";
        boolean b4=str16.endsWith("txt");
        System.out.println("str16.endsWith(txt): "+b4);
        int hc=str16.hashCode();
        System.out.println("str16.hashCode(): "+hc);
        str16="   "+str16+"   ";
        String str17=str16.trim();
        System.out.println("str16 before trimming: "+str16+" length="+str16.length());
        System.out.println("str16 after trimming: "+str17+" length="+str17.length());
 }
}

