package chap000.exam;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("���ڸ� �Է��� �ּ���:");
		num = sc.nextInt();
		if(num==0) {
			System.out.println("0�Դϴ�");
		}else if(num<0){
			System.out.println("���� �Դϴ�");
			
		}else{
			System.out.println("��� �Դϴ�");
		}
	
		
	}

}
