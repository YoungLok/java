package Verify;

import java.util.Scanner;

public class DoWhileExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1~100 ������ ��
		int ran = (int)(Math.random()*100) + 1;
		int cnt = 0, inNum =0;
		 //...
		System.out.println("���ڸ� �Է��� �ּ���");
		do {
			System.out.print(">");
			
			inNum = sc.nextInt();
			cnt++;
			
			if(ran == inNum) {
				break;
			}else {
				if(ran>inNum) {
					System.out.println("�� ū ���� �Է��� �ּ���");
				} else {
					System.out.println("�� ���� ���� �Է��� �ּ���");
				}
				
			}
			
		}while(ran != inNum);
		System.out.println(cnt+"���� ���ƽ��ϴ�.");
		sc.close();
	}

}
