package ch01;

public class Ex07 extends PrintTime{

	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1, "안녕하세요!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2, "반갑습니다");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
		
	}

}
