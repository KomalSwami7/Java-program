import java.awt.*;
public class Canvas1 {
    Canvas1()
    {
        Frame f= new Frame("Canvas Example...");
        f.add(new MyCanvas());
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new Canvas1();
    }
}
 class MyCanvas extends Canvas
 {
    public MyCanvas(){
        setBackground(Color.GRAY);
        setSize(300,300);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillOval(75, 75, 150, 75);  
    }
 } 
