package sec08.exam01_abstract_class;

public abstract class Phone {
	//�߻�Ŭ������ ���� ���
	//�ʵ�
	
	public String owner;
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	//�޼ҵ�(�Ϲݸ޼ҵ�,�߻�޼ҵ�)
	//�߻�޼ҵ�� ���๮�� ���⶧���� �ڽ�Ŭ�������� �� ������ ������Ѵ�.
	public abstract void turnOff();
	
	//�Ϲ� �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
}
