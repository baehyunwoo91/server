package ch01;

import java.util.Date;

public class PrintTime implements Runnable{
	
	int cnt;
	
	public PrintTime(){}
	
	public PrintTime(int cnt) { // cnt 만큼  현재시간과 스레드 이름을 출력하는 메서드
		this.cnt = cnt;
	}
	public void run(){
		
		Date date = new Date();
		
		for(int i=0 ; i < cnt ; i++) {
			System.out.println("순위 : "+Thread.currentThread().getPriority() +" "+ date +" "+ Thread.currentThread().getName());
		}
		
	}
}
