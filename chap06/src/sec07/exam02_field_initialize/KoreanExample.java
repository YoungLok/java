package sec07.exam02_field_initialize;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Korean k1 = new Korean("박자바","011111-1125321");
		System.out.println("k1.name="+k1.name);
		System.out.println("k1.name="+k1.ssn);
		
		Korean k2 = new Korean("김자바","012222-2212321");
		System.out.println("k2.name="+k2.name);
		System.out.println("k2.name="+k2.ssn);
	}

}
