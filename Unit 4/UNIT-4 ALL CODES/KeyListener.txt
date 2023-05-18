//Example of KeyListener:
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

class MyKey extends JFrame implements KeyListener
{
    JPanel jp=new JPanel();
    JLabel jlb=new JLabel("Type Something: ");
    JTextArea jta=new JTextArea(10,10);
    JScrollPane jsp=new JScrollPane(jta);
    JTextArea jta2=new JTextArea(30,30);
    JScrollPane jsp2=new JScrollPane(jta2);
    MyKey()
    {
        jta.addKeyListener(this);
        jp.add(jlb);
        jp.add(jsp);
        jp.add(jsp2);
        this.add(jp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        char ch=e.getKeyChar();
        int keycode=e.getKeyCode();
        Object source=e.getSource();
        boolean isalt=e.isAltDown();
        boolean iscontrol=e.isControlDown();
        boolean isshift=e.isShiftDown();
        String msg="\nKeyTypedEvent: KeyChar: "+ch;
        msg+="\nKeyCode: "+keycode;
        msg+="\nSource: "+source.getClass().getName();
        msg+="\nAlt Key Pressed? "+isalt;
        msg+="\nCntrl Key Pressed? "+iscontrol;
        msg+="\nShift Key Pressed? "+isshift;
        jta2.append("\n"+msg);
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        char ch=e.getKeyChar();
        int keycode=e.getKeyCode();
        Object source=e.getSource();
        boolean isalt=e.isAltDown();
        boolean iscontrol=e.isControlDown();
        boolean isshift=e.isShiftDown();
        String msg="\nKeyPressedEvent: KeyChar: "+ch;
        msg+="\nKeyCode: "+keycode;
        msg+="\nSource: "+source.getClass().getName();
        msg+="\nAlt Key Pressed? "+isalt;
        msg+="\nCntrl Key Pressed? "+iscontrol;
        msg+="\nShift Key Pressed? "+isshift;
        jta2.append("\n"+msg);
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        char ch=e.getKeyChar();
        int keycode=e.getKeyCode();
        Object source=e.getSource();
        boolean isalt=e.isAltDown();
        boolean iscontrol=e.isControlDown();
        boolean isshift=e.isShiftDown();
        String msg="\nKeyReleasedEvent: KeyChar: "+ch;
        msg+="\nKeyCode: "+keycode;
        msg+="\nSource: "+source.getClass().getName();
        msg+="\nAlt Key Pressed? "+isalt;
        msg+="\nCntrl Key Pressed? "+iscontrol;
        msg+="\nShift Key Pressed? "+isshift;
        jta2.append("\n"+msg);
    }
}
public class NewClass 
{
    public static void main(String arg[])
    {
        new MyKey();
    }
}
