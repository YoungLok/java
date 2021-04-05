package chap000.exam;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] arr = new int [100];
		for (int i =1; i<arr.length+1; i++) {
			sum += i ;
		}
		double avg;
		avg = (double) sum/arr.length;
		
		System.out.println("1부터 100까지의 합: "+sum);
		System.out.println("평균값: "+avg);
	}

}
