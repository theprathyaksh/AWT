import java.awt.*;
import java.awt.event.*;

class MyFrame15 extends Frame
{
    MyFrame15()
    {
        super("adapter Demo");
        addWindowListener(new MyWindowAdapter());
        
    }
    class MyWindowAdapter extends WindowAdapter
    {
        public void WindowClosing(WindowEvent we)
        {
            System.exit(0);
        }
    }
}
public class AdapterClass {
    public static void main(String[] args)
    {
        MyFrame15 f = new MyFrame15();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
