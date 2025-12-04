import java.awt.*;
public class Choice1 {
    Choice1()
    {
        Frame f= new Frame("Choice Example...");
        Choice c= new Choice();
        c.setBounds(50,70,90,40);
        c.add("Thank You.");
        c.add("Welcome.");
        c.add("Please.");
        c.add("Sorry.");

        f.add(c);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    
    }
    public static void main(String args[])
    {
        new Choice1();
    }
}
