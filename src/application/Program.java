package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//Testando Sobreposição
		
		Account accTS = new Account(1005, "Adriano", 1000.0);
		accTS.withdraw(200.0);
		System.out.println(accTS.getBalance());
		
		Account accTS2 = new SavingsAccount(1006, "Sabrina", 1000.0, 0.01);
		accTS2.withdraw(200.0);
		System.out.println(accTS2.getBalance());
		
		Account accTS3 = new BusinessAccount(1007, "Mateus", 1000.0, 500.0);
		accTS3.withdraw(200.0);
		System.out.println(accTS3.getBalance());
	}

}
