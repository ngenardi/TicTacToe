import java.util.*;

public class HousePaintingRunner
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//This code illustrates creation of variables
		
		int length;
		length = 40;
		int width = 15;
		int height = 25;
		int numberofwindows = 10;
		int widthofwindows = 4;
		int lengthofwindows = 2;
		int numberofdoors = 2;
		int lengthofdoors = 6;
		int widthofdoors = 3;
		int Costtopaint = 5;
		System.out.println("Enter lenght of house: ");
		length = in.nextInt();
		System.out.println("Enter width of house: ");
		width = in.nextInt();
		//System.out.println();
		int SqFtforpeakside = height - width * length * 1 / 2 + length * width;
		int TotalSqFtforpeakside = SqFtforpeakside * 2;
		int SqFtfornormalside = length * width;
		int TotalSqFtfornormalside = SqFtfornormalside * 2;
		int TotalSqFt = TotalSqFtforpeakside + TotalSqFtfornormalside;
		int TotalSqFtofwindows = lengthofwindows * widthofwindows * numberofwindows; 
		int TotalSqFtofdoors = lengthofdoors * widthofdoors * numberofdoors;
		int SqFttopaint = TotalSqFt - TotalSqFtofdoors - TotalSqFtofwindows;
		int TotalCosttopaint = SqFttopaint * Costtopaint;
		System.out.println("TotalCosttopaint: " + TotalCosttopaint);
	}
}
