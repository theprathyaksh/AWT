import java.awt.*;
import java.awt.event.*;
class MyFrame20 extends Frame implements Runnable
{
    int x,y,tx,ty;
    MyFrame20()
    {
        x = 100;
        y = 100;
        tx=ty=1;
        
        Thread t = new Thread(this);
        t.start();
    }
    public void paint(Graphics g)
    {
        g.drawOval(x,y,50,50);
    }
    public void run()
    {
        while(true){
        x += tx;
        y += ty;
        
        if(x<0 || x>500)
            tx = tx*-1;
        if(y<20 || y>400)
            ty = ty*-1;
        
        repaint();
        try{Thread.sleep(5);}catch(Exception e){}
        
        }
        
    }
}
public class animation {
    public static void main(String[] args)
    {
        MyFrame20 f = new MyFrame20();
        f.setSize(500,500);
        f.setVisible(true);
        
        
    }
    
}
