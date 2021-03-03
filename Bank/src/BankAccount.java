/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
	//Instance variable
	private double balance;
double Interest;

	public String getBalance;
	
   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount(double amount, double totalInterest)
   {
      balance = amount;
      Interest = totalInterest;
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
      if (balance < amount) { System.out.println("Insufficent Funds to support withdrawl");}
      else {balance = balance - amount; }
   }
   /**
      Gets the current balance of this bank account.
 * @return 
      @return the current balance
   */
   public double calcInterest(double b, double r, int n, int t) {
	   double newBalance=(b*Math.pow(1+(r/n),n*t))-b;
  return newBalance; 
		  }
   public void InterestMeth(double interestRate) {
	   
	   Interest= balance*interestRate;
	   balance=balance+ Interest;
   }
   public double getInterest()
   {
      return Interest;
   }
   
   public double getBalance()
   {
      return balance;
   }
}
