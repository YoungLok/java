package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		//scanner Ŭ���� Ÿ���� scanner ������ scanner ��ü�� ���Խ�Ų�� 
		Scanner scanner = new Scanner(System.in);
		
		//string Ŭ���� Ÿ��
		String inputString;
		
		do {
			System.out.print(">");
			
			inputString = scanner.nextLine(); //ǥ���������ġ ���� ������ �Է¹޾� ������ ����
			
			System.out.println(inputString);
			
		} while(!inputString.equals("q")); 
			
			System.out.println();
			System.out.println("���α׷� ����");
		
	}

}
