//BufferedReader and BufferedWriter Example:
import java.io.*;

public class MyBufferedReaderWriter 
{
    public static void main(String[] args) throws Exception 
    {
            //creating file objects for reading and writing disk files
        File infile=new File("d:\\A.txt");
        File outfile=new File("d:\\B.txt");
            //creating streams and readers for reading from disk file
        FileInputStream fis = null; 
        InputStreamReader isr = null;
        BufferedReader br = null;
            //creating streams and writers for writing into disk file
        FileOutputStream fos=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;

        try
        {
                //connecting stream with file and reader with stream
            fis = new FileInputStream(infile);  //reading from infile
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
                //connecting stream with file and writer with stream
            fos = new FileOutputStream(outfile);    //writing into outfile
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            while(true)
            {
                int ch=br.read();   //reading one character at a time from "infile" file object
                if(ch==-1)  //checking for EOF
                    break;
                else
                {
                    bw.write(ch);   //writing the character into the buffer
                    bw.flush();     //pushing all the contents of the buffer into the disk file
                }
            }
               
 //closing all the input/output streams and readers/writers
            br.close();
            isr.close();
            fis.close();
            bw.close();
            osw.close();
            fos.close();
            System.out.println("Writing into disk file completed...now reading the written contents from file");
                //connecting stream with file and reader with stream
            fis = new FileInputStream(outfile); //reading from the outfile
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            while(true)
            {
                int ch=br.read();   //reading one character at a time from "outfile" file object
                if(ch==-1)  //checking for EOF
                    break;
                else
                {
                    System.out.print((char)ch);
                }
            }
        }


        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
                // releasing all streams, readers and writers
            if(fis!=null)
            fis.close();
            if(isr!=null)
            isr.close();
            if(br!=null)
            br.close();
            
            if(fos!=null)
            fos.close();
            if(osw!=null)
            osw.close();
            if(bw!=null)
            bw.close();
        }
    }
}
/*
Output:
Writing into disk file completed...now reading the written contents from file
This is a text file named A.txt
This a new line in A.txt
*/