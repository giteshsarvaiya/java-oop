//Example of File class methods:
import java.io.*;

public class NewClass7 
{
    public static void main(String arg[]) throws IOException
    {
        File f1=new File("MyFile.txt");
         //Constructor: File(String  fname)
         //The file class object f1 points towards MyFile.txt in
         //the local working directory(as path not specified) if the file exists.
         //This statement will not create a new file if the file does not exists
         //physically in the system.
        System.out.println(f1.exists());
         //public boolean exists()
         //would return false as the file MyFile.txt not present in the current
         //working directory.
        f1.createNewFile();
         //public boolean createNewFile() throws IOException
         //Physically creates a file pointed by f1.
        System.out.println(f1.exists());
         //would return true as the file is physically present.
        File f2=new File("D:\\MyFolder\\MyFile.txt");
         //Constructor: File(String  pathname_with_filename)
         //File class object f2 points towards Myfile.txt present in
         //D:\MyFolder, if it exists physically in the hard disk.
         //Otherwise it would virtually point to it.
        System.out.println(f2.exists());
        	//would return false if the file pointed by f2 does not exist physially.
        File f3=new File("D:\\MyFolder");
        	//Constructor: File(String  path_with_directory_name)
        	//File object f3 points to a directory MyFolder in D: if it exists physically.
        f3.mkdir();
        	//creates MyFolder directory in D:
        f2.createNewFile();
        	//creates MyFile.txt in D:\MyFolder
        System.out.println(f2.exists());
       	 //would return true as the file pointed by f2 is physically present.
        File f4=new File("D:\\DepartmentalWork");
        	//f4 points to an already existing directory DepartmentalWork in D: drive
        String names[]=f4.list();
        	//public String[] list()
        	//returns a String array containing the names of all the directories
        	//and files present in the directory pointed by the file class object
        	//calling the method.
        for(String s1:names) //for(datatype variable-name : array-name)
        {
            System.out.println(s1);
        }
       	 //the data type of variable-name should match with the datatype 
        	//of contents of array-name
        System.out.println(f2.isFile());
        	//public boolean isFile()
       	 //returns true if the file object points towards a file.
        System.out.println(f2.isDirectory());
        	//public boolean isDirectory()
        	//returns true if the file object points towards a Directory.
        System.out.println(f4.isDirectory());
        f2.delete();
        	//public boolean delete()
        	//deletes the file or directory pointed by the file class object.
        System.out.println(f2.exists());
        	//would return false.
    }
}
