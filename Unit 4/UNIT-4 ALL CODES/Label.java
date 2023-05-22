/*
Example of Label
(the frame will not close as event handling code is not added)
*/
import java.awt.*;
class MyFrame extends Frame{
    Panel p=new Panel();
    Label l=new Label("This is my Label");
    MyFrame(){
        p.add(l);
        this.add(p);
        this.setTitle("This is my Frame");
        this.setSize(300,300);
        this.setVisible(true);
    }
}
public class NewClass{
    public static void main(String[] args){
        MyFrame f=new MyFrame();
    }    
}
