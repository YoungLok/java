package sec04.exam07_conditional;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80 ?'B' : 'C' ));
		System.out.println(score + "����" + grade + "����Դϴ�.");
	}

}