package com.packet;
public class SavingsAccount {
public static int annualInterestRate;

private double savingBalance;
public static com.packet.SavingsBalance SavingsBalance(double balance){
	return null;
}
public void calculateMonthlyInterest(){
	double annualInterest=0.0;
	double savingsBalance = 0;
	double interest=(savingsBalance*(annualInterest)/12);
			savingsBalance=savingsBalance+interest;
}
public static void mofifyInterestRate(int newValue){
	annualInterestRate=newValue;
}
public void showBalance(){
	System.out.println("balance");
}
public static void main(Static[]args){
SavingsBalance sb1=SavingsBalance(2000);
SavingsBalance sb2=SavingsBalance(3000);
SavingsBalance.mofifyInterestRate(4);
sb1.showBalance();
sb1.showBalance();
sb1.calculateMonthlyInterest();
sb2.calculateMonthlyInterest();
sb1.showBalance();
sb1.showBalance();
SavingsBalance.mofifyInterestRate(4);
}
}