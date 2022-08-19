package ch01;

public class PrimeNumber02 extends PrimeNumber01 {
	String msg;
	public PrimeNumber02() {
	}
	public PrimeNumber02(int input, String msg) {
		super.sosu = input;
		this.msg = msg;
	}
	//오버라이딩
	public void run() {
		System.out.println(msg+Thread.currentThread().getName());
		for(int i = 2 ; i < sosu ; i++) {
			boolean sosuGo = sosucha(i);
			if(sosuGo) {
				System.out.print(i+"\t");
			}
		}
	}
}
