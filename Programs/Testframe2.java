package Programs;
import java.awt.*;
import java.awt.event.*;
class tst{
    Frame f1;
    Label l1;
    Button b1;
    tst(){
        f1=new Frame();
        b1=new Button("Submit");
        l1=new Label("Srihari");
        f1.setVisible(true);
        f1.setTitle("Test Frame 2");
        f1.setSize(400,600);
        f1.setBackground(Color.green);
        f1.setLayout(new FlowLayout());
    }
}
public class Testframe2{
    public static void main(String[] args) {
        new tst();
    }
}
