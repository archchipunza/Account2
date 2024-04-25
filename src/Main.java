public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("Archie", 800, "59644");

        try {
            // Attempting to perform a transfer exceeding the balance
            myAccount.transfer(1000);
        } catch (NotEnoughMoneyException e) {
            // Catch the specific exception for insufficient funds
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other unexpected exceptions 
            System.out.println("Error: An unexpected exception occurred.");
        } finally {
            // This block always executes, regardless of exceptions
            System.out.println("Current account balance: " + myAccount.getBalance());
        }
    }
}
