package verify.exam01;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {
	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		
		/*
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "은 윤년");
		} else {
			System.out.println(year + "은 평년");
		}
		*/
		GregorianCalendar isLeapYear = new GregorianCalendar();
		if(isLeapYear.isLeapYear(year)) {
			System.out.println("윤년입니다");
		}else {
			System.out.println("윤년이 아닙니다");
		}
			
		
		
	}
}
