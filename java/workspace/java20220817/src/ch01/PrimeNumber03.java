package ch01;

public class PrimeNumber03 extends PrimeNumber02 implements Runnable{
	String msg3;
	public PrimeNumber03() {
	}
	
	public PrimeNumber03(int sosu) {
		super.sosu = sosu;
	}
	
	public void Thread(PrimeNumber03 pn, String msg) {
		 this.msg3 = "1111";
	}
	
	//오버라이딩
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 2 ; i < sosu ; i++) {
			boolean sosuGo = sosucha(i);
			if(sosuGo) {
				System.out.print(i+"\t");
			}
		}
	}
}