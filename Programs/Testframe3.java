package Programs;
import java.awt.*;
import java.awt.event.*;
class test3 implements ActionListener{
    Frame f1;
    Label l1;
    Button b1;
    TextField t1;
    test3(){
        f1=new Frame();
        b1=new Button("Show Label");
        l1=new Label();
        t1=new TextField(30);
        f1.setLayout(new FlowLayout());
        f1.setSize(400,500);
        f1.setTitle("Test Text");
        f1.setVisible(true);
        f1.add(t1);
        f1.add(b1);
        f1.add(l1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==b1)
        {
            l1.setText(t1.getText());
        }
    }
}
public class Testframe3 {
    public static void main(String[] args) {
        new test3();
    }
}
