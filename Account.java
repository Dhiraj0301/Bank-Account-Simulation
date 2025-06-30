import java.util.ArrayList;

public class Account {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private ArrayList<String> transactionHistory;

    public Account(String name, int accNumber) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created for " + name + " (A/C No: " + accNumber + ")");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: ₹" + amount);
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: ₹" + amount);
            System.out.println("Successfully withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void displayTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactionHistory) {
            System.out.println("- " + transaction);
        }
    }
}
