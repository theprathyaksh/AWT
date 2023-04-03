import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    int count = 0;
    Label l;
    Button b;
    public MyFrame()
    {
        super("Button Demo");
        l = new Label("  "+count);
        b = new Button("Click");
        b.addActionListener(this);
        
        setLayout(new FlowLayout());
        setBackground(Color.orange);
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("  "+count);
    }
}
public class ButtonActionListener {
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(700,700);
        f.setVisible(true);
    }
    
}
