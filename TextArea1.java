import java.awt.*;
public class TextArea1 {
    TextArea1()
    {
        Frame f= new Frame("TextArea Example.");
        TextArea area= new TextArea("Hello World");
        area.setBounds(40,100,300,300);
        f.add(area);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new TextArea1();
    }
}
