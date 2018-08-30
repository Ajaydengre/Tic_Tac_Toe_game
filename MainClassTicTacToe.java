package tictactoe;

import javax.swing.JFrame;



public class MainClassTicTacToe {
	
	public static void main(String args[]){
		
		JFrame frame=new JFrame("Tic Tac Toe");
		frame.setContentPane(new GamePlayTicTac());
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		frame.setResizable(false);
	}

}
