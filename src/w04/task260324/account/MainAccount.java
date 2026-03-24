package w04.task260324.account;

public class MainAccount {
    public static void main(String[] args) {
        Account a = new Account(100); // 100원을 예금하면서 계좌 생성
        a.deposit(5000); // 5000원 예금
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        int bulk[] = { 100, 500, 200, 700 };
        a.deposit(bulk); // bulk 배열에 있는 모든 돈 예금
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        int money = 1000; // 인출하고자 하는 금액
        int wMoney = a.withdraw(money); // wMoney는 실제 인출한 금액

        if (wMoney < money) { // 인출하고자 하는 금액보다 작은 돈이 인출된 경우
            System.out.println(wMoney + "원만 인출"); // 잔금이 1000원보다 작은 경우
        } else {
            System.out.println(wMoney + "원 인출"); // 잔금이 1000원보다 큰 경우
        }

        System.out.println("잔금은 " + a.getBalance() + "원입니다.");
    }
}
