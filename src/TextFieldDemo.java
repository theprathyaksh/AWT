import java.awt.*;
import java.awt.event.*;

class MyFrame3 extends Frame implements TextListener,ActionListener
{
    Label l1,l2;
    TextField tf;
    MyFrame3()
    {
        super("Text Field Demo");
        l1 = new Label("No text is entered yet");
        l2 = new Label("Enter ");
        tf = new TextField(20);
        
        tf.addTextListener(this);
        tf.addActionListener(this);
        tf.setEchoChar('*');
        
         
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
        
    }
    
}
public class TextFieldDemo {
    public static void main(String[] args)
    {
        MyFrame3 f = new MyFrame3();
        f.setSize(700,700);
        f.setVisible(true);
    }
    
}
