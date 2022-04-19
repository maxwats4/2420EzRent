package ezrent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.BorderLayout;

public class MenuGUI extends GUI{

	JPanel panel = new JPanel();
	JButton logOut = new JButton("Log Out");
	JButton routeCalcButton = new JButton("Route Calculator");
	JButton parkingLotButton = new JButton("Parking Lot Program");
	MenuHandler handler = new MenuHandler();

	public MenuGUI() {
		display();

	}

	public void display() {
	
		frame.add(panel);

		panel.setBackground(Color.white);
		panel.setLayout(null);
		panel.setSize(800, 600);

		logOut.setLocation(662, 21);
		logOut.setSize(100, 50);
		logOut.addActionListener(handler);

		routeCalcButton.setLocation(128, 250);
		routeCalcButton.setSize(165, 65);
		routeCalcButton.addActionListener(handler);
		
		parkingLotButton.setLocation(485, 250);
		parkingLotButton.setSize(165, 65);
		parkingLotButton.addActionListener(handler);
		
		panel.add(logOut);
		panel.add(routeCalcButton);
		panel.add(parkingLotButton);

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
				new ParkingLotGUI();
				
				
			}
			else if (e.getSource() == routeCalcButton) {
				panel.setVisible(false);
				new RouteCalculatorGUI();
				
			
			}
		}
		
	}
}
