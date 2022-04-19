package ezrent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Font;

public class ParkingLotGUI extends GUI {

	public JPanel panel = new JPanel();
	public JButton getParkingLot = new JButton("Show Lot Specs");
	public JButton backButton = new JButton("Go Back");
	public JButton logOutButton = new JButton("Log Out");
	public JTextField parkingLotTextField = new JTextField();
	public JLabel parkingLabel = new JLabel("Parking Lot: ");
	ParkingLotHandler handler = new ParkingLotHandler();

	public ParkingLotGUI() {
		display();
	}

	public void display() {
		frame.getContentPane().add(panel);

		panel.setBackground(Color.white);
		panel.setSize(800, 600);
		getParkingLot.setBounds(303, 323, 197, 50);
		getParkingLot.addActionListener(handler);
		backButton.setBounds(10, 21, 100, 50);
		backButton.addActionListener(handler);
		logOutButton.setBounds(690, 21, 100, 50);
		logOutButton.addActionListener(handler);
		parkingLabel.setBounds(169, 237, 124, 30);
		parkingLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.setLayout(null);

		panel.add(getParkingLot);
		panel.add(backButton);
		panel.add(logOutButton);
		parkingLotTextField.setBounds(303, 231, 197, 50);
		panel.add(parkingLotTextField);
		panel.add(parkingLabel);

		panel.setVisible(true);

	}

	public void getParkingLot() {

	}

	public class ParkingLotHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == logOutButton) {
				new LoginGUI();

			} else if (e.getSource() == backButton) {
				new MenuGUI();

			} else if (e.getSource() == getParkingLot) {
				new ParkingLotInfoGUI();

			}
			panel.setVisible(false);
		}
	}

}
