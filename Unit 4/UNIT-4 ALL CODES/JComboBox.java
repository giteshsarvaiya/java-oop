/*
Example of JComboBox
(the frame will not close as event handling code is not added)
*/
import java.awt.event.*;
import javax.swing.*;
class MyFrame extends JFrame implements ActionListener{
    JPanel p=new JPanel();
    JTextField tf=new JTextField(10);
    JComboBox cb=new JComboBox();
    JButton b1=new JButton("Add Item to JComboBox");
    JButton b2=new JButton("Remove Selected Item from JComboBox");
    MyFrame(){        
        b1.addActionListener(this);
        b2.addActionListener(this);
        p.add(tf);
        p.add(b1);
        p.add(b2);
        p.add(cb);
        this.add(p);
        this.setTitle("This is my Frame");
        this.setLocation(200,200);
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String txt=tf.getText();
        tf.setText("");
        if(e.getSource()==b1){
            cb.addItem(txt);
        }
        if(e.getSource()==b2){
            int indx=cb.getSelectedIndex();
            cb.removeItemAt(indx);
        }
        this.validate();
    }
}
public class NewClass{
    public static void main(String[] args){
        MyFrame f=new MyFrame();
    }    
}
