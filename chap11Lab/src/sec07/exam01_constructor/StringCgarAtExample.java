package sec07.exam01_constructor;

public class StringCgarAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "0106241230123";
		char sex = ssn.charAt(7);
		switch(sex) {
		case'1':
		case'3':
			System.out.println("�����Դϴ�");
			break;
		case'2':
		case'4': 
			System.out.println("�����Դϴ�");
			break;
		}
	}

}
