package d4.q4;


public class BankAccount {
    // 계좌 번호, 잔고, 비밀번호에 대한 정보가 담겨있다.
    private int balance;
    // 계좌 번호는 0~9 사이의 숫자로 이루어진 8자리 문자열이다.
    private String accountNumber;
    // 비밀번호는 0~9 사이의 숫자로 이루어진 4자리 문자열이다.
    private String password;
    // 총 생성된 계좌의 숫자와, 전체 계좌들의 잔고 총합에 대한 정보를 가지고 있다.
    private static int accountCount = 0;
    private static int totalBalance = 0;

    public BankAccount(String accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = 0;
        accountCount += 1;
    }

    // 입금을 나타내는 `deposit` 메서드를 가지고 있다.
    // 입금액을 인자로 받는다.
    public int deposit(int amount) {
        this.balance += amount;
        totalBalance += amount;
        // 이후 잔고를 정수로 반환한다.
        return this.balance;
    }

    // 출금을 나타내는 `withdraw` 메서드를 가지고 있다.
    // 출금액과 비밀번호를 인자로 받는다.
    public boolean withdraw(int amount, String password) {
        if (!this.password.equals(password) || this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        totalBalance -= amount;
        // 성공 여부를 `boolean` 데이터로 반환한다.
        return true;
    }

    // 이 정보를 반환하는 메서드를 가지고 있다.
    public static int getAccountCount() {
        return accountCount;
    }
    public static int getTotalBalance() {
        return totalBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
}
