package ch01;

public class PrimeNumber01 extends Thread {
	int sosu;

	public PrimeNumber01() {
		super();
	}
	public PrimeNumber01(int sosu) {
		this.sosu = sosu;
	}
	public boolean sosucha(int sosu) {
		for(int j = 2; j < sosu  ; j++){ //3
			if(sosu%j==0) {
				return false; //소수가 아닙니다.
			}
		}return true; //소수 입니다.
	}
	public void run() {
		for(int i = 2 ; i < sosu ; i++) {
			boolean sosuGo = sosucha(i);
			if(sosuGo) {
				System.out.print(i+"\t");
			}
		}
	}
}
