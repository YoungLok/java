package chap000.exam;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for (int i = 0; i<5;i++) {
			System.out.print("���ڸ� �Է����ּ��� : ");
			sum += sc.nextInt();
			System.out.print("�� : "+sum);
			System.out.println();
			if(sum>=100) {
				System.out.println("���α׷� ����!");
				break;
			}
		}
	}

}
