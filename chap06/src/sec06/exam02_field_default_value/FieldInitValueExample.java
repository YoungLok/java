package sec06.exam02_field_default_value;

public class FieldInitValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�⺻�����ڸ� ȣ���Ͽ� ��ü�� �������� �� �ּҰ��� fiv �� �����Ѵ�.
		
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField:"+fiv.byeField);
		System.out.println("shortField:"+fiv.shortField);
		System.out.println("intField:"+fiv.intField);
		System.out.println("longField:"+fiv.longField);
		System.out.println("booleanField:"+fiv.booleanField);
		System.out.println("doubleField:"+fiv.doubleField);
		System.out.println("arrField:"+fiv.arrField);
		System.out.println("referenceField:"+fiv.referenceField);
	}

}
