//FileInputStream and FileOutputStream Example:
import java.io.*;

public class MyFileStreams 
{
    public static void main(String arg[])
    {
            //creating file objects for reading and writing
        File f1=new File("D:\\A.txt");
        File f2=new File("D:\\B.txt");
        try
        {
                //creating instances of input and output file streams
            FileInputStream fis=new FileInputStream(f1);
            FileOutputStream fos=new FileOutputStream(f2,true); 
                                    //true makes append possible
                                    //false would overwrite the old contents
            while(true)
            {
                int ch=fis.read();  //reading one byte at a time from the file
                if(ch==-1)  //checking EOF
                    break;
                else
                fos.write(ch);  //writing one byte at a time to the file
            }
                    //closing the file streams
            fis.close();
            fos.close();
                    //creating a file stream instance to read from a file
            FileInputStream fis2=new FileInputStream(f2);
            while(true)
            {
                int ch2=fis2.read();  //reading one byte at a time from the file    
                if(ch2==-1) //checking EOF
                    break;
                else
                    System.out.print(""+(char)ch2); //printing the contents of the file in the console output
            }
            fis2.close();   //closing the file stream
        }
        catch(Exception ex){}
    }    
}

/*
Output:
This is a text file named A.txt
This a new line in A.txt
*/