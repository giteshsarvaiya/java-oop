/*
Example of Checkbox and CheckboxGroup
(the frame will not close as event handling code is not added)
*/
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ItemListener{
    Panel p=new Panel();
    Label l=new Label();
    Checkbox cb1=new Checkbox("Checkbox-1");
    Checkbox cb2=new Checkbox("Checkbox-2");
    CheckboxGroup cg=new CheckboxGroup();
    Checkbox cb3=new Checkbox("Checkbox-3",true,cg);
    Checkbox cb4=new Checkbox("Checkbox-4",false,cg);
    MyFrame(){        
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        p.add(cb1);
        p.add(cb2);
        p.add(cb3);
        p.add(cb4);
        p.add(l);
        this.add(p);
        this.setTitle("This is my Frame");
        this.setLocation(200,200);
        this.setSize(400,400);
        this.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==cb1){
            l.setText("Checkbox-1 clicked");
        }
        if(e.getSource()==cb2){
            l.setText("Checkbox-2 clicked");
        }
        if(e.getSource()==cb3){
            l.setText("Checkbox-3 clicked");
        }
        if(e.getSource()==cb4){
            l.setText("Checkbox-4 clicked");
        }
        this.validate();
    }
}
public class NewClass{
    public static void main(String[] args){
        MyFrame f=new MyFrame();
    }    
}
