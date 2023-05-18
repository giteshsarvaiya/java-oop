//Example of ActionListener:
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyAction extends JFrame implements ActionListener
{
    JPanel jp=new JPanel();
    JButton jb=new JButton("Click Here");
    JTextArea jta=new JTextArea(10,10);
    JScrollPane jsp=new JScrollPane(jta);
    MyAction()
    {
        jb.addActionListener(this);
        jp.add(jb);
        jp.add(jsp);
        this.add(jp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jb)
        {
            jta.append("\nButton Clicked");
        }
    }
}
public class NewClass 
{
    public static void main(String arg[])
    {
        new MyAction();
    }
}
