import java.awt.*;
public class List1 {
    List1()
    {
        Frame f= new Frame("List Example...");
        List l1 = new List(4);
        l1.setBounds(40,70,90,40);
        l1.add("Thank You.");
        l1.add("Welcome.");
        l1.add("Sorry.");
        l1.add("Please.");
        f.add(l1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new List1();
    }
}
