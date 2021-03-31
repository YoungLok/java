package sec13.exam01_math;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선택번호
		int[] selectNumber = new int[6];
		Random random =new Random();
		System.out.print("선택 번호:");
		for(int i=0; i<6 ;i++) {
			selectNumber[i]=random.nextInt(45)+1;
			System.out.println(selectNumber[i]+" ");
		}
		//당첨번호 
		int[] winningNumber = new int[6];
		random= new Random(5);
		System.out.print("당첨번호:");
		for(int i= 0 ; i<6 ; i++) {
			winningNumber[i]=random.nextInt(45)+1;
			System.out.println(winningNumber[i]+" ");
			}
				
	}

}
