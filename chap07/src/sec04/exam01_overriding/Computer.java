package sec04.exam01_overriding;

public class Computer extends Calculator {
	//������̼�:�����Ϸ����� �ڵ带 ������ ��û�Ѵ�
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		//return super.areaCircle(r);
		System.out.println("Computer ��ü�� areaCircle()����");
		return Math.PI*r*r;
	}
	
	
}
