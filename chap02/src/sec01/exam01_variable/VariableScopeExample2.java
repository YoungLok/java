package sec01.exam01_variable;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		int v1=15;
		if(v1>10) {
			//if블럭 내에서  변수 선언 
			int v2;
			//계산
			v2 = v1 -10;
			//출력
			System.out.println(v2);
		}
	}

}
