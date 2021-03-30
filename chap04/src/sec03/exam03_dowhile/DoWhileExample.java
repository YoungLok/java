package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		//scanner 클래스 타입인 scanner 변수에 scanner 객체를 대입시킨다 
		Scanner scanner = new Scanner(System.in);
		
		//string 클래스 타입
		String inputString;
		
		do {
			System.out.print(">");
			
			inputString = scanner.nextLine(); //표준입출력장치 에서 한줄을 입력받아 변수에 대입
			
			System.out.println(inputString);
			
		} while(!inputString.equals("q")); 
			
			System.out.println();
			System.out.println("프로그램 종료");
		
	}

}
