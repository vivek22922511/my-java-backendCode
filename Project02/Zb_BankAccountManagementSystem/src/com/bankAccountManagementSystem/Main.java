
package com.bankAccountManagementSystem;

public class Main {

	public static void main(String[] args) {

		Inputhelper input = new Inputhelper();
		BankService service = new BankService();

		int choice;

		do {
			System.out.println("\n===== BANK MENU =====");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Check Balance");
			System.out.println("5. View All Accounts");
			System.out.println("6. View Transaction History");
			System.out.println("7. Transfer Money");
			System.out.println("8. Exit");

			choice = input.readInt("Enter your choice: ");

			switch (choice) {

			case 1: {
				int accountNumber = input.readInt("Enter account number: ");
				String name = input.readString("Enter account holder name: ");
				double balance = input.readDouble("Enter initial balance: ");

				if (accountNumber <= 0 || name.isBlank() || balance < 0) {
					System.out.println("Invalid account details!");
					break;
				}

				BankAccount account = new BankAccount(accountNumber, name, balance);

				service.addAccount(account);
				break;
			}

			case 2: {
				int id = input.readInt("Enter account number: ");
				BankAccount account = service.findAccount(id);

				if (account == null) {
					System.out.println("Account not found!");
					break;
				}

				double amount = input.readDouble("Enter deposit amount: ");
				service.deposit(account, amount);
				break;
			}

			case 3: {
				int id = input.readInt("Enter account number: ");
				BankAccount account = service.findAccount(id);

				if (account == null) {
					System.out.println("Account not found!");
					break;
				}

				double amount = input.readDouble("Enter withdrawal amount: ");
				service.withdraw(account, amount);
				break;
			}

			case 4: {
				int id = input.readInt("Enter account number: ");
				BankAccount account = service.findAccount(id);

				if (account == null) {
					System.out.println("Account not found!");
				} else {
					System.out.println("Current balance: " + account.getBalance());
				}
				break;
			}

			case 5:
				service.displayAllAccounts();
				break;

			case 6: {
				int id = input.readInt("Enter account number to view history: ");
				service.displayTransactionHistory(id);
				break;
			}

			case 7: {
				int senderId = input.readInt("Enter sender account number: ");

				BankAccount sender = service.findAccount(senderId);

				if (sender == null) {
					System.out.println("Sender account not found!");
					break;
				}

				int receiverId = input.readInt("Enter receiver account number: ");

				BankAccount receiver = service.findAccount(receiverId);

				if (receiver == null) {
					System.out.println("Receiver account not found!");
					break;
				}

				double amount = input.readDouble("Enter amount to transfer: ");

				service.transferMoney(sender, receiver, amount);

				break;
			}

			case 8:
				System.out.println("Thank you for using our bank!");
				break;

			default:
				System.out.println("Invalid choice! Select 1 to 8.");
			}

		} while (choice != 8);
	}
}
