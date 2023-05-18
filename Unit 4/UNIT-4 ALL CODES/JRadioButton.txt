//Example of JRadioButton:
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyJRadio extends JFrame implements ItemListener
{
    JPanel jp=new JPanel();
    JRadioButton jr1=new JRadioButton("RADIO-1");
    JRadioButton jr2=new JRadioButton("RADIO-2");
    JRadioButton jr3=new JRadioButton("RADIO-3");
    JRadioButton jr4=new JRadioButton("RADIO-4");
    ButtonGroup bg1=new ButtonGroup();
    ButtonGroup bg2=new ButtonGroup();
    JTextArea jta=new JTextArea(10,30);
    JScrollPane jsp=new JScrollPane(jta);
   
 MyJRadio()
    {
        bg1.add(jr1);
        bg1.add(jr2);
        bg2.add(jr3);
        bg2.add(jr4);
        jr1.addItemListener(this);
        jr2.addItemListener(this);
        jr3.addItemListener(this);
        jr4.addItemListener(this);
        jp.add(jr1);
        jp.add(jr2);
        jp.add(jr3);
        jp.add(jr4);
        jp.add(jsp);
        this.add(jp);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(1000,500);
        this.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) 
    {
        AbstractButton btn=(AbstractButton)ie.getSource();        
        String msg="\n Item Name: "+btn.getText()+" Item Checked? :"+btn.isSelected();
        jta.append(msg);
    }
}
public class MyJRadioButtonTest 
{
    public static void main(String arg[])
    {
        new MyJRadio();
    }
}
