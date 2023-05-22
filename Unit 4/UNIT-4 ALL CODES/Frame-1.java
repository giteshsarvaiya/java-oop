/*
Example code for Frame:
(this code would create a frame that cannot be closed as event handling code is not present)
*/

import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

class MyFrame extends Frame
{
    BufferedImage img=null;
    File imgFile=new File("d:\\duke_skateboard.jpg");//use any jpg file
    MyFrame()
    {
        try
        {            
            img=ImageIO.read(imgFile);
        }catch(Exception ex){}
        this.setIconImage(img);
        this.setTitle("My Frame");
        this.setLocation(50,50);
        this.setSize(500,500);
        this.setVisible(true);
    }
}
public class MyFrameTest 
{
    public static void main(String arg[])
    {
        MyFrame f=new MyFrame();
    }    
}
