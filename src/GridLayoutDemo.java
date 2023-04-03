import java.awt.*;

class MyFrame8 extends Frame 
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    
    public MyFrame8()
            {
                super("Gridbag Layout Demo");
                
                GridBagLayout gb = new GridBagLayout();
                
                GridBagConstraints gbc = new GridBagConstraints();                
                setLayout(gb);
                
                b1=new Button("1");
                b2=new Button("2");
                b3=new Button("3");
                b4=new Button("4");
                b5=new Button("5");
                b6=new Button("6");
                b7=new Button("7");
                b8=new Button("8");
                b9=new Button("9");
                
                gbc.gridx = 1;
                gbc.gridy = 1;
                add(b1,gbc);
                
                gbc.gridx = 2;
                gbc.gridy = 1;
                add(b2,gbc);
                
                gbc.gridx = 3;
                gbc.gridy = 1;
                add(b3,gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 2;
                add(b4,gbc);
                
                gbc.gridx = 2;
                gbc.gridy = 2;  
                add(b5,gbc);
                
                gbc.gridx = 3;
                gbc.gridy = 2;
                add(b6,gbc);
                
                gbc.gridx = 1;
                gbc.gridy = 3;
                add(b7,gbc);
                
                gbc.gridx = 2;
                gbc.gridy = 3;
                add(b8,gbc);
                
                gbc.gridx = 3;
                gbc.gridy = 3;
                add(b9,gbc);
}
}
public class GridLayoutDemo {

    public static void main(String[] args) {

        MyFrame8 f=new MyFrame8();
        f.setSize(500,500);
        f.setVisible(true);
       
    }
    
}