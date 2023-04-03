import java.awt.*;

class MyFrame extends Frame
{
    Label l;
    Button b;
    TextField tf;
    
    public MyFrame()
    {
        super("My App 2");
        setLayout(new FlowLayout());
        setBackground(Color.orange);
        
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("Submit");
        
        add(l);
        add(tf);
        add(b);
        
    }
}
public class frameMethod2 {
    public static void main(String[] args)
    {
        MyFrame f = new MyFrame();
        f.setSize(800,800);
        f.setVisible(true);
    }
}
