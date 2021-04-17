import javax.swing.*;

public class Game
{
	public static void main(String[] args)
	{
		JFrame window = new JFrame("Tic-Tac-Toe");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().add(new TicTacToe());
		window.setBounds(407, 100, 600, 600);
		window.setVisible(true);
	}
	/*
	 *  JButton exit = new JButton("Exit");
		ExitListener listener = new ExitListener();
		panel.add(exit);
		exit.addActionListener(listener);
		
		private class ExitListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		}
	 */
}