import java.awt.*;
import java.awt.event.*;

class MyFrame16 extends Frame implements ActionListener
{
    TextField tf;
    Button b;
    int count = 0;
    
    MyFrame16()
    {
        super("Event Demo");
        
        tf = new TextField("0",20);
        b = new Button("Click");
        
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        b.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        count++;
        tf.setText(String.valueOf(count));
    }
}
public class wayofeventhandling {
    public static void main(String[] args)
    {
        MyFrame16 f = new MyFrame16();
        f.setSize(500,500);
        f.setVisible(true);
        
    }
    
}
