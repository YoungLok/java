package sec07.exam01_constructor;

public class StringReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr="�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�";
		String newStr= oldStr.replaceAll("�ڹ�", "JAVA");
		System.out.println(newStr);
	}

}
