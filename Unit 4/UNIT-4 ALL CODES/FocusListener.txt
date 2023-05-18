//Example of FocusListener:
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

class MyFocus extends JFrame implements FocusListener
{
    JPanel jp1=new JPanel();
    JLabel jlb=new JLabel("Clicking the Component Receives Focus");
    JButton jb=new JButton("BUTTON");
    JTextField jtf=new JTextField(20);
    JTextArea jta=new JTextArea(20,30);
    JScrollPane jsp=new JScrollPane(jta);
    
    MyFocus()
    {
        jb.addFocusListener(this);
        jtf.addFocusListener(this);
        jp1.add(jlb);
        jp1.add(jb);
        jp1.add(jtf);
        jp1.add(jsp);
        this.add(jp1);
        this.setSize(900,900);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    } 
    
    @Override
    public void focusGained(FocusEvent e) 
    {
        jta.append("\nFocus Gained By: "+e.getSource().getClass());
    }

    @Override
    public void focusLost(FocusEvent e) 
    {
        jta.append("\nFocus Lost By: "+e.getSource().getClass());
    }
}


public class NewClass 
{
    public static void main(String arg[])
    {
        new MyFocus();
    }
}
