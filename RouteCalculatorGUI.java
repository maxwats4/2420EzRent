package ezrent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import edu.princeton.cs.algs4.EdgeWeightedGraph;
import ezrent.MenuGUI.MenuHandler;
import java.awt.Font;

public class RouteCalculatorGUI extends GUI{
	
	JPanel panel = new JPanel();
	JButton backButton = new JButton("Go Back");
	JButton calculateRouteButton = new JButton("Calculate Route");
	JButton logOutButton = new JButton("Log Out");
	JPanel quickestRoutePanel = new JPanel();
	JPanel pricePanel = new JPanel();
	JTextField fromTextField = new JTextField();
	JTextField destinationTextField = new JTextField();
	JLabel fromLabel = new JLabel("From");
	JLabel destLabel = new JLabel("Destination");
	//EdgeWeightedGraph mapGraph = new EdgeWeightedGraph();
	//DijkstrasUndirectedSP graphBFS = new DijkstrasUndirectedSP();
	String[] locationArray;
	
	JLabel destInfo = new JLabel("This panel will show the quickest route.");
	JLabel priceInfo = new JLabel("This panel will show the price");
	
	RouteCalculatorHandler handler = new RouteCalculatorHandler();
	public RouteCalculatorGUI(){
		display();
	}
	public void display() {
		frame.getContentPane().add(panel);
		
		panel.setBackground(Color.white);
		panel.setLayout(null);
		panel.setSize(800,600);
		
		backButton.setLocation(30, 21);
		backButton.setSize(100, 50);
		backButton.addActionListener(handler);
		
		calculateRouteButton.setLocation(137, 371);
		calculateRouteButton.setSize(182, 50);
		calculateRouteButton.addActionListener(handler);
		
		logOutButton.setLocation(667, 21);
		logOutButton.setSize(100, 50);
		logOutButton.addActionListener(handler);
		
		quickestRoutePanel.setLocation(435, 144);
		quickestRoutePanel.setSize(332, 180);
		quickestRoutePanel.setBackground(Color.green);
		
		pricePanel.setLocation(435, 371);
		pricePanel.setSize(332, 88);
		pricePanel.setBackground(Color.orange);
		
		fromTextField.setLocation(160, 189);
		fromTextField.setSize(138, 50);
		
		destinationTextField.setLocation(160, 278);
		destinationTextField.setSize(138,50);
		fromLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		fromLabel.setLocation(85, 198);
		fromLabel.setSize(65, 25);
		destLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		destLabel.setLocation(30, 284);
		destLabel.setSize(120, 30);
		
		destInfo.setLocation(30, 284);
		destInfo.setSize(120, 30);
		
		priceInfo.setLocation(30, 284);
		priceInfo.setSize(120, 30);
		
		panel.add(backButton);
		panel.add(calculateRouteButton);
		panel.add(logOutButton);
		panel.add(quickestRoutePanel);
		panel.add(pricePanel);
		panel.add(fromTextField);
		panel.add(destinationTextField);
		panel.add(fromLabel);
		panel.add(destLabel);
		
		quickestRoutePanel.add(destInfo);
		priceInfo.add(priceInfo);
		
		
		
		
		panel.setVisible(true);
		
		
		
		
		
	}
	private String fastestRoute(int v1, int v2) {
		return null;
		
	}
	
	private void displayFastestRoute() {
		
	}
	
	/*private double calculatePrice(Iterable<Edge>, vehicle v) {
		
	}*/
	
	private int getLocationNumber(String location) {
		return 0;
		
	}
	
	private String vertexNumbertoLocation(int i) {
		return null;
		
	}
	
	/*private String printBestRoute(Iterable<Edge>) {
		
	}*/


	 
	
	public class RouteCalculatorHandler implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == backButton) {
					panel.setVisible(false);
					new MenuGUI();
				
					
				
				}
				else if (e.getSource() == logOutButton) {
					panel.setVisible(false);
					new LoginGUI();
					
				}
				else if (e.getSource() == calculateRouteButton) {
					//Call methods to calculate quickest route and price
					
					
				
				}
				
			}
			
		}
}
