import java.awt.*;
public class Panel1 {
    Panel1()
    {
        Frame f= new Frame("Panel Example...");
        Panel panel = new Panel();
        panel.setBackground(Color.gray);
        panel.setBounds(40,70,200,200);
        Button b1= new Button("Button 1.");
        b1.setBounds(50,50,80,30);
        b1.setBackground(Color.yellow);
        Button b2= new Button("Button 2.");
        b2.setBounds(50,100,80,30);
        b2.setBackground(Color.green);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Panel1();
    }
}
