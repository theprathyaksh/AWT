import java.awt.*;
import java.awt.event.*;

class MyFrame17 extends Frame
{
    Menu file,sub;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    
    TextField tf;
    MyFrame17()
    {
        super("Menu Demo");
        open = new MenuItem("open");
        save = new MenuItem("save");
        close = new MenuItem("close");
        closeall = new MenuItem("closeall");
        
        auto = new CheckboxMenuItem("AutoSave");
        
        file = new Menu("File");
        sub = new Menu("close");
        
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);
        
        sub.add(close);
        sub.add(closeall);
        
        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);
        
        tf = new TextField(20);
        setLayout(new FlowLayout());
        add(tf);
        
        open.addActionListener((ActionEvent ae)->tf.setText("open"));
        save.addActionListener((ActionEvent ae)->tf.setText("save"));
        close.addActionListener((ActionEvent ae)->tf.setText("close"));
        closeall.addActionListener((ActionEvent ae)->tf.setText("closeall"));
        
        auto.addItemListener((ItemEvent ie)->{
             if(auto.getState())
                 tf.setText("Auto On");
             else
                 tf.setText("Auto off");
        });
    }
}
public class MenuDemo {
     public static void main(String[] args)
    {
        MyFrame17 f = new MyFrame17();
        f.setSize(500,500);
        f.setVisible(true);
        
    }
    
}
