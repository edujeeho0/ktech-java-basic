package d6.q2;

/*
BankAccount 클래스는 현재 잔고, 비밀번호에 대한 정보를 가지고 있다.
BankAccount 클래스는 돈을 입금, 출금할 수 있다.
출금할때는 출금액과 비밀번호를 함께 제공해야 한다.
 */
public class BankAccount {
    private int amount;
    private String password;

    public BankAccount(String password) {
        this.amount = 0;
        this.password = password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    // 돈넣기
    public boolean deposit(int amount) {
        this.amount += amount;
        return true;
    }
    // 돈빼기
    public boolean withdraw(int amount, String password) {
        // 1. 비밀번호가 일치하지 않을 때
        // 2. 출금 요구액이 잔고보다 클 떼
        if (!this.password.equals(password) || this.amount < amount ) {
            return false;
        }
        this.amount -= amount;
        return true;
    }
}
