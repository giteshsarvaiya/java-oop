/*
Example of Panel:
(this code would create a frame that cannot be closed as event handling code is not present)
*/
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

class MyFrame2 extends Frame
{
    Panel p1=new Panel();
    MyFrame2()
    {
        p1.setBackground(Color.red);
        this.add(p1);
        this.setLocation(50,50);
        this.setSize(500,500);
        this.setVisible(true);        
    }
}




public class MyPanelTest 
{
    public static void main(String arg[])
    {
        MyFrame2 f=new MyFrame2();
    }    
}
