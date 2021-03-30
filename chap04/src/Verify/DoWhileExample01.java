package Verify;

import java.util.Scanner;

public class DoWhileExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1~100 사이의 수
		int ran = (int)(Math.random()*100) + 1;
		int cnt = 0, inNum =0;
		 //...
		System.out.println("숫자를 입력해 주세요");
		do {
			System.out.print(">");
			
			inNum = sc.nextInt();
			cnt++;
			
			if(ran == inNum) {
				break;
			}else {
				if(ran>inNum) {
					System.out.println("더 큰 수를 입력해 주세요");
				} else {
					System.out.println("더 작은 수를 입력해 주세요");
				}
				
			}
			
		}while(ran != inNum);
		System.out.println(cnt+"번에 맞쳤습니다.");
		sc.close();
	}

}
