package ezrent;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import edu.princeton.cs.algs4.Stack;

public class GUI{
	
	Stack pageVisitLog = new Stack();
	public static JFrame frame = new JFrame();
	
	public GUI(){
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	
		

		
	}
	
	public void logOut(){
		
	}

	public static void main(String[] args) {
		new LoginGUI();

	}
	

}
