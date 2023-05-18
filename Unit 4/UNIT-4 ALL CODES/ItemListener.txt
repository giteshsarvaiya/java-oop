//Example of ItemListener:
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

class MyItem extends JFrame implements ItemListener
{
    JPanel jp=new JPanel();
    JLabel jlb=new JLabel("This is JLabel");
    JCheckBox jcb=new JCheckBox("Hide Label");
    JTextArea jta=new JTextArea(10,10);
    JScrollPane jsp=new JScrollPane(jta);
    MyItem()
    {
        jcb.addItemListener(this);
        jp.add(jlb);
        jp.add(jcb);
        jp.add(jsp);
        this.add(jp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
        if(jcb.isSelected())
        {
            jlb.setVisible(false);
            jta.append("\nJLabel Invisible");
        }
        else
        {
            jlb.setVisible(true);
            jta.append("\nJLabel Visible");
        }
    }    
}
public class NewClass 
{
    public static void main(String arg[])
    {
        new MyItem();
    }
}
