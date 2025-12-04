import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample2 extends Frame implements MouseListener {

    MouseListenerExample2() {
        addMouseListener(this);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);
        g.fillOval(e.getX(), e.getY(), 40, 20);
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String args[]) {
        new MouseListenerExample2();
    }
}
