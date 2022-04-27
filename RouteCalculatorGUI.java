package ezrent;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import edu.princeton.cs.algs4.DijkstraSP;
import edu.princeton.cs.algs4.Edge;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;
import edu.princeton.cs.algs4.EdgeWeightedGraph;
import edu.princeton.cs.algs4.In;
import ezrent.MenuGUI.MenuHandler;

import java.awt.Font;
import javax.swing.border.BevelBorder;

public class RouteCalculatorGUI extends GUI{
	
	JPanel panel = new JPanel();
	JButton backButton = new JButton("Go Back");
	JButton calculateRouteButton = new JButton("Calculate Route");
	JButton logOutButton = new JButton("Log Out");
	JPanel quickestRoutePanel = new JPanel();
	JTextField fromTextField = new JTextField();
	JTextField destinationTextField = new JTextField();
	JLabel fromLabel = new JLabel("From");
	JLabel locationOptions = new JLabel("Options: SLC, SEA, LAX, PHX, DAL, DEN, HOU, TEN, CHI, NYC");
	JLabel destLabel = new JLabel("Destination");
	JLabel routeInfo = new JLabel();
	
	//Route finder Variables
	static String[] locations = {"SLC", "SEA","LAX","PHX","DAL","DEN","HOU","TEN","CHI", "NYC", "ATL", "MIA"};
		//will need to change the file name for the program to run
	String fileName = "C:\\Users\\Acer\\eclipse-workspace\\2420_ProgrammingEnvironment\\src\\ezrent\\ezrentMap.txt";
	In in = new In(fileName);
	int source = 0; // index for SLC
	String startLocation;
	String destination;
	int destinationIndex;
	
	EdgeWeightedDigraph graph = new EdgeWeightedDigraph(in);
	
	
	/**
	 * Takes in the string given by the graph traversing algorithm and converts it into location path
	 * 
	 * @param s
	 * @return a string of the location path
	 */
	public static String translator(String s) {
		String output = "";
		int count = 0;
		
		char[] word = s.toCharArray(); // char array that holds the numbers of the path 
		
		for(int i = 0; i< word.length;i++) {
			
			if(i == 0 || i == 3 || i== 14  || i == 25 || i == 36) {
				
				if(count != 0) {
        			output += " -> ";
        		}
				int num = Character.getNumericValue(word[i]);

				output += locations[num];
				count++;
			}
			
		}
		
		return output;
		
	}
	
	//converts the string location into an index number 
	public int getLocationIndex(String s, String[] array) {
		
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(s)) {
				return i;
			}
		}
		return -1;
		
	}
	 
	 
	
	
	RouteCalculatorHandler handler = new RouteCalculatorHandler();
	private final JPanel panel_1 = new JPanel();
	public RouteCalculatorGUI(){
		display();
	}
	public void display() {
		frame.getContentPane().add(panel);
		
		panel.setBackground(new Color(0, 250, 154));
		panel.setLayout(null);
		panel.setSize(800,600);
		backButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		backButton.setBackground(new Color(245, 245, 220));
		backButton.setForeground(new Color(60, 179, 113));
		backButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		backButton.setLocation(57, 24);
		backButton.setSize(115, 47);
		backButton.addActionListener(handler);
		logOutButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		logOutButton.setBackground(new Color(245, 245, 220));
		logOutButton.setForeground(new Color(60, 179, 113));
		logOutButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		logOutButton.setLocation(628, 24);
		logOutButton.setSize(115, 47);
		logOutButton.addActionListener(handler);
		
	
		panel.add(backButton);
		panel.add(logOutButton);
		panel_1.setBackground(new Color(245, 245, 220));
		panel_1.setBounds(179, 97, 442, 429);
		
		panel.add(panel_1);
		panel_1.setLayout(null);
		calculateRouteButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		calculateRouteButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		calculateRouteButton.setForeground(new Color(245, 245, 220));
		calculateRouteButton.setBackground(new Color(60, 179, 113));
		calculateRouteButton.setBounds(200, 243, 138, 42);
		panel_1.add(calculateRouteButton);
		destinationTextField.setBounds(200, 171, 138, 42);
		panel_1.add(destinationTextField);
		fromTextField.setBounds(200, 96, 138, 42);
		panel_1.add(fromTextField);
		locationOptions.setBounds(10, 25, 422, 50);
		panel_1.add(locationOptions);
		locationOptions.setHorizontalAlignment(SwingConstants.CENTER);
		locationOptions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		quickestRoutePanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		quickestRoutePanel.setBounds(30, 319, 381, 68);
		panel_1.add(quickestRoutePanel);
		quickestRoutePanel.setBackground(new Color(255, 255, 255));
		routeInfo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		routeInfo.setLocation(40, 284);
		routeInfo.setSize(120, 30);
		quickestRoutePanel.add(routeInfo);
		destLabel.setBounds(70, 173, 120, 30);
		panel_1.add(destLabel);
		destLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		destLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fromLabel.setBounds(126, 101, 65, 25);
		panel_1.add(fromLabel);
		fromLabel.setHorizontalAlignment(SwingConstants.CENTER);
		fromLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		calculateRouteButton.addActionListener(handler);

		
		
	
		
		panel.setVisible(true);
		
		
		
		
		
	}
	private String fastestRoute(int v1, int v2) {
		return null;
		
	}
	
	private void displayFastestRoute() {
		//Call methods to calculate quickest route and price
		startLocation = fromTextField.getText();
		destination = destinationTextField.getText();
		
		int startLocIndex = getLocationIndex(startLocation, locations);
		destinationIndex = getLocationIndex(destination, locations);
		if(destinationIndex > -1 && startLocIndex > -1) {
			 DijkstraSP path = new DijkstraSP(graph, startLocIndex);
			 routeInfo.setText("Path to Destination: "+ translator(path.pathTo(destinationIndex).toString()));
		}
		
	
	}
	
	/*private double calculatePrice(Iterable<Edge> e, vehicle v) {
		return 0;
		
	}*/
	
	
	
	
	
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
					displayFastestRoute();
				
				}
				
			}
			
		}
}