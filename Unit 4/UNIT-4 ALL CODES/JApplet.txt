//Example of a JApplet:
import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyJAppletTest extends Applet
{
    JTextArea ta=new JTextArea("",5,50);
    JScrollPane jsp=new JScrollPane(ta);
    String msg="\n";
    public void init()
    {
        ta.append("\nApplet's init() method called");
        add(jsp);
    }
    public void start()
    {
        ta.append("\nApplet's start() method called");
    }
    public void stop()
    {
        ta.append("\nApplet's stop() method called");
    }
    public void destroy()
    {
        ta.append("\nApplet's destroy() method called");
    }
    public void paint(Graphics g)
    {   
        ta.append("\nApplet's paint() method called");
    }    
}

HTML code to run this Japplet in a web-browser:
<applet code="MyJAppletTest.class" width="700" height="700">  </applet>
