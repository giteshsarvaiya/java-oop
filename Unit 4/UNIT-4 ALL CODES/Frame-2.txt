//Example of Frame with opacity setting:
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

class MyFrame extends Frame
{
    Panel p=new Panel();
    Label l=new Label("This is a Label");
    Button b=new Button("This is a BUTTON");
    MyFrame()
    {
        p.add(l);
        p.add(b);
        this.add(p);
        this.setUndecorated(true);
        this.setOpacity(0.8f);
        this.setSize(500,500);
        this.setVisible(true);
    }
}
public class NewClass1 
{
    public static void main(String arg[])
    {
        new MyFrame();
    }
}
