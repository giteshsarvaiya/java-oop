//Example of JScrollPane-1:
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

class MyJScrollPane extends JFrame
{
    JPanel p1=new JPanel();
    JScrollPane jsp=null;
    JButton b1=new JButton("BUTTON-1");
    JButton b2=new JButton("BUTTON-2");
    JButton b3=new JButton("BUTTON-3");
    JButton b4=new JButton("BUTTON-4");
    MyJScrollPane()
    {
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);        
        jsp=new JScrollPane(p1);
        this.add(jsp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}

public class MyJScrollPaneTest 
{
    public static void main(String arg[])
    {
        new MyJScrollPane();
    } 
}
