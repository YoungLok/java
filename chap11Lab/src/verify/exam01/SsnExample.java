package verify.exam01;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SsnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regSsn="\\d{6}-\\d{7}";//���Խ�
		System.out.println("�ֹ� ��ȣ 13�ڸ��� -�� ������ �Է��� �ּ��� ");
		System.out.print(">>");
		Scanner scanner=new Scanner(System.in);
		String data =scanner.next();
		boolean result = Pattern.matches(regSsn, data);
		
		
		StringTokenizer st = new StringTokenizer(data,"-");
		
		if(result) {
			for(int i=1; i<=2  ; i++) {
				String token = st.nextToken();
				if (i==1) {
					if(token.length()!=6) {
						System.out.println("����:�ֹι�ȣ ���ڸ��� 6�ڸ� �Դϴ�");
					}else {
						System.out.println("�ùٸ� �ֹι�ȣ ���ڸ��Դϴ�");
					}
				
				}if(i==2) {
					if(token.length()!=7) {
						System.out.println("����:�ֹι�ȣ ���ڸ��� 7�ڸ� �Դϴ�");
					}
				}else {
					System.out.println("�ùٸ� �ֹι�ȣ ���ڸ� �Դϴ�");
				}
			}
		}else {
			System.out.println("�ֹι�ȣ�� �ùٸ��� �ʽ��ϴ�");
		}
		int[] mul = {2,3,4,5,6,7,8,9,2,3,4,5};
		String newdata= data.replaceAll("-", "");
		System.out.println(newdata);
		int key1 =0;
		int key2 = 0;
		int total = 0;
		for(int i=0; i<12;i++) {
			total+= Integer.parseInt(newdata.substring(i,i+1))*mul[i];
		}
		
		key1 = total%11;
		key2 = 11-key1;
		System.out.println(Integer.parseInt(newdata.substring(12,13)));
		if (key2==Integer.parseInt(newdata.substring(12,13))) {
			System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
			
		}else if (key2>=10) {
			int key3=key2%10;
			if(key3==Integer.parseInt(newdata.substring(12,13))) {
				System.out.println("�ùٸ� �ֹι�ȣ �Դϴ�");
			}
			
		}else {
			System.out.println("�߸��� �ֹ� ��ȣ �Դϴ�");
		}
	
		
	}
}
