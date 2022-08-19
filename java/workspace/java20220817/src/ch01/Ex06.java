package ch01;

public class Ex06 extends PrimeNumber03 {

	public static void main(String[] args) {
		new Thread(new PrimeNumber03(25), "소수이비이비이비").start();
	}

}
