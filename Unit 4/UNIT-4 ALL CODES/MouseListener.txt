//Example of MouseListener: 

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyMouse1 extends JFrame implements MouseListener
{
    JPanel jp=new JPanel();
    JLabel jlb=new JLabel("Move Mouse Pointer to This Label");
    JTextArea jta=new JTextArea(20,20);
    JScrollPane jsp=new JScrollPane(jta);
    MyMouse1()
    {
        jlb.addMouseListener(this);
        jp.add(jlb);
        jp.add(jsp);
        this.add(jp);
        this.setSize(500,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        int x=e.getX();
        int y=e.getY();
        String msg="\nMouseClicked: Xpos: "+x+" Ypos: "+y;
        jta.append(msg);
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        int x=e.getX();
        int y=e.getY();
        String msg="\nMousePressed: Xpos: "+x+" Ypos: "+y;
        jta.append(msg);
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        int x=e.getX();
        int y=e.getY();
        String msg="\nMouseReleased: Xpos: "+x+" Ypos: "+y;
        jta.append(msg);
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        int x=e.getX();
        int y=e.getY();
        String msg="\nMouseEntered: Xpos: "+x+" Ypos: "+y;
        jta.append(msg);
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        int x=e.getX();
        int y=e.getY();
        String msg="\nMouseExited: Xpos: "+x+" Ypos: "+y;
        jta.append(msg);
    }
}
public class NewClass 
{
    public static void main(String arg[])
    {
        new MyMouse1();
    }
}
