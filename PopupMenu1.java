import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PopupMenu1 {
    PopupMenu1()
    {
       final Frame f= new Frame("PopupMenu Example...");
       final PopupMenu pop= new PopupMenu("Edit");
       MenuItem cut= new MenuItem("Cut");
       cut.setActionCommand("Cut");
       MenuItem copy= new MenuItem("Copy");
       copy.setActionCommand("Copy");
       MenuItem paste= new MenuItem("Paste");
       paste.setActionCommand("Paste");
       pop.add(cut);
       pop.add(copy);
       pop.add(paste);
       f.addMouseListener( new MouseAdapter() {
        public void mouseClicked(MouseEvent e)
        {
            pop.show(f,e.getX(),e.getY());
        }
       });
       f.add(pop);
       f.setSize(500,500);
       f.setLayout(null);
       f.setVisible(true);
    }
    public static void main(String args[])
    {
        new PopupMenu1();
    }
}
