package ch01;

public class Ex03 extends BankAccount {
	public static void main(String[] args) throws InvalidWithdraw{
		BankAccount ba = new BankAccount(0);
		ba.deposit(100000);
		try {
			ba.withdraw(100000);
			ba.withdraw(200000);
		}catch(InvalidWithdraw e) {
			System.out.println(e.getMessage());
		}
	}
}
