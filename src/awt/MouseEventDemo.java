import java.awt.*;
import java.awt.event.*;

class MyFrame11 extends Frame implements MouseListener, MouseMotionListener
{
    Label l,l2;
    
    MyFrame11()
    {
       super("Mouse Event");
       l = new Label("");
       l2 = new Label("");
       setLayout(null);
       
       l.setBounds(10,50,100,20);
       l2.setBounds(10,80,100,20);
       add(l);
       add(l2);
       
       addMouseListener(this);
       addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       l.setText("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved");
        l2.setText("("+e.getX()+","+e.getY()+")");
    }
}
public class MouseEventDemo {
    public static void main(String[] args)
    {
        MyFrame11 f = new MyFrame11();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
