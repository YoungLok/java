package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =5;
		double y = 0.0 ;
		double z = x / y ;
		double t =  x % y ;
		if(Double.isInfinite(z) || Double.isNaN(z)){
			System.out.println("�� ���� �Ұ�");
		}else {
			System.out.println(z);
		}
	}
	

}
