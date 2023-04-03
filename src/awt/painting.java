import java.awt.*;
import java.awt.event.*;

class MyFrame18 extends Frame
{
    int x = 0, y = 0;
    
    MyFrame18()
    {
        super("Painting");
        
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me)
            {
                x = me.getX();
                y = me.getY();
                repaint();
            }
        });
        
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        
        g.fillOval(x,y,50,50);
    }
}

public class painting {
     public static void main(String[] args)
    {
        MyFrame18 f = new MyFrame18();
        f.setSize(500,500);
        f.setVisible(true);
        
    }
    
}
