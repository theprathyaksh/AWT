import java.awt.*;
public class AWT {
  public static void main(String[] args) {
      Frame f = new Frame("First App");
      f.setBackground(Color.orange);
      f.setLayout(new FlowLayout());
      
      Button b = new Button("SUBMIT");
      Label l = new Label("Name");
      TextField tf = new TextField(20);
      
      f.add(l);
      f.add(tf);
      f.add(b);
      
      
      
      
      f.setSize(500,500);
      f.setVisible(true);
        
    }
    
}
