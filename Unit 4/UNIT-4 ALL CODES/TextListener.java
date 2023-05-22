//Example of TextListener:
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import javax.swing.*;

class MyText extends JFrame implements TextListener
{
    JPanel jp=new JPanel();
    JLabel jlb1=new JLabel("TextBox1:");
    TextField tf1=new TextField(20);		//AWT component
    JLabel jlb2=new JLabel("TextBox2:");
    TextField tf2=new TextField(20);		//AWT component
    JTextArea jta=new JTextArea(20,20);
    JScrollPane jsp=new JScrollPane(jta);
    MyText()
    {
        tf1.addTextListener(this);
        tf2.addTextListener(this);	//only applicable to AWT component
        jp.add(jlb1);
        jp.add(tf1);
        jp.add(jlb2);
        jp.add(tf2);
        jp.add(jsp);
        this.add(jp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void textValueChanged(TextEvent e) 
    {
        if(e.getSource()==tf1){jta.append("\n Text Changed in TextField1");}
        if(e.getSource()==tf2){jta.append("\n Text Changed in TextField2");}
    }    
}
public class NewClass 
{
    public static void main(String arg[])
    {
        new MyText();
    }
}
