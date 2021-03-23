import javax.swing.JOptionPane;

public class romanNumeral {
	
	public static void main(String[] args) {
		String[]  romanNumeralOnes = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[]  romanNumeralTens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[]  romanNumeralHundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		
		int yearInput = Integer.parseInt(JOptionPane.showInputDialog("Enter the year: "));
		System.out.println(yearInput);
		
		int millenia = yearInput/1000%10;
		int centuries = yearInput/100%10;
		int decades = yearInput/10%10;
		int years = yearInput/1%10;
		
	System.out.println(millenia + " " + centuries + " " + decades + " " + years);
	
	String romanNumeralYear = "M".repeat(millenia)+romanNumeralHundreds[ centuries]+romanNumeralTens[decades]+romanNumeralOnes[years];
	System.out.println(romanNumeralYear);
	
	JOptionPane.showMessageDialog(null, "The roman numerals for the year " + yearInput + "is" +romanNumeralYear);
	}
}
