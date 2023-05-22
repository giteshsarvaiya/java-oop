/*
Example of Dialog  class:
(this code would create a Frame and Dialog that cannot be closed as event handling code is not present)
*/
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

class MyDialog extends Dialog
{
    Panel p=new Panel();
    MyDialog(Frame f,boolean modal)
    {
        super(f,modal);
        p.setBackground(Color.green);
        this.add(p);
        this.setTitle("My Dialog");
        this.setSize(200,200);
        this.setVisible(true);
    }
}
class MyFrame3 extends Frame
{
    MyFrame3()
    {
        this.setTitle("My Frame");
        this.setSize(500,500);
        this.setVisible(true);
        MyDialog dlg=new MyDialog(this,false);        
    }
}




public class MyDialogTest 
{
    public static void main(String arg[])
    {
        MyFrame3 f=new MyFrame3();
    }    
}
