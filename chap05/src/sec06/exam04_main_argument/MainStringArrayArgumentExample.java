package sec06.exam04_main_argument;

public class MainStringArrayArgumentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=2) {
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// integer.parseInt() �޼Ҵ� �������� ���ڿ��� �Ű������� �Ͽ� ���������� ��ȯ�Ѵ�.
		//�������� ���ڿ� : "10","23",
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 +  num2;
		System.out.println(num1+"+"+num2+"="+result);
				
		
		
	}

}