//Example for WindowListener:
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyWindow extends JFrame implements WindowListener
{
    JPanel jp=new JPanel();
    JTextArea jta=new JTextArea(20,20);
    JScrollPane jsp=new JScrollPane(jta);
    MyWindow()
    {
        this.addWindowListener(this);
        jp.add(jsp);
        this.add(jp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) 
    {
        jta.append("\nWindow-Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) 
    {
        jta.append("\nWindow-Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) 
    {
        jta.append("\nWindow-Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) 
    {
        jta.append("\nWindow-Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) 
    {
        jta.append("\nWindow-Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) 
    {
        jta.append("\nWindow-Activated (Received Focus)");
    }

    @Override
    public void windowDeactivated(WindowEvent e) 
    {
        jta.append("\nWindow-Deactivated (Lost Focus)");
    }    
}
public class NewClass 
{
    public static void main(String arg[])
    {
        new MyWindow();
    }
}
