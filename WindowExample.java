import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class WindowExample extends Frame implements WindowListener {
    WindowExample()
    {
        addWindowListener(this);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new WindowExample();
    }
    public void windowActivated(WindowEvent arg)
    {
        System.out.println("Window Actiavted...");
    }
    public void windowClosed(WindowEvent args)
    {
        System.out.println("Window Closed...");
    }
    public void windowClosing(WindowEvent args)
    {
         System.out.println("Window Closing...");
          dispose();
    }
    public void windowDeactivated(WindowEvent args)
    {
         System.out.println("Window Deactivated...");
    }
    public void windowDeiconified(WindowEvent args)
    {
        System.out.println("Window Deiconified...");
    }
    public void windowIconified(WindowEvent args)
    {
        System.out.println("Window Iconified...");
    }
    public void windowOpened(WindowEvent args)
    {
        System.out.println("Window Opened...");
    }
}
