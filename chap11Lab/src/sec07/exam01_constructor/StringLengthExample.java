package sec07.exam01_constructor;

public class StringLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = new int[3];
		System.out.println("ints.length="+ints.length);
		
		
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length==13) {
			System.out.println("주민번호 자리수가 맞습니다.");
			
		}else {
			System.out.println("주민번호 자리수가 아닙니다");
		}
	}

}
