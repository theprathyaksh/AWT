import java.awt.*;
import java.awt.event.*;

class MyFrame4 extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    
    MyFrame4()
    {
        super("Text Area Demo");
        l = new Label("                   ");
        ta = new TextArea(5,0);
        tf = new TextField(20);
        b = new Button("click");
        b.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         ta.insert(tf.getText(), ta.getCaretPosition());
         
    }
}
public class TextAreaDemo {
    public static void main(String[] args)
    {
        MyFrame4 f = new MyFrame4();
        f.setSize(700,700);
        f.setVisible(true);
    }
    
}
