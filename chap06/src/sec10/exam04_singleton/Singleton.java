package sec10.exam04_singleton;

public class Singleton {
	//�ʵ�
	//2�ڱ� �ڽ� Ÿ���� �ʵ忡 ��ü�� �����Ͽ� ���Խ�Ű�� private static ���� �����Ѵ�
	private static Singleton singleton = new Singleton();
	
	
	//������
	//���� �����ڷν� ���� Ŭ���������� ������ ����Ѵ�
	//1 �����ڸ� private ���� �����ڷ� �����Ͽ� �ܺ� Ŭ�������� ��ü�� ������ ���ϵ��� �Ѵ�
	private Singleton() {}
	
	//�޼ҵ�
	//3 ����Ÿ���� �ڽ� Ÿ������ �� get instance �޼Ҹ� �����Ͽ� �ڱ� �ڽ��� ��ü�� �Ҵ�� �ʵ带 ��ȯ�Ѵ�
	static Singleton getInstance() {
		return singleton;
	}
	
}
