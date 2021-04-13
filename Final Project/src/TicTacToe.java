import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe extends JPanel implements ActionListener
{
	static JButton[] buttons = new JButton[9];
	int alt = 0;

	public TicTacToe()
	{
		setLayout(new GridLayout(3, 3));
		initializebuttons();
	}

	
	public void initializebuttons()
	{
		for (int i = 0; i <= 8; i++)
		{
			buttons[i] = new JButton();
			buttons[i].setText("");
			buttons[i].addActionListener(this);
			add(buttons[i]);

		}
	}

	
	public void buttonsReset()
	{
		for (int i = 0; i <= 8; i++)
		{
			buttons[i].setText("");
		}
	}

	
	public boolean detectWin(int[] array)
	{

		boolean winStatus = false;
		boolean positionInScenario = false;
		int[][] winScenarios = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
				{ 0, 4, 8 }, { 2, 4, 6 } };

		for (int[] scenerio : winScenarios)
		{
			for (int position : scenerio)
			{
				positionInScenario = false;

				for (int playerPosition : array)
				{
					if (position == playerPosition)
					{
						positionInScenario = true;
						break;
					}
				}

				if (positionInScenario == false)
				{
					break;
				}
			}

			if (positionInScenario == true)
			{
				winStatus = true;
				break;
			}
		}

		if (winStatus)
		{
			return true;
		}

		else
		{
			return false;
		}
	}

	
	public boolean detectTie(int[] array)
	{
		if (array.length == 0)
		{
			return true;
		}

		else
		{
			return false;
		}
	}
	
	int playerx = 0;
	int playero = 0;
	
	static int[] openPositions = {0,1,2,3,4,5,6,7,8};
	static int[] xPositions = {9,9,9,9,9,9,9,9,9};
	static int[] oPositions = {9,9,9,9,9,9,9,9,9};
	    
	
	static boolean oMove(int position, int turn)
	{
		int playerTurn = turn / 2 + 1;
	    for(int i = 0; i < 9; i++)
	    {
	    	if (openPositions[i] == position)
	    	{
	    		oPositions[playerTurn - 1] = position;
	            openPositions[i] = 9;
	            return true;
	        }
	    }
	    return false;
	}
	
	
	static boolean xMove(int position, int turn)
	{
		int playerTurn = turn / 2;
		for(int i = 0; i < 9; i++)
		{
			if (openPositions[i] == position)
			{
				xPositions[playerTurn - 1] = position;
	            openPositions[i] = 9;
	            return true;
	        }
	    }
		return false;
	}

	
	public void actionPerformed(ActionEvent e)
	{

		JButton buttonClicked = (JButton) e.getSource();
		
		if (alt % 2 == 0)
		{
			buttonClicked.setText("X");
		}
		else
		{
			buttonClicked.setText("O");
		}

		if (detectWin(xPositions) || detectWin(oPositions))
		{
			JOptionPane.showConfirmDialog(null, "Game Over. \n Goodbye!");
			buttonsReset();

		}
		if (detectTie(oPositions) && detectTie(xPositions))
		{
			JOptionPane.showConfirmDialog(null, "Tie. \n Goodbye!");
			buttonsReset();
		}
		
		alt++;
		
		oMove(playero++, alt);
		xMove(playerx++, alt);
		
	}
}