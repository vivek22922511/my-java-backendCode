
package com.bankAccountManagementSystem;

public class BankService {

	private BankAccount[] accounts = new BankAccount[5];
	private TransactionHistory[] histories = new TransactionHistory[5];
	private int accountCount = 0;

	public boolean addAccount(BankAccount account) {

		if (accountCount >= accounts.length) {
			System.out.println("Bank account storage is full!");
			return false;
		}

		if (findAccount(account.getAccountNumber()) != null) {
			System.out.println("Account number already exists!");
			return false;
		}

		accounts[accountCount] = account;
		histories[accountCount] = new TransactionHistory();

		// Record the opening balance
		Transaction openingTransaction = new Transaction("Opening Balance", account.getBalance(), account.getBalance());

		histories[accountCount].addTransaction(openingTransaction);

		accountCount++;

		System.out.println("Account added successfully!");
		return true;
	}

	public BankAccount findAccount(int accountNumber) {

		for (int i = 0; i < accountCount; i++) {
			if (accounts[i].getAccountNumber() == accountNumber) {
				return accounts[i];
			}
		}

		return null;
	}

	private TransactionHistory findHistory(int accountNumber) {

		for (int i = 0; i < accountCount; i++) {
			if (accounts[i].getAccountNumber() == accountNumber) {
				return histories[i];
			}
		}

		return null;
	}

	public void deposit(BankAccount account, double amount) {

		if (amount <= 0) {
			System.out.println("Deposit amount must be greater than zero.");
			return;
		}

		account.setBalance(account.getBalance() + amount);

		Transaction transaction = new Transaction("Deposit", amount, account.getBalance());

		findHistory(account.getAccountNumber()).addTransaction(transaction);

		System.out.println("Deposit successful!");
		System.out.println("Updated balance: " + account.getBalance());
	}

	public void withdraw(BankAccount account, double amount) {

		if (amount <= 0) {
			System.out.println("Withdrawal amount must be greater than zero.");
		} else if (amount > account.getBalance()) {
			System.out.println("Insufficient balance!");
		} else {
			account.setBalance(account.getBalance() - amount);

			Transaction transaction = new Transaction("Withdrawal", amount, account.getBalance());

			findHistory(account.getAccountNumber()).addTransaction(transaction);

			System.out.println("Withdrawal successful!");
			System.out.println("Updated balance: " + account.getBalance());
		}
	}

	public void displayAllAccounts() {

		if (accountCount == 0) {
			System.out.println("No accounts available.");
			return;
		}

		for (int i = 0; i < accountCount; i++) {
			System.out.println("\nAccount Number: " + accounts[i].getAccountNumber());
			System.out.println("Account Holder: " + accounts[i].getAccountHolderName());
			System.out.println("Balance: " + accounts[i].getBalance());
		}
	}

	public void displayTransactionHistory(int accountNumber) {

		TransactionHistory history = findHistory(accountNumber);

		if (history == null) {
			System.out.println("Account not found!");
			return;
		}

		history.displayHistory();
	}

	// for transfer the amount bw two account....

	public void transferMoney(BankAccount sender, BankAccount receiver, double amount) {

		if (sender == receiver) {
			System.out.println("Cannot transfer money to the same account!");
			return;
		}

		if (amount <= 0) {
			System.out.println("Transfer amount must be greater than zero.");
			return;
		}

		if (amount > sender.getBalance()) {
			System.out.println("Insufficient balance!");
			return;
		}

		sender.setBalance(sender.getBalance() - amount);
		receiver.setBalance(receiver.getBalance() + amount);

		Transaction senderTransaction = new Transaction("Transfer Sent to Account " + receiver.getAccountNumber(),
				amount, sender.getBalance());

		Transaction receiverTransaction = new Transaction("Transfer Received from Account " + sender.getAccountNumber(),
				amount, receiver.getBalance());

		findHistory(sender.getAccountNumber()).addTransaction(senderTransaction);

		findHistory(receiver.getAccountNumber()).addTransaction(receiverTransaction);

		System.out.println("Money transferred successfully!");
		System.out.println("Sender's balance: " + sender.getBalance());
		System.out.println("Receiver's balance: " + receiver.getBalance());
	}

}
