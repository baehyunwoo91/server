package ch01;

import java.util.Random;

/*   클라스    클라스   클라스  클라스  */
class MathodGo extends Ch01{
	public synchronized void plusA(int val) {
		if(val>0) {
			int tmp = super.amount;
			super.amount += val;
			System.out.println("잔액("+tmp+")에서    입금 금액: "+val+ " 잔액 : "+super.amount);	
		}
	}
	public synchronized void MinusA(int val) {
		if(amount > val) {
			int tmp = super.amount;
			super.amount -= val;
			System.out.println("잔액("+tmp+")에서    출금 금액: "+val+ " 잔액 : "+super.amount);	
		}else {
			System.out.println("잔액부족");
		}
	}
}
/*  스레드 클라스   스레드 클라스  스레드 클라스 스레드 클라스  */
class  ThreadBae extends Ch01 implements Runnable{
	MathodGo mg = new MathodGo();
	
	public void run(){
		for(int i = 1 ; i < 10 ; i ++) {	
			int ran = new Random().nextInt(10000);
			int ranMinus = new Random().nextInt(10000);
			mg.plusA(ran);
			mg.MinusA(ranMinus);
		}
	}
}
/*  메인 클라스   메인 클라스  메인 클라스 메인 클라스  */
public class Ch01 {
	int amount = 10000;
	
	public static void main(String[] args){
		Runnable tt = new ThreadBae();
		new Thread(tt).start();
		new Thread(tt).start();	
		new Thread(tt).start();	
		new Thread(tt).start();	
		new Thread(tt).start();	

	}
}