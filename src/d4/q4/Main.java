package d4.q4;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount(
                "12345678",
                "1234"
        );
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("You have: %d", savingsAccount.deposit(500)));
        }


        System.out.println(savingsAccount.withdraw(1000, "1234"));
        System.out.println(savingsAccount.withdraw(1000, "2234"));
        System.out.println(savingsAccount.withdraw(10000, "2234"));
        System.out.println(BankAccount.getAccountCount());
        System.out.println(BankAccount.getTotalBalance());

        BankAccount account = new BankAccount("22222222", "2222");
        account.deposit(100000000);
        System.out.println(BankAccount.getAccountCount());
        System.out.println(BankAccount.getTotalBalance());
    }
}
