import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class TicTactoe extends  JPanel implements ActionListener{
	JButton buttons[]=new JButton[9];
	int alt =0;
	

public void TicTacToe()
{
  setLayout(new GridLayout(3,3));
  initializebuttons(); 
}
public void initializebuttons()
{
    for(int i = 0; i <= 8; i++)
    {
       //JButton buttons = new JButton();
        buttons[i].setText("");
        buttons[i].addActionListener(this);
        add(buttons[i]);
}}

public void Buttonsreset()
{
    for(int i = 0; i <= 8; i++)
    {
        buttons[i].setText("");}}

public void actionPerformed(ActionEvent e) 
{
    
    JButton buttonClicked = (JButton)e.getSource(); 
    if(alt%2 == 0)
        buttonClicked.setText("X");
    else
        buttonClicked.setText("O");
    alt++;
    
}
    
    }
        

