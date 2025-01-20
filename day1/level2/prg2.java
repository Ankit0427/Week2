class BankAccount {
    // Attributes
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
 class prg2 {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("John Doe", 123456, 1000.0);

        // Simulating ATM operations
        System.out.println("Welcome to the ATM!");
        account.displayBalance();

        // Depositing money
        account.deposit(500.0);

        // Withdrawing money
        account.withdraw(300.0);

        // Attempting to withdraw more than the balance
        account.withdraw(1500.0);

        // Displaying final balance
        account.displayBalance();
    }
}
