package com.bankAccountManagementSystem;


public class TransactionHistory {

    private Transaction[] transactions = new Transaction[100];
    private int transactionCount = 0;

    public void addTransaction(Transaction transaction) {

        if (transactionCount >= transactions.length) {
            System.out.println("Transaction history is full!");
            return;
        }

        transactions[transactionCount] = transaction;
        transactionCount++;
    }

    public void displayHistory() {

        if (transactionCount == 0) {
            System.out.println("No transactions available.");
            return;
        }

        System.out.println("===== TRANSACTION HISTORY =====");

        for (int i = 0; i < transactionCount; i++) {
            System.out.println("Transaction " + (i + 1));
            transactions[i].displayTransaction();
        }
    }
}
