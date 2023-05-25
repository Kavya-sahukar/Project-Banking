package com.icici;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	System.out.println("Welcome to icici Bank");
	
	Scanner scan=new Scanner(System.in);
	Bank bank=new BankImpl(5000);
	
	while(true) {
		System.out.println(" Enter choice\n1:Deposit Amount\n2:Withdraw Amount\n3:CheckBalance\n4:Exit ");	
		int choice=scan.nextInt();	
		switch(choice) {
		case 1:
			System.out.println("Enter amount to bre deposited");
			int amountTodeposit=scan.nextInt();
			bank.deposit(amountTodeposit);    //bank.deposit(scan.nextInt());
		case 2:
			System.out.println("Enter amount withdraw");
			int amountToWithdraw=scan.nextInt();
			bank.withdraw(amountToWithdraw);  //bank.withdraw(scan.nextInt));
		case 3:
			System.out.println("Available balance Rs."+bank.getBalance());
			break;
		case 4:
			System.out.println("Thankyou,Visit Again!");
			System.exit(0);
		default:
			try {
			throw new InvalidChoiceException("Invalid Choice,Kindly check Enter valid Choice");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}}
		System.out.println("------------------------------------");
	}
	
	
}
}
