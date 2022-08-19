package ch01;
class InvalidWithdraw extends Exception{ //예외 받이
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}
public class BankAccount {
	int minimumMoney;
	public BankAccount() {}
	public BankAccount(int minimumMoney) { //생성자
		this.minimumMoney = minimumMoney;
	}
	public void deposit(int money) { //입금 메소드
		minimumMoney += money;
		System.out.println("정상 입금처리 : 입금금액 = "+money+", 잔금 = "+minimumMoney);
	}
	public void withdraw(int money) throws InvalidWithdraw {//출금 메소드
		if(money<0 || minimumMoney<money) {
			throw new InvalidWithdraw("금액 오류입니다. 잔액을 확인해");
			
		}else {
			minimumMoney -= money;
			System.out.println("정상 인출처리 : 인출금액 = "+money+", 잔금 = "+minimumMoney);
		}
	}
	
	
	public static void main(String[] args) throws InvalidWithdraw{

	}

}
