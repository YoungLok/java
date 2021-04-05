package chap000.exam;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for (int i = 0; i<5;i++) {
			System.out.print("숫자를 입력해주세요 : ");
			sum += sc.nextInt();
			System.out.print("합 : "+sum);
			System.out.println();
			if(sum>=100) {
				System.out.println("프로그램 종료!");
				break;
			}
		}
	}

}
