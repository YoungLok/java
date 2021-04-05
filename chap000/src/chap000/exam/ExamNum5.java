package chap000.exam;

public class ExamNum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a = {{ 10, 20, 50},{20,30,15}};
		int sum = 0;
		for (int[] i :a) {
			for (int j: i) {
				sum +=j;
			}
		}
		System.out.println(sum);

		
	}

}
