package sec03.exam04_break;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num =(int)(Math.random()*6)+1; // 1부터 6사이의 임의의 정수를 생성한다
			System.out.println(num);
			if(num == 6) { 
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
