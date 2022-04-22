package finalPackage;

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

public class ParkingLotTest extends JFrame implements ActionListener{

	private JPanel contentPane;
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
	private JButton DisplayButton;
	private JButton addCarButton;
	private JButton RemoveCarButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParkingLotTest frame = new ParkingLotTest();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ParkingLotTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 10, 576, 481);
		contentPane.add(panel);
		panel.setLayout(null);
		
		B1 = new JButton("A1");
		B1.setForeground(Color.BLACK);
		B1.setBackground(Color.WHITE);
		B1.setBounds(38, 142, 85, 21);
		panel.add(B1);
		
		 B2 = new JButton("A2");
		B2.setBounds(38, 181, 85, 21);
		panel.add(B2);
		
		B3 = new JButton("A3");
		B3.setBounds(38, 218, 85, 21);
		panel.add(B3);
		
		B4 = new JButton("A4");
		B4.setBounds(38, 262, 85, 21);
		panel.add(B4);
		
		B5 = new JButton("B1");
		B5.setBackground(Color.WHITE);
		B5.setForeground(Color.BLACK);
		B5.setBounds(172, 142, 85, 21);
		panel.add(B5);
		
		B6 = new JButton("B2");
		B6.setBounds(172, 181, 85, 21);
		panel.add(B6);
		
		B7 = new JButton("B3");
		B7.setBounds(172, 218, 85, 21);
		panel.add(B7);
		
		B8 = new JButton("B4");
		B8.setBounds(172, 262, 85, 21);
		panel.add(B8);
		
		B9 = new JButton("C1");
		B9.setBounds(306, 142, 85, 21);
		panel.add(B9);
		
		B10 = new JButton("C2");
		B10.setBounds(306, 181, 85, 21);
		panel.add(B10);
		
		B11 = new JButton("C3");
		B11.setBounds(306, 218, 85, 21);
		panel.add(B11);
		
		B12 = new JButton("B12");
		B12.setBounds(306, 262, 85, 21);
		panel.add(B12);
		
		JLabel lblNewLabel = new JLabel("Start");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(38, 70, 45, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("======================================");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(38, 105, 355, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("======================================");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(38, 47, 355, 13);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("======================================");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_2.setBounds(38, 334, 355, 13);
		panel.add(lblNewLabel_1_2);
		
		openSpaces = new JLabel("Open Spaces: ");
		openSpaces.setFont(new Font("Tahoma", Font.PLAIN, 14));
		openSpaces.setBounds(38, 391, 117, 21);
		panel.add(openSpaces);
		
		filledSpaces = new JLabel("Filled Spaces: ");
		filledSpaces.setFont(new Font("Tahoma", Font.PLAIN, 14));
		filledSpaces.setBounds(38, 416, 117, 21);
		panel.add(filledSpaces);
		
		closestSpot = new JLabel("Clostest Spot: ");
		closestSpot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		closestSpot.setBounds(38, 439, 117, 21);
		panel.add(closestSpot);
		
		DisplayButton = new JButton("Display Parking Lot");
		DisplayButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		DisplayButton.setBounds(306, 382, 203, 43);
		DisplayButton.addActionListener(this);
		panel.add(DisplayButton);
		
		addCarButton = new JButton("Add Car");
		addCarButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addCarButton.setBounds(436, 47, 85, 21);
		addCarButton.addActionListener(this);
		panel.add(addCarButton);
		
		RemoveCarButton = new JButton("Remove Car");
		RemoveCarButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RemoveCarButton.setBounds(436, 78, 85, 21);
		RemoveCarButton.addActionListener(this);
		panel.add(RemoveCarButton);
		
		parkingLot.solve();
		parkingLot.OpenSpaces();
		parkingLot.filledSpaces();
		parkingLot.displayParkingLot();
		parkingLot.closestSpot();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == DisplayButton) {
			parkingLot.solve();
			parkingLot.OpenSpaces();
			parkingLot.filledSpaces();
			parkingLot.displayParkingLot();
			parkingLot.closestSpot();
		}
		
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
	}
	
	
}
