import javax.swing.JOptionPane;
public class RoachSimulation {

public static void main(String[] args) {
	
String pop = JOptionPane.showInputDialog("Enter the starting population of the Roaches example '30':");
	double startsize= Double.parseDouble(pop);
	RoachPopulation bug= new RoachPopulation(startsize);	
	
JOptionPane.showMessageDialog (null,"This Initial Roach Population is: "+ bug.getRoaches());
	bug.breed();
JOptionPane.showMessageDialog(null,"This is the Roach population After cycle 1 breed is:"+ bug.getRoaches());
		
String perc=JOptionPane.showInputDialog("Enter the spary percentage for cycle 1: ");
	double amountEnter=Double.parseDouble(perc);
	bug.breed();
	bug.spray(amountEnter);
JOptionPane.showMessageDialog(null, "The Roach population after cycle 1: " + amountEnter  + "Spraying is"  + bug.getRoaches());
	
String perc1=JOptionPane.showInputDialog("Enter the spary percentage for cycle 2: ");
	double amountEnter1=Double.parseDouble(perc1);
	bug.breed();
	bug.spray(amountEnter1);
JOptionPane.showMessageDialog(null, "The Roach population after cycle 2: " + amountEnter1  + "Spraying is"  + bug.getRoaches());
			
String perc2=JOptionPane.showInputDialog("Enter the spary percentage for cycle 3: ");
	double amountEnter2=Double.parseDouble(perc2);
	bug.breed();
	bug.spray(amountEnter2);
JOptionPane.showMessageDialog(null, "The Roach population after cycle 3: " + amountEnter2  + "Spraying is"  + bug.getRoaches());
		 
String perc3=JOptionPane.showInputDialog("Enter the spary percentage for cycle 4: ");
	double amountEnter3=Double.parseDouble(perc3);
	bug.breed();
	bug.spray(amountEnter3);
JOptionPane.showMessageDialog(null, "The Roach population after cycle 4: " + amountEnter3  + "Spraying is" + bug.getRoaches());
	}
}
