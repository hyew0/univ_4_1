package w04.task260324.account;

class Account {
    // 필드는 private 접근 지정자 사용
    private int balance;

    // 초기 예금액을 받아 계좌 생성
    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    // 단일 금액 예금
    public void deposit(int amount) {
        this.balance += amount;
    }

    // 배열을 통한 다중 금액 예금
    public void deposit(int[] amounts) {
        for (int amount : amounts) {
            this.balance += amount;
        }
    }

    // 잔금 확인
    public int getBalance() {
        return this.balance;
    }

    // 인출 기능: 잔금이 인출하는 금액보다 작으면 잔금만큼만 인출됨
    public int withdraw(int amount) {
        if (this.balance < amount) {
            int withdrawableAmount = this.balance;
            this.balance = 0; // 전액 인출되므로 잔금은 0
            return withdrawableAmount;
        } else {
            this.balance -= amount;
            return amount;
        }
    }
}
