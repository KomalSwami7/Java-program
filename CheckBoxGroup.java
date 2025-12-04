import java.awt.*;
public class CheckBoxGroup {
    CheckBoxGroup()
    {
        Frame f= new Frame("CheckboxGroup Example...");
        CheckboxGroup cbg= new CheckboxGroup();
        Checkbox c1 = new Checkbox("hi", cbg, false); 
        Checkbox c2= new Checkbox("bye", cbg, true);
        c1.setBounds(40,70,50,20);
        c2.setBounds(40,100,50,20);
        f.add(c1);
        f.add(c2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new CheckBoxGroup();
    }
}
