import javax.swing.JFrame;

public class Game {
	public static void main(String[] args) 
	{
	    JFrame window = new JFrame("Tic-Tac-Toe");
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.getContentPane().add(new TicTactoe());
	    window.setBounds(301,201,302,304);
	    window.setVisible(true);
}}
