import java.awt.*;
public class Awt1 extends Frame{
    Awt1(){
        Button a= new Button("Click Me...");
        a.setBounds(45,100,90,30);
        add(a);
        setSize(700,700);
        setTitle("This is our basic AWT example"); 
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        Awt1 one = new Awt1();
    }
}
