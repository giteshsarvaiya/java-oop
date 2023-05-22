//Example2 of JScrollPane:
import javax.swing.*;
class MyFrame extends JFrame
{
    JScrollPane jsp=new JScrollPane();
    JPanel jp=new JPanel();
    JLabel jl=new JLabel();
    MyFrame()
    {
        jl.setIcon(new ImageIcon("C:\\Users\\patsroy\\Pictures\\Nature3.jpg"));
        jsp.setViewportView(jl);
        this.add(jsp);
        this.setSize(400,300);
        this.setVisible(true);
    }
}
public class NewClass3 {
    public static void main(String[] args) throws Exception
    {
        MyFrame f=new MyFrame();
    }        
}
