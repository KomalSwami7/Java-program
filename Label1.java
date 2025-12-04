 import java.awt.*;
public class Label1 {
    public static void main(String args[])
    {
        Frame f= new Frame("Lable Example");
        Label l1,l2;
        l1= new Label("first Label.");
        l2= new Label("Second Label...");
        l1.setBounds(70,100,90,30);
        l2.setBounds(70,150,90,30);
        f.add(l1);
        f.add(l2);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}


