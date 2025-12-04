//n
import java.awt.*;
import java.awt.event.*;
public class MouseMotionListenerExample2 extends Frame implements MouseMotionListener {
    Label l;
    Color c= Color.BLACK;
    MouseMotionListenerExample2()
    {
         l=new Label();  
        l.setBounds(40,60,100,50);
        add(l);
        addMouseMotionListener(this);
        setSize(500,600);
        setLayout(null);
        setVisible(true);
    }
    public void mouseDragged(MouseEvent e)
    {
         l.setText("X="+e.getX()+", Y="+e.getY());  
        Graphics g= getGraphics();
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public void mouseMoved(MouseEvent e)
    {
        l.setText("X="+e.getX()+", Y="+e.getY());  
    }
    public static void main(String args[])
    {
        new MouseMotionListenerExample2();
    }
}
