public class Account {
    private String owner; // Name of the account owner
    private int balance; // Current balance in the account
    private String accountNumber; // Unique identifier for the account

    // Constructor to initialize an Account object
    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Getters and Setters for account fields
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method to simulate the transfer
    public void transfer(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            // If not enough funds, throw the custom exception
            throw new NotEnoughMoneyException("Archie you have insufficient funds for transfer (;");
        }
        balance -= amount; // Deduct the amount from the balance
        System.out.println("Transfer successful!");
    }
}
