package verify;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("3���� ������ �Է� �ϼ���");
		int n1, n2, n3, max, min;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt(); // ù��° �Է°�
		n2 = sc.nextInt(); // �ѹ�° �Է°�
		n3 = sc.nextInt(); // ����° �Է°�
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		System.out.println("n3="+n3);
		 // �Ʒ��� �ڵ带 �ۼ��ϼ���.
		 // ?
		max = (n1 > n2 && n1>n3) ? n1 : ( n2>n3) ? n2 : n3;
		min = (n1<n2 &&n1<n3)? n1 : (n2<n3)?n2 : n3;
		 System.out.println("max="+max);
		 System.out.println("min="+min);
		
		 }
	}


