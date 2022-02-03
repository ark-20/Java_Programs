package Event;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends Frame implements ActionListener {
	TextField textfield1 = new TextField(30);
	TextField textfield2 = new TextField(30);
	TextField textfield3 = new TextField(30);
	TextField textfield4 = new TextField(30);
	TextField textfield5 = new TextField(30);
	
	Button button = new Button("Submit");
	SignUp(){
		setTitle("Login Page");
		setLayout(new FlowLayout());
		setSize(600,500);
		setVisible(true);
		
		textfield1.setText("Name :");
		textfield2.setText("Age :");
		textfield3.setText("Phone No. :");
		textfield4.setText("Address :");
		textfield5.setText("Email id :");
		button.setName("Submit");
		
		add(textfield1);
		add(textfield3);
		add(textfield4);
		add(textfield5);
		add(textfield2);
		add(button);
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Name:"+textfield1.getText());
		System.out.println("Phone No:"+textfield3.getText());
		System.out.println("Address:"+textfield4.getText());
		System.out.println("Email id:"+textfield5.getText());
		System.out.println("Age:"+textfield2.getText());
		
	}
	
	public static void main(String[] args) {
		
		SignUp signup = new SignUp();
		
	}

}
