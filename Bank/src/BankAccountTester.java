import java.util.Scanner;
public class BankAccountTester {

	
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter Starting Balance for your account");
double startbal= in.nextDouble();
 BankAccount myBankAccount= new BankAccount(startbal);
 
 double startBal=in.nextDouble();
 System.out.println("Enter how much you would like to withdraw: ");
 double withdrawamount= in.nextDouble();
 myBankAccount.withdraw(withdrawamount);
 
 double startBal1=in.nextDouble();
 System.out.println("Enter how much you would like to deposit: ");
 double depositamount= in.nextDouble();
 myBankAccount.deposit(depositamount);
 
 System.out.println("availible balance" + myBankAccount);
 double startbal1= in.nextDouble();
System.out.print(myBankAccount.getBalance());
 
		
		
	}

}
