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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
		// �ۼ� ��ġ
			input = scanner.nextInt();
			if(input ==4) {
				break;
			}else {
				if(input==1) {
					System.out.println("�����Ͻ� �ݾ��� �Է��Ͽ� �ֽʽÿ�");
					System.out.print("����> ");
					deposit = scanner.nextInt();
					System.out.println("�� ���ݾ���"+(deposit+balance)+"�� �Դϴ�");
					balance += deposit;
				}else if (input == 2) {
					System.out.println("����Ͻ� �ݾ��� �Է��Ͽ� �ֽʽÿ�");
					System.out.print("����> ");
					withdrawal = scanner.nextInt();
					System.out.println("���� �ܾ���"+(balance-withdrawal)+"�� �Դϴ�");
					balance -=withdrawal;
				}else {
					System.out.println("���� �ܾ���"+balance+"�� �Դϴ�");
				}
			}
		}
		System.out.println("���α׷� ����");
	}

}
