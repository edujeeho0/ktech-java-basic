package d6.q2;
/*
SavingsAccount 클래스는 몇번째 입금 회차인지에 대한 정보, 만기 회차 정보, 매 회차 입금액에 대한 정보를 가지고 있다.
SavingsAccount 클래스는 돈을 입금, 출금할 수 있다.
    입금할때는 회차 입금액과 동일한 금액이 입금되어야 한다.
    출금은 입금 회차가 만기 회차 보다 더 클때만 가능하다.
    출금할때는 출금액과 비밀번호를 함께 제공해야 한다.
 */
public class SavingsAccount extends BankAccount {
    // 몇번이나 입금했는지
    private int round;
    // 몇번 입금할 예정인지
    private int targetRound;
    // 매번 입금할 금액
    private int depositAmount;

    // 부모 생성자가 만들어져 있다면,
    // 자식도 생성자를 만들고
    // super()를 이용해 부모의 생성자를 사용해 주어야 한다.
    public SavingsAccount(
            String password,
            int targetRound,
            int depositAmount
    ) {
        super(password);
        this.targetRound = targetRound;
        this.depositAmount = depositAmount;
    }

    @Override
    public boolean deposit(int amount) {
        // 입금하려는 금액이 먼저 설정한 금액과 일치해야
        // 입금이 가능하다.
        if (amount != depositAmount) {
            return false;
        }
        // 입금을 했으니까 몇회 입금했는지 증가한다.
        this.round++;

        // 나머지 과정은 BankAccount랑 똑같다.
        return super.deposit(amount);
    }

    @Override
    public boolean withdraw(int amount, String password) {
        // 목표 입금 회차에 도달하지 못했다면 출금 불가
        if (round < targetRound) {
            return false;
        }
        return super.withdraw(amount, password);
    }
}
