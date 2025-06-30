import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder's Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNumber = sc.nextInt();

        Account myAccount = new Account(name, accNumber);

        while (true) {
            System.out.println("\n----- BANK MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = sc.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    myAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    myAccount.displayBalance();
                    break;
                case 4:
                    myAccount.displayTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for banking with us!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
