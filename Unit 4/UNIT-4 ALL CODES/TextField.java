/*
Example of TextField
(the frame will not close as event handling code is not added)
*/
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    Panel p=new Panel();
    TextField tf=new TextField(50);
    Label l=new Label();
    Button b=new Button("Click Here after typing some text in TextField");
    MyFrame(){        
        b.addActionListener(this);
        p.add(tf);
        p.add(b);
        p.add(l);
        this.add(p);
        this.setTitle("This is my Frame");
        this.setLocation(200,200);
        this.setSize(400,400);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String txt=tf.getText();
        l.setText(txt);
        this.validate();
    }
}
public class NewClass{
    public static void main(String[] args){
        MyFrame f=new MyFrame();
    }    
}
