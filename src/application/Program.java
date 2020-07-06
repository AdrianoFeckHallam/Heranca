package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/*
		 * Account acc = new Account(1001, "Alex", 0.0); BusinessAccount bacc = new
		 * BusinessAccount(1002, "Maria", 0.0, 500.0);
		 */
		
		// UPCASTING
		
		/*
		 * Account acc1 = bacc; Account acc2 = new BusinessAccount(1003, "Bob", 0.0,
		 * 200.0); Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		 */
		
		// DOWNCASTING
		
		/*
		 * BusinessAccount acc4 = (BusinessAccount)acc2; acc4.loan(100.0);
		 * 
		 * // BusinessAccount acc5 = (BusinessAccount)acc3; if(acc3 instanceof
		 * BusinessAccount) { BusinessAccount acc5 = (BusinessAccount)acc3;
		 * acc5.loan(200.0); System.out.println("Loan!"); }
		 * 
		 * if(acc3 instanceof SavingsAccount) { SavingsAccount acc5 =
		 * (SavingsAccount)acc3; acc5.updateBalance(); System.out.println("Update!"); }
		 */
		
		// Testando Sobreposição
		
		/*
		 * Account accTS = new Account(1005, "Adriano", 1000.0); accTS.withdraw(200.0);
		 * System.out.println(accTS.getBalance());
		 * 
		 * Account accTS2 = new SavingsAccount(1006, "Sabrina", 1000.0, 0.01);
		 * accTS2.withdraw(200.0); System.out.println(accTS2.getBalance());
		 * 
		 * Account accTS3 = new BusinessAccount(1007, "Mateus", 1000.0, 500.0);
		 * accTS3.withdraw(200.0); System.out.println(accTS3.getBalance());
		 */
		
		// Polimorfismo
		
		/*
		 * Account x = new Account(1008, "Natiele", 1000.0); Account y = new
		 * SavingsAccount(1009, "Bruna", 1000.0, 0.01);
		 * 
		 * x.withdraw(50.0); y.withdraw(50.0);
		 * 
		 * System.out.println(x.getBalance()); System.out.println(y.getBalance());
		 */
		
		// Classe Abstrata
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1010, "Paulo", 500.0, 0.01));
		list.add(new BusinessAccount(1011, "Albertina", 1000.0, 400.0));
		list.add(new SavingsAccount(1012, "Lurdes", 300.0, 0.01));
		list.add(new BusinessAccount(1013, "José", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}

}
