//InputStreamReader and OutputStreamWriter Example:

import java.io.*;

public class StreamReaderWriter 
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
            FileOutputStream fos=new FileOutputStream(f2,false); 
                                    //true makes append possible
                                    //false would overwrite the old contents
            InputStreamReader isr=new InputStreamReader(fis);
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            while(true)
            {
                int ch=isr.read();  //reading one character at a time from the file
                if(ch==-1)  //checking EOF
                    break;
                else
                osw.write(ch);  //writing one character at a time to the stream writer
                osw.flush();    //writing character data into the file
            }
                    //closing the streams
            osw.close();
            isr.close();
            fis.close();
            fos.close();
                    //creating a file stream instance to read from a file
            FileInputStream fis2=new FileInputStream(f2);
            InputStreamReader isr2=new InputStreamReader(fis2);
            while(true)
            {
                int ch2=isr2.read();  //reading one character at a time from the file    
                if(ch2==-1) //checking EOF
                    break;
                else
                    System.out.print(""+(char)ch2); //printing the contents of the file in the console output
            }
            isr2.close();
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