package lab3;

public class SavingsAccountDriver {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		
		SavingsAccount.modifyAnnualInterestRate(4/100f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("First Month");
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		
		
		SavingsAccount.modifyAnnualInterestRate(5/100f);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("\nSecond Month");
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		
		
	}
}
