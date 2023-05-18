//Example of JFrame:
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

class MyJFrame extends JFrame
{
    BufferedImage img=null;
    File imgFile=new File("d:\\duke_skateboard.jpg");
    MyJFrame()
    {
        try
        {            
            img=ImageIO.read(imgFile);
        }catch(Exception ex){}        
        this.setIconImage(img);        
        this.setLocation(50,50);
        this.setSize(500,500);
        this.setVisible(true);
    }
}
public class MyJFrameTest 
{
    public static void main(String arg[])
    {
        MyJFrame f=new MyJFrame();
        f.setTitle("EXIT_ON_CLOSE Frame");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyJFrame f2=new MyJFrame();
        f2.setTitle("DISPOSE_ON_CLOSE Frame");
        f2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }    
}
