
package ezrent;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import edu.princeton.cs.algs4.Stack;
import java.awt.Font;

public class LoginGUI extends GUI {

	GoButtonHandler buttonHandler = new GoButtonHandler();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel("Employee Login");
	JLabel label2 = new JLabel("Username: ");
	JLabel label4 = new JLabel("Login credentials are invalid ");
	JLabel label3 = new JLabel("Password: ");
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton goButton = new JButton("Log In");

	public LoginGUI() {

		display();

	}

	public void display() {

		frame.getContentPane().add(panel);

		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label3.setBounds(231, 228, 150, 34);
		panel.add(label3);

		label1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label1.setBounds(286, 121, 227, 35);
		// label1.setLayout(null);
		panel.add(label1);

		
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBounds(231, 192, 106, 25);
		panel.add(label2);
		
		label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label4.setBounds(250, 165, 500, 25);
		label4.setForeground(Color.red);
		label4.setVisible(false);
		panel.add(label4);

		
		text1.setBounds(371, 196, 123, 24);
		panel.add(text1);

		
		text2.setBounds(371, 237, 123, 25);
		panel.add(text2);

		
		goButton.setBounds(316, 303, 123, 40);
		goButton.addActionListener(buttonHandler);
		panel.add(goButton);

		frame.setVisible(true);

	}

	public boolean verification() {
		String inputUsername = text1.getText();
		String inputPassword = text2.getText();
		boolean output = false;
	
		
		String line = "";  
		String splitBy = ",";  
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		BufferedReader br = new BufferedReader(new FileReader("C:\\MaxWatson\\College\\Fall Semester 2021\\CSIS 1400\\EclipseWorkspace\\2420_ProgrammingEnvironment\\src\\ezrent\\ezRentLoginInformation.CSV"));  
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{  
			
			String[] employee = line.split(splitBy);    // use comma as separator  
			
			// employee[0] is the username column and employee[1] is the password column
			if(inputUsername.equals(employee[0]) && inputPassword.equals(employee[1])) {
				output = true;
			}
		}  
			}   
				catch (IOException e)   
			{  
				e.printStackTrace();  
			}  
		
		
		return output;

		// if verified, return true;

	}

	public void goBack() {

	}

	public class GoButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (verification() == true) {
				new MenuGUI();
				panel.setVisible(false);
			}
			else {
				label4.setVisible(true);
				
			}
			
		}
	}
	
	
}


