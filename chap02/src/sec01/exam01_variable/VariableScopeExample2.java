package sec01.exam01_variable;

public class VariableScopeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		int v1=15;
		if(v1>10) {
			//if�� ������  ���� ���� 
			int v2;
			//���
			v2 = v1 -10;
			//���
			System.out.println(v2);
		}
	}

}
