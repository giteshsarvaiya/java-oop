/*
Example of List
(the frame will not close as event handling code is not added)
*/
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    Panel p=new Panel();
    TextField tf=new TextField(50);
    List l=new List(4);
    Button b1=new Button("Add Item to List");
    Button b2=new Button("Remove Selected Item from List");
    MyFrame(){        
        b1.addActionListener(this);
        b2.addActionListener(this);
        p.add(tf);
        p.add(b1);
        p.add(b2);
        p.add(l);
        this.add(p);
        this.setTitle("This is my Frame");
        this.setLocation(200,200);
        this.setSize(400,400);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String txt=tf.getText();
        tf.setText("");
        if(e.getSource()==b1){
            l.add(txt);
        }
        if(e.getSource()==b2){
            int indx=l.getSelectedIndex();
            l.remove(indx);
        }
        this.validate();
    }
}
public class NewClass{
    public static void main(String[] args){
        MyFrame f=new MyFrame();
    }    
}
