//Example of JPanel:

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyJFrame2 extends JFrame
{
    JPanel p1=new JPanel();
    MyJFrame2()
    {
        p1.setBackground(Color.yellow);
        this.add(p1);
        this.setLocation(50,50);
        this.setSize(500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);        
    }
}
public class MyJPanelTest 
{
    public static void main(String arg[])
    {
        new MyJFrame2();
    }    
}
