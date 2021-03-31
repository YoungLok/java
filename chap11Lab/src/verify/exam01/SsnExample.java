package verify.exam01;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SsnExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regSsn="\\d{6}-\\d{7}";//정규식
		System.out.println("주민 번호 13자리를 -로 나누어 입력해 주세요 ");
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
						System.out.println("오류:주민번호 앞자리는 6자리 입니다");
					}else {
						System.out.println("올바른 주민번호 앞자리입니다");
					}
				
				}if(i==2) {
					if(token.length()!=7) {
						System.out.println("오류:주민번호 뒷자리는 7자리 입니다");
					}
				}else {
					System.out.println("올바른 주민번호 뒷자리 입니다");
				}
			}
		}else {
			System.out.println("주민번호가 올바르지 않습니다");
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
			System.out.println("올바른 주민번호 입니다");
			
		}else if (key2>=10) {
			int key3=key2%10;
			if(key3==Integer.parseInt(newdata.substring(12,13))) {
				System.out.println("올바른 주민번호 입니다");
			}
			
		}else {
			System.out.println("잘못된 주민 번호 입니다");
		}
	
		
	}
}
