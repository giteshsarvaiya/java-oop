//Example of ContainerListener:
import java.awt.event.*;
import javax.swing.*;

class MyContainer extends JFrame implements ContainerListener, ActionListener
{
    JPanel jp1=new JPanel();
    JPanel jp2=new JPanel();
    JSplitPane jspn=null;
    JLabel jlb=new JLabel("Dynamically Adding/Removing Components");
    JButton jbadd=new JButton("Click to Add Button");
    JButton jbremove=new JButton("Click to Remove Button");
    JTextArea jta=new JTextArea(20,20);
    JScrollPane jsp1=new JScrollPane(jp1);
    JScrollPane jsp2=new JScrollPane(jp2);
    
    MyContainer()
    {
        jp1.setBorder(BorderFactory.createTitledBorder("This is PANEL1"));
        jp2.setBorder(BorderFactory.createTitledBorder("This is PANEL2"));
        jp1.add(jbadd);
        jp1.add(jbremove);
        jp1.add(jta);
        jp2.add(jlb);
        jbadd.addActionListener(this);
        jbremove.addActionListener(this);
        jp2.addContainerListener(this);
        jspn=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jsp1,jsp2);
        this.add(jspn);
        this.setSize(900,900);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    } 
 @Override
    public void componentAdded(ContainerEvent e) 
    {        
        jta.append("\nNew Button Added to Panel");
    }

    @Override
    public void componentRemoved(ContainerEvent e) 
    {
        jta.append("\nNew Button Removed from Panel");
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        JButton b1=new JButton("NEW Button");
        if(e.getSource()==jbadd)
        {            
            jp2.add(b1,1);
        }
        if(e.getSource()==jbremove)
        {
            jp2.remove(1);
        }
        this.pack();
    }
}
public class NewClass 
{
    public static void main(String arg[])
    {
        new MyContainer();
    }
}
