import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener{
    Label l;
    MouseListenerExample()
    {
        addMouseListener(this);
        l= new Label();
        l.setBounds(40,60,150,50);
        add(l);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked...");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse Entered...");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse Pressed...");
    }
     public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse Exited...");
    }
     public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse Released...");
    }
    public static void main(String args[])
    {
        new MouseListenerExample();
    }
}
