/*
Example of Button
(the frame will not close as event handling code is not added)
*/
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    Panel p=new Panel();
    Label l=new Label("This is my Label");
    Button b=new Button("This is my Button");
    MyFrame(){
        p.add(l);
        b.addActionListener(this);
        p.add(b);
        this.add(p);
        this.setTitle("This is my Frame");
        this.setSize(400,400);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        l.setText("The Label Text Changed by Button Click");
        this.validate();
    }
}
public class NewClass{
    public static void main(String[] args){
        MyFrame f=new MyFrame();
    }    
}
