package mailMerge;

import java.util.Scanner;
public class mailMerge
{
	public static void main(String[] args)
	{
		
	Scanner in = new Scanner (System.in);

	//Create mail template 
	String replaceText1 = "Dear <firstName> <lastName>,";
	String replaceText2 = "Please confirm that your address is <houseNumber> <street>.";
	String replaceText3 = "Your answer is: <yORn> Goodbye!";
	String promptText1 = "Please enter your first name: ";
	String promptText2 = "Please enter your last name: ";
	String promptText3 = "Please enter your house number:";
	String promptText4 = "Please enter your street: ";
	String promptText5 = "Is this address correct? ";
	//Ask user for their first name
	System.out.println();
	System.out.print(promptText1);
	String firstName = in.next();
	
	//Ask user for their last name
	System.out.println(promptText2);
	String lastName = in.next();
	
	//Ask user for their house number
	System.out.println(promptText3);
	String houseNumber = in.next();
	//in.nextLine();
	//Ask user for their street address
	System.out.println(promptText4);
	String street = in.next();
	System.out.println();
	
	//Print mail template with replaced values
	replaceText1 = replaceText1.replace("<firstName>", firstName).replace("<lastName>", lastName);
	System.out.println(replaceText1);
	//or replace and print on the same line
	System.out.println(replaceText2.replace("<houseNumber>", houseNumber).replace("<street>", street));
	
	//Accept answer
	System.out.print(promptText5);
	String yourn = in.nextLine();
	replaceText3 = replaceText3.replace("<yORn>", yorno);
	System.out.println(replaceText3);
	//System.out.println(replaceText3.replace("<yORn>", yorno));
	in.close();
			

	}

}
