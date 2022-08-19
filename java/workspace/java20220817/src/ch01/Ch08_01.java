package ch01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch08_01 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요.");
		try{
			int input1Value = input1.nextInt();
			System.out.println("나머지 한개의 정수를 입력하세요.");
			int input2Value = input2.nextInt();
			
			System.out.println("두 값은 곱셈 결과는 :" + input1Value*input2Value);			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("정수를 입력하세요");
		}
			
	}
}
