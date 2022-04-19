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
	JLabel locationOptions = new JLabel("Options: SLC, SEA, LAX, PHX, DAL, DEN, HOU, TEN, CHI, NYC");
	JLabel destLabel = new JLabel("Destination");
	
	
	JLabel destInfo = new JLabel("This panel will show the quickest route.     ");
	JLabel routeInfo = new JLabel();
	JLabel priceInfo = new JLabel("This panel will show the price");
	
	//Route finder Variables
	static String[] locations = {"SLC", "SEA","LAX","PHX","DAL","DEN","HOU","TEN","CHI", "NYC", "ATL", "MIA"};
		//will need to change the file name for the program to run
	String fileName = "C:\\MaxWatson\\College\\Fall Semester 2021\\CSIS 1400\\EclipseWorkspace\\2420_ProgrammingEnvironment\\src\\ezrent\\ezrentMap.txt";
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
		
		locationOptions.setLocation(50, 50);
		locationOptions.setSize(350, 250);
		locationOptions.setFont(new Font("Tahoma", Font.PLAIN, 10));
		
		destLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		destLabel.setLocation(30, 284);
		destLabel.setSize(120, 30);
		
		destInfo.setLocation(30, 284);
		destInfo.setSize(120, 30);
		
		routeInfo.setLocation(40, 284);
		routeInfo.setSize(120, 30);
		
		priceInfo.setLocation(30, 284);
		priceInfo.setSize(120, 30);
		
		panel.add(backButton);
		panel.add(calculateRouteButton);
		panel.add(logOutButton);
		panel.add(locationOptions);
		panel.add(quickestRoutePanel);
		panel.add(pricePanel);
		panel.add(fromTextField);
		panel.add(destinationTextField);
		panel.add(fromLabel);
		panel.add(destLabel);
		
		quickestRoutePanel.add(destInfo);
		quickestRoutePanel.add(routeInfo);
		priceInfo.add(priceInfo);
		
		
		
		
		panel.setVisible(true);
		
		
		
		
		
	}
	private String fastestRoute(int v1, int v2) {
		return null;
		
	}
	
	private void displayFastestRoute() {
		
	}
	
	private double calculatePrice(Iterable<Edge> e, vehicle v) {
		return 0;
		
	}
	
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
					startLocation = fromTextField.getText();
					destination = destinationTextField.getText();
					
					int startLocIndex = getLocationIndex(startLocation, locations);
					destinationIndex = getLocationIndex(destination, locations);
					if(destinationIndex > -1 && startLocIndex > -1) {
						 DijkstraSP path = new DijkstraSP(graph, startLocIndex);
						 System.out.println(translator(path.pathTo(destinationIndex).toString()));
						 routeInfo.setText("Path to Destination: "+ translator(path.pathTo(destinationIndex).toString()));
					}
					
				
				}
				
			}
			
		}
}

