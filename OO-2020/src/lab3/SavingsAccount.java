package lab3;

public class SavingsAccount {
	
	/* Variables
	 * 
	 */
	
	private int uniqueID;
	private static int newUniqueID = 0;
	private static float annualInterestRate = 0f;
	private double savingsBalance;
	
	/** Constructors
	 * 
	 */
	public SavingsAccount() {
		newUniqueID++;
		setUniqueID(newUniqueID);
	}


	
	
	
	/*	Setters And Getters
	 * 
	 */
	public int getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	
	
	public static float getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void modifyAnnualInterestRate(float annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	
	
	
	public double getSavingsBalance() {
		this.savingsBalance = Math.round(this.savingsBalance * 100.0) / 100.0;	//getSavingsBalance will be rounded to cents
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		
		this.savingsBalance = savingsBalance;
		
	}


	
	/*	Misc
	 * 
	 */
	
	public void calculateMonthlyInterest() {
		double interest = (this.savingsBalance * getAnnualInterestRate()) / 12;	
		setSavingsBalance(this.savingsBalance + interest);
		
		
	}
	
	@Override
	public String toString() {
		return "This months interest rate is = " + getAnnualInterestRate() + ", new Balance = " + getSavingsBalance() + " euro";
	}
	
	
	
	
	/*
	 * 
	 */
}
