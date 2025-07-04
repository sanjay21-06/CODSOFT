import java.util.Scanner;

// Class to represent the user's Bank Account
class BankAccount {
    private double balance;

    // Constructor to initialize account with starting balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ ₹" + amount + " deposited successfully.");
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("✅ ₹" + amount + " withdrawn successfully.");
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.printf("💰 Current Balance: ₹%.2f\n", balance);
    }
}

// Class to represent the ATM machine interface
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // Starting balance ₹1000

        System.out.println("🏧 Welcome to the ATM Machine!");

        while (true) {
            // Display menu
            System.out.println("\nChoose an option:");
            System.out.println("1. 💸 Withdraw");
            System.out.println("2. 💰 Deposit");
            System.out.println("3. 🧾 Check Balance");
            System.out.println("4. ❌ Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // Handle choices
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("👋 Thank you for using the ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }
        }
    }
}
