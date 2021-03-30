package Verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int input;
		int deposit;
		int withdrawal;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
		// 작성 위치
			input = scanner.nextInt();
			if(input ==4) {
				break;
			}else {
				if(input==1) {
					System.out.println("예금하실 금액을 입력하여 주십시오");
					System.out.print("선택> ");
					deposit = scanner.nextInt();
					System.out.println("총 예금액은"+(deposit+balance)+"원 입니다");
					balance += deposit;
				}else if (input == 2) {
					System.out.println("출금하실 금액을 입력하여 주십시오");
					System.out.print("선택> ");
					withdrawal = scanner.nextInt();
					System.out.println("계좌 잔액은"+(balance-withdrawal)+"원 입니다");
					balance -=withdrawal;
				}else {
					System.out.println("계좌 잔액은"+balance+"원 입니다");
				}
			}
		}
		System.out.println("프로그램 종료");
	}

}
