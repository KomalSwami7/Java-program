import java.awt.*;
import java.awt.event.*;

public class ActionListener1 implements ActionListener {

    TextField tf;

    ActionListener1() {
        Frame f = new Frame("ActionListener Example");

        tf = new TextField();
        tf.setBounds(50, 60, 200, 40);

        Button b = new Button("Submit");
        b.setBounds(70, 140, 80, 30);
        b.addActionListener(this);

        f.add(b);
        f.add(tf);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to Javatpoint...");
    }

    public static void main(String[] args) {
        new ActionListener1();
    }
}
