package sec08.exam04_overloading;

public class Calculator {
	//�ʵ�
	//������
	
	//�޼ҵ�
	//���簢���� ���̸� ���Ѵ�
	double areaRectangle(double width) {
		return width*width;
	}
	//���簢���� ����
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
