import java.awt.*;

public class Menu1 {
    Menu1() {
        Frame f = new Frame("Menu & Menuitem Example");
        MenuBar mb = new MenuBar();
        Menu m = new Menu("Menu");
        Menu subm = new Menu("Sub- Menu");
        MenuItem a = new MenuItem("C/C++");
        MenuItem b = new MenuItem("Java");
        MenuItem c = new MenuItem("PHP");
        MenuItem d = new MenuItem("SQL");
        MenuItem e = new MenuItem("NoSQL");
        m.add(a);
        m.add(b);
        m.add(c);
        subm.add(d);
        subm.add(e);
        m.add(subm);
        mb.add(m);
        f.setMenuBar(mb);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String args[]) {
        new Menu1();
    }
}
