import java.awt.*;
import java.awt.event.*;

public class NumericScrollBar {
    NumericScrollBar() {

        Frame f = new Frame("Numeric ScrollBar Example");

        // Scrollbar(int orientation, int initial value, int visible amount, int min, int max)
        Scrollbar s = new Scrollbar(Scrollbar.VERTICAL, 50, 10, 0, 100);

        s.setBounds(50, 50, 30, 200);
        f.add(s);

        // Label to show numeric value
        Label valueLabel = new Label("Value: 50");
        valueLabel.setBounds(100, 50, 100, 30);
        f.add(valueLabel);

        // Event listener to update value when the scrollbar moves
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                valueLabel.setText("Value: " + s.getValue());
            }
        });

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new NumericScrollBar();
    }
}