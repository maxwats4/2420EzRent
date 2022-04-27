package ezrent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.border.BevelBorder;

public class MenuGUI extends GUI{

	JPanel panel = new JPanel();
	JButton logOut = new JButton("Log Out");
	JButton routeCalcButton = new JButton("Calculate New Route");
	JButton parkingLotButton = new JButton("Use Parking App");
	MenuHandler handler = new MenuHandler();
	private final JPanel panel_1_1 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("Quickest Route Calculator");
	private final JLabel lblNewLabel_1 = new JLabel("Parking Assistance Application");

	public MenuGUI() {
		display();

	}

	public void display() {
	
		frame.getContentPane().add(panel);

		panel.setBackground(new Color(0, 250, 154));
		panel.setLayout(null);
		panel.setSize(800, 600);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(57, 116, 312, 337);
		panel.add(panel_1);
		panel_1.setLayout(null);
		routeCalcButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		routeCalcButton.setForeground(new Color(245, 245, 220));
		routeCalcButton.setBackground(new Color(60, 179, 113));
		routeCalcButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		routeCalcButton.setBounds(57, 139, 198, 58);
		panel_1.add(routeCalcButton);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 26, 270, 68);
		
		panel_1.add(lblNewLabel);
		panel_1_1.setBackground(new Color(245, 245, 220));
		panel_1_1.setBounds(431, 116, 312, 337);
		
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		parkingLotButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		parkingLotButton.setForeground(new Color(245, 245, 220));
		parkingLotButton.setBackground(new Color(60, 179, 113));
		parkingLotButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		parkingLotButton.setBounds(55, 142, 201, 52);
		panel_1_1.add(parkingLotButton);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 34, 292, 48);
		
		panel_1_1.add(lblNewLabel_1);
		logOut.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		logOut.setFont(new Font("Tahoma", Font.BOLD, 15));
		logOut.setForeground(new Color(60, 179, 113));
		logOut.setBackground(new Color(245, 245, 220));
		logOut.setBounds(628, 24, 115, 46);
		panel.add(logOut);
		logOut.addActionListener(handler);
		parkingLotButton.addActionListener(handler);
		routeCalcButton.addActionListener(handler);

		panel.setVisible(true);

	}


	 public class MenuHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == logOut) {
				panel.setVisible(false);
				new LoginGUI();
				
			
				
			
			}
			else if (e.getSource() == parkingLotButton) {
				panel.setVisible(false);
				new ParkingLotTest();
				
				
			}
			else if (e.getSource() == routeCalcButton) {
				panel.setVisible(false);
				new RouteCalculatorGUI();
				
			
			}
		}
		
	}
}
