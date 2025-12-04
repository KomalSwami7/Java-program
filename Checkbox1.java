import java.awt.*;
public class Checkbox1 {
    Checkbox1()
    {
        Frame f= new Frame("CheckBox Example...");
        Checkbox c1,c2;
        c1=new Checkbox("Hello.");
        c2=new Checkbox("Hi");
        c1.setBounds(50,70,60,30);
        c2.setBounds(50,130,70,30);
        f.add(c1);
        f.add(c2);
        f.setSize(500,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Checkbox1();
    }
}
