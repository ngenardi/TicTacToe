import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class AgeCalculation {

    public static void main(String[] args) {
        //TODAYS DATE
        LocalDate now = LocalDate.now();

        String pop = JOptionPane.showInputDialog("Enter your Birthdate (MM/DD/YYYY)");
        int birthMonth = Integer.parseInt(pop.substring(0,2));
        int birthDay = Integer.parseInt(pop.substring(3,5));
        int birthYear = Integer.parseInt(pop.substring(6));
        System.out.println(" year " + birthYear + " day " + birthDay + " month " + birthMonth);

        DateTimeFormatter dTf = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        String formatted = now.format(dTf); 
        System.out.println(" todays date is: " + formatted); 

        int yearNow= Integer.parseInt(formatted.substring(6));
        int dayNow = Integer.parseInt(formatted.substring(3,5));
        int monthNow = Integer.parseInt(formatted.substring(0,2));
        System.out.println(" year " + yearNow + " day " + dayNow + " month " + monthNow); 

        int ageOfYears = yearNow - birthYear;
        int ageByMonth = monthNow - birthMonth; 
        
        if (birthMonth > monthNow) {
        	ageOfYears --;
        	ageByMonth += 12;
        }
        	if (dayNow < birthDay) {
        		ageByMonth --;
        	}
System.out.println(" year " + ageOfYears + " month " + ageByMonth);

 JOptionPane.showMessageDialog(null, "Your are: " + ageOfYears + " years and " + ageByMonth + " Months " );
   }
}