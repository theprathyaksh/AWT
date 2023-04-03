
import java.awt.*;
import java.awt.event.*;
public class registrationForm1 implements ActionListener{
	TextField t = new TextField();
	TextField t1 = new TextField();
	Choice c = new Choice();
	Label submit = new Label("Registration Successful");
	Frame f = new Frame();
	MenuBar mb = new MenuBar();
	Menu m = new Menu("Menu");
	Label l = new Label("Name");
	Label l1 = new Label("Pasword: ");
	Label l2 = new Label("Occupation");
	Button s = new Button("Submit");
	Button clr = new Button("Clear");
	registrationForm1{
		//Frame Layout
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setTitle("Registration Form");
		//End of Layout
		//Menu
		m.add("File");
		m.add("Edit");
		mb.add(m);
		f.setMenuBar(mb);
		//End of Menu
		//First Row : Name and TextField for name
		l.setBounds(50,100, 100,30);
		f.add(l);
		t.setBounds(170,100, 100,30);
		f.add(t);
		//End of row 1
		//row 1
		l1.setBounds(50,170, 100,30);
		t1.setEchoChar('*');					//Displays * for every char entered in input
		t1.setBounds(170,170, 100,30);
		f.add(l1);
		f.add(t1);
		//End of row 2
		//Choice Row 3
		l2.setBounds(50,220, 100,30);
		c.add("Engineer");
		c.add("Doctor");
		c.setBounds(170,220, 100,30);
		f.add(l2);
		f.add(c);
		//End of Choice row
		s.setBounds(50,280, 100,30);
		s.addActionListener(this);			//Important: this will add a functionality to the button
		clr.setBounds(170,280,100,30);		
		clr.addActionListener(this);
		f.add(s);
		f.add(clr);
		submit.setBounds(50,330, 200,30);
		f.add(submit);
		submit.setVisible(false);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == s){			//Submit Button Pressed
			submit.setVisible(true);
			submit.setText("Name ="+t.getText() +" Occupation ="+c.getSelectedItem());
		}
		else{							//Clear Button Press
			t.setText(" ");				//This needs to be done to due to a bug
			t.setText("");
			t1.setText(" ");
			t1.setText("");
			c.select(0);				//Selects the first option of choice on clearing screen
			submit.setVisible(false);
		}
	}
}
class Main{
public static void main(String Z[]){
	registrationForm1 a = new registrationForm1();
}}