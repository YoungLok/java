package chap000.exam;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("숫자를 입력해 주세요:");
		num = sc.nextInt();
		if(num==0) {
			System.out.println("0입니다");
		}else if(num<0){
			System.out.println("음수 입니다");
			
		}else{
			System.out.println("양수 입니다");
		}
	
		
	}

}
