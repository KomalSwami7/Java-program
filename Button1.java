import java.awt.*;
public class Button1{
    public static void main(String args[])
    {
        Frame f= new Frame("Button Example");
        Button b= new Button("Click Me");
        b.setBounds(50,80,70,40);
        f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
} 