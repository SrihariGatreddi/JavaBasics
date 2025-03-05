package Programs;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
class test{
    Frame f1;

    Button b1;
    Label l1;
    test(){
        f1=new Frame();
        b1=new Button("Click here");
        l1=new Label("Hello World");
        f1.setLayout(new FlowLayout());
        f1.add(l1);
        f1.add(b1);
        f1.setSize(400,500);
        f1.setTitle("Test Frame");
        f1.setBackground(Color.blue);
        f1.setVisible(true);

    }
}
public class Testframe1 {
    public static void main(String[] args) {
        new test();
    }
}


