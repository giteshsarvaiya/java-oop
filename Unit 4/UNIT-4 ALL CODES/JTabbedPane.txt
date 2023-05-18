//Example of JTabbedPane:
import java.awt.Color;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

class MyJTab extends JFrame
{
    Panel p1=new Panel();
    Panel p2=new Panel();
    Panel p3=new Panel();
    JLabel l1=new JLabel("This is Label in Panel1");
    JLabel l2=new JLabel("This is Label in Panel2");
    JLabel l3=new JLabel("This is Label in Panel3");
    ImageIcon ico=null;
    JTabbedPane jtb=new JTabbedPane();
    MyJTab()
    {
        p1.setBackground(Color.yellow);
        p2.setBackground(Color.green);
        p3.setBackground(Color.cyan);
        p1.add(l1);
        p2.add(l2);
        p3.add(l3);
        ico=new ImageIcon("D:\\sound.gif");
        jtb.addTab("TAB1", p1);
        jtb.setIconAt(0, ico);
        jtb.setToolTipTextAt(0, "Tool Tip for TAB1");
        ico=new ImageIcon("D:\\middle.gif");
        jtb.addTab("TAB2", p2);
        jtb.setIconAt(1, ico);
        jtb.setToolTipTextAt(1, "Tool Tip for TAB2");
        ico=new ImageIcon("D:\\save.gif");
        jtb.addTab("TAB3", p3);
        jtb.setIconAt(2, ico);
        jtb.setToolTipTextAt(2, "Tool Tip for TAB3");
        this.add(jtb);
        this.setSize(500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
public class MyJTabbedPaneTest 
{
    public static void main(String arg[])
    {
        new MyJTab();
    }
}
