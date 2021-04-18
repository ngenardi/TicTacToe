import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JPanel implements ActionListener {

	JButton[] buttons = new JButton[9];
	int turnNum = 0;
	static int[] openPositions = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
	static int[] xPositions = { 9, 9, 9, 9, 9, 9, 9, 9, 9 };
	static int[] oPositions = { 9, 9, 9, 9, 9, 9, 9, 9, 9 };
	static final int[] startingOpenPositions = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
	static final int[] startingPositions = { 9, 9, 9, 9, 9, 9, 9, 9, 9 };

	public TicTacToe() {
		
		setLayout(new GridLayout(3, 3));
		initializebuttons();
	}

	public void initializebuttons() {
		
		for (int i = 0; i <= 8; i++) {
			
			buttons[i] = new JButton();
			buttons[i].setText("");
			buttons[i].setName(String.valueOf(i));
			buttons[i].addActionListener(this);
			add(buttons[i]);
		}
	}

	public void buttonsReset() {
		
		for (int i = 0; i <= 8; i++) {
			
			buttons[i].setText("");
		}

		for (int i = 0; i <= 8; i++) {
			
			oPositions[i] = startingPositions[i];
		}

		for (int i = 0; i <= 8; i++) {
			
			xPositions[i] = startingPositions[i];
		}

		for (int i = 0; i <= 8; i++) {
			
			openPositions[i] = startingOpenPositions[i];
		}
		
		turnNum = 0;
	}

	public boolean xDetectWin() {
		
		boolean winStatus = false;
		boolean positionInScenario = false;
		int[][] winScenarios = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, 
				{ 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 }, { 2, 4, 6 } };

		for (int[] scenerio : winScenarios) {
			
			for (int position : scenerio) {
				
				positionInScenario = false;

				for (int playerPosition : xPositions) {
					
					if (position == playerPosition) {
						
						positionInScenario = true;
						break;
					}
				}

				if (positionInScenario == false) {
					
					break;
				}
			}

			if (positionInScenario == true) {
				
				winStatus = true;
				break;
			}
		}

		return winStatus;
	}

	public boolean oDetectWin() {

		boolean winStatus = false;
		boolean positionInScenario = false;
		int[][] winScenarios = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, 
				{ 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 }, { 2, 4, 6 } };

		for (int[] scenerio : winScenarios) {
			
			for (int position : scenerio) {
				
				positionInScenario = false;

				for (int playerPosition : oPositions) {
					
					if (position == playerPosition) {
						
						positionInScenario = true;
						break;
					}
				}

				if (positionInScenario == false) {
					
					break;
				}
			}

			if (positionInScenario == true) {
				
				winStatus = true;
				break;
			}
		}

		return winStatus;
	}

	public boolean detectTie() {
		
		boolean tieStatus = true;
		
		for (int position : openPositions) {
			
			if (position != 9) {
				
				tieStatus = false;
				break;
			}
		}
		
		return tieStatus;
	}

	static boolean oMove(int position, int turn) {
		
		int playerTurn = turn / 2 + 1;
		
		for (int i = 0; i < 9; i++) {
			
			if (openPositions[i] == position) {
				
				oPositions[playerTurn] = position;
				openPositions[i] = 9;
				return true;
			}
		}
		
		return false;
	}

	static boolean xMove(int position, int turn) {
		
		int playerTurn = turn / 2;
		
		for (int i = 0; i < 9; i++) {
			
			if (openPositions[i] == position) {
				
				xPositions[playerTurn] = position;
				openPositions[i] = 9;
				return true;
			}
		}
		
		return false;
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton buttonClicked = (JButton) e.getSource();
		int buttonNum = Integer.parseInt(buttonClicked.getName());
		
		if (turnNum % 2 == 0) {
			
			if (xMove(buttonNum, turnNum)) {
				
				buttonClicked.setText("X");
			} 
			else {
				
				JOptionPane.showMessageDialog(null, "Invalid move. \nTry again.");
				return;
			}
		} 
		else {

			if (oMove(buttonNum, turnNum)) {
				
				buttonClicked.setText("O");
			} 
			else {
				
				JOptionPane.showMessageDialog(null, "Invalid move. \nTry again.");
			}
		}

		if (xDetectWin()) {
			
			JOptionPane.showMessageDialog(null, "Game Over. \nX wins!");
			buttonsReset();
		}

		else if (oDetectWin()) {
			
			JOptionPane.showMessageDialog(null, "Game Over. \nO wins!");
			buttonsReset();
		}

		else if (detectTie()) {
			
			JOptionPane.showMessageDialog(null, "Game Over. \nTie!");
			buttonsReset();
		}

		turnNum++;
	}
}