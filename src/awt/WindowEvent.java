import java.awt.*;
import java.awt.event.*;

class MyFrame12 extends Frame implements WindowListener
{
    
    Label l;
    
    MyFrame12()
    {
        super("Window Event Demo");
        l=new Label("No Message from Window");
        
        setLayout(new FlowLayout());
        add(l);
        
        addWindowListener(this);
        
        
    }


    @Override
    public void windowOpened(WindowEvent e) {
         l.setText("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
          l.setText("Window Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
       l.setText("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window Activated");
    }

   
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window DeActivated");
    }
        
}

public class WindowEvent 
{
    public static void main(String[] args) 
    {
        MyFrame12 f=new MyFrame12();
        f.setSize(500,500);
        f.setVisible(true);
        
    }    
}
