package mailMerge;

import java.util.Scanner;
public class mailMerge
{
	public static void main(String[] args)
	{
		
	Scanner in = new Scanner (System.in);

	System.out.println("Please enter your first name: ");
	String Firstname = in.next();
	System.out.println("Please enter your last name: ");
	String Lastname = in.next();
	System.out.println("Please enter your house number: ");
	String Housenumber = in.next();
	System.out.println("Please enter your street: ");
	String Street = in.next();
	System.out.println();
	System.out.println();
		
	System.out.println("Dear " + Firstname + " " + Lastname);
	System.out.println("Please confirm that your address is "+ Housenumber + " " + Street);
	System.out.println("Is this adress Correct?");	
	String yes = in.next();
	System.out.println("Your answer is: Yes Goodbye!");
	
			String replaceText1 = "Dear <Herman> <Munster>,";
			String replaceText2 = "Please confirm that your address is <1313> <Mockingbird Lane>.";
			String replaceText3 = "Your answer is: <yes> Goodbye!";
			String promptText1 = "Please enter your first name: ";
			String promptText2 = "Please enter your last name: ";
			String promptText3 = "Please enter your house number:";
			String promptText4 = "Please enter your street: ";
			String promptText5 = "Is this address correct? ";

	}

}
