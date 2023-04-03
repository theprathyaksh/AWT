import java.awt.*;

class MyFrame7 extends Frame 
{
    Button b1,b2,b3,b4,b5,b6;
    
    public MyFrame7()
            {
                super("Flow Layout Demo");
                
                
                
                b1=new Button("one");
                b2=new Button("two");
                b3=new Button("three");
                b4=new Button("four");
                b5=new Button("five");
                b6=new Button("six");
                
                
                FlowLayout fl = new FlowLayout();
                fl.setAlignment(FlowLayout.RIGHT);
                add(b1,BorderLayout.NORTH);
                add(b2,BorderLayout.WEST);
                add(b3,BorderLayout.SOUTH);
                add(b4,BorderLayout.EAST);
                add(b5,BorderLayout.CENTER);
                add(b6);
}
}
public class LayoutDemo {

    public static void main(String[] args) {

        MyFrame7 f=new MyFrame7();
        f.setSize(500,500);
        f.setVisible(true);
       
    }
    
}