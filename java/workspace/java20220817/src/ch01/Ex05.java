package ch01;

public class Ex05 extends PrimeNumber02{
	public static void main(String[] args) {
		PrimeNumber02 pn = new PrimeNumber02(20,"소수 만드는 스레드");
		pn.start();
	}
}
