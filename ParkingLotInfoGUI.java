package ezrent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;

public class ParkingLotInfoGUI extends GUI {

	JPanel panel = new JPanel();
	
	JPanel parkingPanel = new JPanel();
	JPanel mapPanel = new JPanel();
	JButton backButton = new JButton("Go Back");
	JButton logOutButton = new JButton("Log Out");
	JButton changeLotButton = new JButton("Change Lot");
	JLabel 	lotNumber = new JLabel("Lot Number: _ _");
	JLabel mapInfo = new JLabel("This panel will show a map of the current lot.");
	JLabel parkingInfo = new JLabel("This panel will show info about the current lot.");
	
	ParkingLotInfoHandler handler = new ParkingLotInfoHandler();
	
	
	ParkingLotInfoGUI(){
		display();
	}
	
	
	
	public void display() {
		frame.getContentPane().add(panel);
		
		panel.setBackground(Color.white);
		panel.setSize(800, 600);
		panel.setLayout(null);

		
		parkingPanel.setBackground(Color.gray);
		parkingPanel.setSize(310, 376);
		parkingPanel.setLocation(447,132);
	
		mapPanel.setBackground(Color.blue);
		mapPanel.setSize(278, 251);
		mapPanel.setLocation(39,163);
		
		backButton.setLocation(30, 21);
		backButton.setSize(100, 50);
		backButton.addActionListener(handler);
		

		logOutButton.setLocation(677, 21);
		logOutButton.setSize(100, 50);
		logOutButton.addActionListener(handler);
		

		changeLotButton.setLocation(129, 425);
		changeLotButton.setSize(100, 50);
		changeLotButton.addActionListener(handler);
		lotNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lotNumber.setLocation(97, 112);
		lotNumber.setSize(154, 40);
		lotNumber.setForeground(Color.BLACK);
		
		mapInfo.setLocation(620, 400);
		mapInfo.setSize(100, 100);
		
		parkingInfo.setLocation(50, 300);
		parkingInfo.setSize(460, 600);
		
		panel.add(lotNumber);
		panel.add(parkingPanel);
		panel.add(mapPanel);
		panel.add(backButton);
		panel.add(logOutButton);
		panel.add(changeLotButton);
		
		mapPanel.add(mapInfo);
		parkingPanel.add(parkingInfo);
		
		panel.setVisible(true);
		
		
		
	}
	
	private void getParkingSpecs() {
		
		
	}
	
	private void showParkingLot() {
		
	}
	
	private void updateParkingLot() {
		
	}
	
	private String nearestParkingLot() {
		return null;
		
	}
	
	private void getNewParkingLot(String fileName) {
		
	}


	public class ParkingLotInfoHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == logOutButton) {
				panel.setVisible(false);
				new LoginGUI();

			} else if (e.getSource() == backButton) {
				panel.setVisible(false);
				new MenuGUI();

			} else if (e.getSource() == changeLotButton) {
				panel.setVisible(false);
				new ParkingLotGUI();

			}
			
		}
	}
	
	
	

}
