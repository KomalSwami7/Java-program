import java.awt.*;
public class TextField1 {
    public static void main(String args[])
    {
        Frame f= new Frame("TextField Example...");
        TextField t1,t2;
        t1= new TextField("Good Morning...");
        t1.setBounds(50,70,100,40);
        t2= new TextField("Good Night...");
        t2.setBounds(50,140,100,40);
        f.add(t1);
        f.add(t2);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
}
