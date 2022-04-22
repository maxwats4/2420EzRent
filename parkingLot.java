package ezrent;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;

import finalPackage.ParkingLotTest;
/**
 * NOTES: Might need to change the Java.util.queue to a algs4 queue this week
 * 
 * Matrix map: 
 * S = Start
 * . = road
 * E = Empty Spot
 * F = filled parking spot
 * D = destination or the cars new parking spot
 * # = wall
 * 
 * @author Max Watson
 *
 */

public class parkingLot {
	
	static int R = 8; //number of rows in the map
	static int C = 6; //number of columns in the map
	static String[][] matrix = { { "A", "", "B", "", "C","0" },
								 { "S", ".", ".", ".", ".","1" },
								 { "#", "#", "#", "#", ".","2" },
								 { ".", ".", ".", ".", "." ,"3"},
								 { "E", ".", "F", ".", "E","4" },
								 { "E", ".", "F", ".", "F","5" },
								 { "E", ".", "E", ".", "E" ,"6"}, 
								 { "E", ".", "F", ".", "E" ,"7"}}; // matrix of the map
	
	static int ER = 8; //end row
	static int EC = 6; // end column
	
	static int r;
	static int c;
	
	
	static int sr = 0; // starting row number
	static int sc = 0; // starting column number
	static Queue<Integer> rq = new LinkedList<Integer>(); // row queue  // both are used for the Breadth First search
	static Queue<Integer> cq = new LinkedList<Integer>(); // column queue

	static int move_count = -1; //these all help in keeping track of the moves it will take 
	static int nodes_left_in_layer = 1;
	static int nodes_in_next_layer = 0;
	
	static boolean reached_end = false;
	static String[][] visited = new String[R][C]; // tracks the places that are visited 
	
	static int[] dr = {-1, +1, 0,0}; //directional vectors
	static int[] dc = {0,0,+1, -1}; // directional vectors
	
	// parking lot variables
	int LotID;
	int parkingSpots; // 
	int OpenParking;
	int ClosedParking;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Displays the current parking lot on the GUI
	 * 
	 */
	public static void displayParkingLot() {
		//=============================================
		if(matrix[4][0].equals("E")) {
			ParkingLotTest.B1.setBackground(Color.GREEN);;
		}
		if(matrix[4][0].equals("F")) {
			ParkingLotTest.B1.setBackground(Color.RED);;
		}if(matrix[4][0].equals("D")) {
			ParkingLotTest.B1.setBackground(Color.ORANGE);;
		}
		//=============================================
		
		if(matrix[5][0].equals("E")) {
			ParkingLotTest.B2.setBackground(Color.GREEN);;
		}
		if(matrix[5][0].equals("F")) {
			ParkingLotTest.B2.setBackground(Color.RED);;
		}if(matrix[5][0].equals("D")) {
			ParkingLotTest.B2.setBackground(Color.ORANGE);;
		}
		//=============================================
		
		if(matrix[6][0].equals("E")) {
					ParkingLotTest.B3.setBackground(Color.GREEN);;
				}
		if(matrix[6][0].equals("F")) {
					ParkingLotTest.B3.setBackground(Color.RED);;
		}if(matrix[6][0].equals("D")) {
					ParkingLotTest.B3.setBackground(Color.ORANGE);;
		}
		
		//=============================================
		
		if(matrix[7][0].equals("E")) {
					ParkingLotTest.B4.setBackground(Color.GREEN);;
		}
		if(matrix[7][0].equals("F")) {
					ParkingLotTest.B4.setBackground(Color.RED);;
		}if(matrix[7][0].equals("D")) {
					ParkingLotTest.B4.setBackground(Color.ORANGE);;
		}
		
		
		if(matrix[4][2].equals("E")) {
			ParkingLotTest.B5.setBackground(Color.GREEN);;
		}
		if(matrix[4][2].equals("F")) {
			ParkingLotTest.B5.setBackground(Color.RED);;
		}if(matrix[4][2].equals("D")) {
			ParkingLotTest.B5.setBackground(Color.ORANGE);;
		}
		//=============================================
		
				if(matrix[5][2].equals("E")) {
					ParkingLotTest.B6.setBackground(Color.GREEN);;
				}
				if(matrix[5][2].equals("F")) {
					ParkingLotTest.B6.setBackground(Color.RED);;
				}if(matrix[5][2].equals("D")) {
					ParkingLotTest.B6.setBackground(Color.ORANGE);;
				}
				//=============================================
			//=============================================
				
				if(matrix[6][2].equals("E")) {
							ParkingLotTest.B7.setBackground(Color.GREEN);;
						}
				if(matrix[6][2].equals("F")) {
							ParkingLotTest.B7.setBackground(Color.RED);;
				}if(matrix[6][2].equals("D")) {
							ParkingLotTest.B7.setBackground(Color.ORANGE);;
				}
				//=============================================
				
				if(matrix[7][2].equals("E")) {
							ParkingLotTest.B8.setBackground(Color.GREEN);;
				}
				if(matrix[7][2].equals("F")) {
							ParkingLotTest.B8.setBackground(Color.RED);;
				}if(matrix[7][2].equals("D")) {
							ParkingLotTest.B8.setBackground(Color.ORANGE);;
				}		
				
				//=============================================
				if(matrix[4][4].equals("E")) {
					ParkingLotTest.B9.setBackground(Color.GREEN);;
				}
				if(matrix[4][4].equals("F")) {
					ParkingLotTest.B9.setBackground(Color.RED);;
				}if(matrix[4][4].equals("D")) {
					ParkingLotTest.B9.setBackground(Color.ORANGE);;
				}
				//=============================================
				
				if(matrix[5][4].equals("E")) {
					ParkingLotTest.B10.setBackground(Color.GREEN);;
				}
				if(matrix[5][4].equals("F")) {
					ParkingLotTest.B10.setBackground(Color.RED);;
				}if(matrix[5][4].equals("D")) {
					ParkingLotTest.B10.setBackground(Color.ORANGE);;
				}
				//=============================================
				
				if(matrix[6][4].equals("E")) {
							ParkingLotTest.B11.setBackground(Color.GREEN);;
						}
				if(matrix[6][4].equals("F")) {
							ParkingLotTest.B11.setBackground(Color.RED);;
				}if(matrix[6][4].equals("D")) {
							ParkingLotTest.B11.setBackground(Color.ORANGE);;
				}
				
				//=============================================
				
				if(matrix[7][4].equals("E")) {
							ParkingLotTest.B12.setBackground(Color.GREEN);;
				}
				if(matrix[7][4].equals("F")) {
							ParkingLotTest.B12.setBackground(Color.RED);;
				}if(matrix[7][4].equals("D")) {
							ParkingLotTest.B12.setBackground(Color.ORANGE);;
				}			
				
	}
	
	// finds the shortest path to the nearest parking spot
	public static int solve() {
		
		// Resests the variables if you are going to add or take away a car
		 sr = 0; // starting row number
		 sc = 0; // starting column number 
		 move_count = -1; //these all help in keeping track of the moves it will take 
		 nodes_left_in_layer = 1;
		 nodes_in_next_layer = 0;
		 reached_end = false;
		 visited = new String[R][C];
		 
		 
		// add the starting location to the queue to do BFS
		rq.add(sr); 
		cq.add(sc);
		

		//checks if the starting location is the ending location
		if(visited[sr][sc] == "1") {
			return move_count;
		}
		//BFS 
		while(rq.size() > 0) {
			r = rq.poll();
			c = cq.poll();
			
			
			
			//checks to see if the new location is the end 
			if(matrix[r][c] == "E") {
				

				reached_end = true;
				matrix[r][c] = "D";
				return move_count;
				
			}
		

			explore_neighbors(r,c);
			nodes_left_in_layer--;
			if(nodes_left_in_layer == 0) {
				nodes_left_in_layer = nodes_in_next_layer;
				nodes_in_next_layer = 0;
				move_count++;
			}
			if(reached_end == true) {
				System.out.println("Done");
				return move_count;
				
				
			}
		}
		
		
		return -1;
	}
	
	/**
	 * Adds a new car to the matrix and 
	 * 
	 */
	public static void addCar() {
		
		// sets the last open spot(D) to the Letter F for filled 
		for (int i = 0; i < matrix.length; i++)
		  {
		    // length returns number of rows
		    for (int j = 0; j < matrix[i].length; j++)
		    {
		     
			if(matrix[i][j].equals("D")) {
				matrix[i][j] = "F";			}
		     }
		    
		   }
		
		parkingLot.solve();
		parkingLot.OpenSpaces();
		parkingLot.filledSpaces();
		parkingLot.displayParkingLot();
		parkingLot.closestSpot();
		
		
	}
	
	// needs work
	public static int removeCar() {
		
		// sets the last open spot(D) to the Letter F for filled 
				for (int i = 0; i < matrix.length; i++)
				  {
				    // length returns number of rows
				    for (int j = 0; j < matrix[i].length; j++)
				    {
				     
					if(matrix[i][j].equals("D")) {
						matrix[i][j] = "E";			}
				     }
				    
				   }
		// Resests the variables if you are going to add or take away a car
				 sr = 0; // starting row number
				 sc = 0; // starting column number 
				 move_count = -1; //these all help in keeping track of the moves it will take 
				 nodes_left_in_layer = 1;
				 nodes_in_next_layer = 0;
				 reached_end = false;
				 visited = new String[R][C];
				 
				 
				// add the starting location to the queue to do BFS
				rq.add(sr); 
				cq.add(sc);
				

				//checks if the starting location is the ending location
				if(visited[sr][sc] == "1") {
					return move_count;
				}
				//BFS 
				while(rq.size() > 0) {
					r = rq.poll();
					c = cq.poll();
					
					
					
					//checks to see if the new location is the end 
					if(matrix[r][c] == "F") {
						

						reached_end = true;
						matrix[r][c] = "E";
						return move_count;
						
					}
				

					explore_neighbors(r,c);
					nodes_left_in_layer--;
					if(nodes_left_in_layer == 0) {
						nodes_left_in_layer = nodes_in_next_layer;
						nodes_in_next_layer = 0;
						move_count++;
					}
					if(reached_end == true) {
						System.out.println("Done");
						return move_count;
						
						
					}
				}
				
				
				
				
				return -1;
		
		
		
	
		
	}

	private static void explore_neighbors(int r, int c) {
		// TODO Auto-generated method stub
		int rr;
		int cc;
		
		for(int i = 0; i<4; i++) {
			rr = r + dr[i];
			cc = c + dc[i];
			
			// cases to make sure the cordinates are valid
			if(rr < 0 || cc < 0) {
				continue;
				
			}
			
			if(rr >= R || cc >= C) {
				continue;
			}
			
			if(visited[rr][cc] == "1") {
				continue;
				
			}
			if(matrix[rr][cc] == "#") {
				continue;
			}
			
			rq.add(rr);
			cq.add(cc);
			visited[rr][cc] = "1";
			nodes_in_next_layer++;
			

			
			
		}
		
	}
	
	 private static void printMatrix()
	    {
	        for (int i = 0; i < matrix.length; i++)
		  {
		    // length returns number of rows
		    for (int j = 0; j < matrix[i].length; j++)
		    {
		      // here length returns number of columns corresponding to current row
			// using tabs for equal spaces, looks better aligned
			// matrix[i][j] will return each element placed at row ‘i',column 'j'
			System.out.print( matrix[i][j]  + "\t");
		     }
		     System.out.println();
		   }
		}
	 
	 
	 public static void OpenSpaces() {
		 int numOpen = 0;
		 
		 for (int i = 0; i < matrix.length; i++)
		  {
		    // length returns number of rows
		    for (int j = 0; j < matrix[i].length; j++)
		    {
		     
			if(matrix[i][j].equals("E")) {
				numOpen++;
			}
		     }
		    
		   }
		 
		 ParkingLotTest.openSpaces.setText("Open Spaces: " + numOpen);
		 
	 }
	 
	  public static void filledSpaces() {
		 int numfilled = 0;
		 
		 for (int i = 0; i < matrix.length; i++)
		  {
		    // length returns number of rows
		    for (int j = 0; j < matrix[i].length; j++)
		    {
		     
			if(matrix[i][j].equals("F") || matrix[i][j].equals("D") ) {
				numfilled++;
			}
		     }
		    
		   }
		 
		 ParkingLotTest.filledSpaces.setText("Filled Spaces: " + numfilled);
		 
	 }
	  
	  public static void closestSpot() {
			 int clostestSpotR= 0;
			 String clostestSpotC= "";
			 
			 String out = "";
			 
			 for (int i = 0; i < matrix.length; i++)
			  {
			    // length returns number of rows
			    for (int j = 0; j < matrix[i].length; j++)
			    {
			     
				if(matrix[i][j].equals("D") ) {
					clostestSpotR = i - 3;
					if(j == 0) {
						clostestSpotC = "A";
					}
					if(j == 2) {
						clostestSpotC = "B";
					}if(j == 4) {
						clostestSpotC = "C";
					}
					
				}
			     }
			    
			   }
			 
			 out =  "Closest Spot: " + clostestSpotC + clostestSpotR;
			 ParkingLotTest.closestSpot.setText(out);
			 
		 }

	

}
