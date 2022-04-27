package ezrent;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ezrent.parkingLot;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;

public class ParkingLotGUI extends GUI implements ActionListener{

	private JPanel panel = new JPanel();
	public static JButton B1;
	public static JButton B2;
	public static JButton B3;
	public static JButton B4;
	public static JButton B5;
	public static JButton B6;
	public static JButton B7;
	public static JButton B8;
	public static JButton B9;
	public static JButton B10;
	public static JButton B11;
	public static JButton B12;
	public static JLabel openSpaces;
	public static JLabel filledSpaces;
	public static JLabel closestSpot;
	private JButton addCarButton;
	private JButton RemoveCarButton;
	
	JButton backButton = new JButton("Go Back");
	JButton logOutButton = new JButton("Log Out");
	private JPanel panel_1;

	public ParkingLotGUI() {
		
		
		
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 250, 154));
		this.panel.add(panel);
		panel.setSize(800, 600);
		panel.setLayout(null);
		backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		backButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		backButton.setForeground(new Color(60, 179, 113));
		backButton.setBackground(new Color(245, 245, 220));
		backButton.setBounds(56, 21, 117, 49);
		backButton.addActionListener(this);
		panel.add(backButton);
		logOutButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		logOutButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		logOutButton.setForeground(new Color(60, 179, 113));
		logOutButton.setBackground(new Color(245, 245, 220));
		logOutButton.setBounds(621, 21, 117, 49);
		logOutButton.addActionListener(this);
		panel.add(logOutButton);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(205, 97, 389, 405);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		B1 = new JButton("A1");
		B1.setBounds(10, 63, 85, 21);
		panel_1.add(B1);
		B1.setForeground(Color.BLACK);
		B1.setBackground(Color.WHITE);
		
		 B2 = new JButton("A2");
		 B2.setBounds(10, 102, 85, 21);
		 panel_1.add(B2);
		 
		 B3 = new JButton("A3");
		 B3.setBounds(10, 139, 85, 21);
		 panel_1.add(B3);
		 
		 B4 = new JButton("A4");
		 B4.setBounds(10, 183, 85, 21);
		 panel_1.add(B4);
		 
		 B5 = new JButton("B1");
		 B5.setBounds(144, 63, 85, 21);
		 panel_1.add(B5);
		 B5.setBackground(Color.WHITE);
		 B5.setForeground(Color.BLACK);
		 
		 B6 = new JButton("B2");
		 B6.setBounds(144, 102, 85, 21);
		 panel_1.add(B6);
		 
		 B7 = new JButton("B3");
		 B7.setBounds(144, 139, 85, 21);
		 panel_1.add(B7);
		 
		 B8 = new JButton("B4");
		 B8.setBounds(144, 183, 85, 21);
		 panel_1.add(B8);
		 
		 B9 = new JButton("C1");
		 B9.setBounds(278, 63, 85, 21);
		 panel_1.add(B9);
		 
		 B10 = new JButton("C2");
		 B10.setBounds(278, 102, 85, 21);
		 panel_1.add(B10);
		 
		 B11 = new JButton("C3");
		 B11.setBounds(278, 139, 85, 21);
		 panel_1.add(B11);
		 
		 B12 = new JButton("B12");
		 B12.setBounds(278, 183, 85, 21);
		 panel_1.add(B12);
		 
		 openSpaces = new JLabel("Open Spaces: ");
		 openSpaces.setHorizontalAlignment(SwingConstants.LEFT);
		 openSpaces.setBounds(26, 273, 117, 21);
		 panel_1.add(openSpaces);
		 openSpaces.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 
		 filledSpaces = new JLabel("Filled Spaces: ");
		 filledSpaces.setHorizontalAlignment(SwingConstants.LEFT);
		 filledSpaces.setBounds(26, 305, 117, 21);
		 panel_1.add(filledSpaces);
		 filledSpaces.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 
		 closestSpot = new JLabel("Clostest Spot: ");
		 closestSpot.setHorizontalAlignment(SwingConstants.LEFT);
		 closestSpot.setBounds(26, 337, 117, 21);
		 panel_1.add(closestSpot);
		 closestSpot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 
		 addCarButton = new JButton("Add Car");
		 addCarButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		 addCarButton.setBounds(223, 262, 123, 43);
		 panel_1.add(addCarButton);
		 addCarButton.setForeground(new Color(245, 245, 220));
		 addCarButton.setBackground(new Color(60, 179, 113));
		 addCarButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		 
		 RemoveCarButton = new JButton("Remove Car");
		 RemoveCarButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		 RemoveCarButton.setBounds(223, 337, 123, 43);
		 panel_1.add(RemoveCarButton);
		 RemoveCarButton.setForeground(new Color(245, 245, 220));
		 RemoveCarButton.setBackground(new Color(60, 179, 113));
		 RemoveCarButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		 RemoveCarButton.addActionListener(this);
		 addCarButton.addActionListener(this);
		
		parkingLot.solve();
		parkingLot.OpenSpaces();
		parkingLot.filledSpaces();
		parkingLot.displayParkingLot();
		parkingLot.closestSpot();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == addCarButton) {
			parkingLot.addCar();
			
			
		}
		if(e.getSource() == RemoveCarButton) {
			parkingLot.removeCar();
			parkingLot.solve();
			parkingLot.OpenSpaces();
			parkingLot.filledSpaces();
			parkingLot.displayParkingLot();
			parkingLot.closestSpot();
			
			
		}
		if (e.getSource() == logOutButton) {
			panel.setVisible(false);
			new LoginGUI();

		} if (e.getSource() == backButton) {
			panel.setVisible(false);
			new MenuGUI();

		} 
	}
	
	
}

