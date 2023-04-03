import java.awt.*;
import java.awt.event.*;

class MyFrame5 extends Frame implements ItemListener,ActionListener
{
    List l;
    Choice c;
    TextArea ta;
    
    MyFrame5()
    {
        super("ListBox Demo");
        
        l = new List(4,true);
        c = new Choice();
        ta = new TextArea(20,30);
        
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.addItemListener(this);
        l.addActionListener(this);
        
        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.addItemListener(this);
        
        
        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
        
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource()==l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String list[] = l.getSelectedItems();
        String txt = "";
        
        for(String x:list)
            txt+=x+"\n";
        ta.setText(txt);
    }

    
    
}

public class ListBoxDemo {
    public static void main(String[] args)
    {
        MyFrame5 f = new MyFrame5();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
