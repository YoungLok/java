package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-128 < byte < 127
		//-2^31 <= int <= 2^31-1
		byte var1 = 125;
		int var2 = 125;
		//반복문
		// i = 0 부터 하나씩 증가하여 5 보다 작을때까지 반복한다
		for (int i=0; i<5; i++) {
			var1++;  //var1 = var1 +1 
			System.out.println(i+"var1="+var1);
			var2++; //var2 = var2 + 1
			System.out.println(i+"var2="+var2);
		}
	}

}
