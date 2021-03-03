import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Starting Balance for your account: ");
		double startbal = in.nextDouble();
		System.out.print("enter the interest rate for this account: ");
		double Interest = in.nextDouble();
		BankAccount myBankAccount = new BankAccount(startbal, Interest);
		System.out.println("    Create a new Bank Account " + startbal + " balance and interest rate " + Interest);

		System.out.print("Enter how much you would like to deposit: ");
		double depositamount = in.nextDouble();
		System.out.println("    Deposited" + depositamount);
		myBankAccount.deposit(depositamount);

		System.out.print("Enter how much you would like to withdraw: ");
		double withdrawamount = in.nextDouble();
		double BankAccountbalance = myBankAccount.getBalance();
		if (BankAccountbalance > withdrawamount) {
			myBankAccount.withdraw(withdrawamount);
			// BankAccountbalance = BankAccountbalance - withdrawamount;
			System.out.println("    Withdrew:" + withdrawamount);
		} else {
			System.out.println("    Insufficent Funds to Support Withdrawl");
		}

		System.out.print("Enter how much you would like to withdraw: ");
		double nextwithdrawamount = in.nextDouble();
		if (BankAccountbalance > nextwithdrawamount) {
			myBankAccount.withdraw(nextwithdrawamount);
			BankAccountbalance = BankAccountbalance - nextwithdrawamount;
			System.out.println("    Withdrew: " + nextwithdrawamount);
		} else {
			System.out.println("    Insufficent Funds to Support Withdrawl");
		}
		String a = "Yes";
		String b = "yes";
		System.out.print("If you want me to generate interest, enter 'Yes': ");
		String response = in.next();
		if (response.equals(a) || response.equals(b)) {
			double BankAccountInterest = myBankAccount.calcInterest(BankAccountbalance, Interest, 1, 1);
			System.out.println("    Interest: " + BankAccountInterest);
			BankAccountbalance = BankAccountbalance + BankAccountInterest;
		} else {
			System.out.println("This is your account without Interest" + myBankAccount.getBalance);
			System.exit(0);
		}

		System.out.println("This is your total Balance: " + (BankAccountbalance));

	}

}
