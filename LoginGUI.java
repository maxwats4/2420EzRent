
package ezrent;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import edu.princeton.cs.algs4.Stack;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

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
	private final JPanel panel_1 = new JPanel();

	public LoginGUI() {

		display();

	}

	public void display() {

		frame.getContentPane().add(panel);

		panel.setBackground(new Color(0, 250, 154));
		panel.setLayout(null);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label3.setBounds(252, 288, 106, 34);
		panel.add(label3);
		label1.setHorizontalAlignment(SwingConstants.CENTER);

		label1.setFont(new Font("Tahoma", Font.BOLD, 35));
		label1.setBounds(234, 119, 332, 43);
		// label1.setLayout(null);
		panel.add(label1);
		label2.setHorizontalAlignment(SwingConstants.CENTER);

		
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBounds(252, 232, 106, 25);
		panel.add(label2);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		
		label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label4.setBounds(268, 165, 263, 25);
		label4.setForeground(Color.red);
		label4.setVisible(false);
		panel.add(label4);

		
		text1.setBounds(381, 231, 150, 34);
		panel.add(text1);

		
		text2.setBounds(381, 292, 150, 34);
		panel.add(text2);
		goButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		goButton.setForeground(new Color(245, 245, 220));
		goButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

		
		goButton.setBounds(290, 384, 220, 40);
		goButton.addActionListener(buttonHandler);
		goButton.setBackground(new Color(60, 179, 113));
		panel.add(goButton);
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(193, 72, 408, 405);
		
		panel.add(panel_1);
		

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
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Acer\\eclipse-workspace\\2420_ProgrammingEnvironment\\src\\ezrent\\ezRentLoginInformation.CSV"));  
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