package verify;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min;
		int[] s = new int[5];
		System.out.print("���� 5���� �Է� �ϼ���");
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=0; i< s.length; i++) {
			System.out.println();
			System.out.print(">");
			s[i]= sc.nextInt();
			System.out.print("�� ["+(i+1)+"] ��° �����Դϴ�.");
		}
		System.out.println();
		
		max= s[0] ;	
		min= s[0] ;	
		
		//���� Max
/**********************************************************/
	/*	if(s[0] > s[1]) {
			if(s[0] > s[2]) {
				if(s[0]> s[3]) {
					if(s[0]> s[4]) {
						max= s[0];
					}
				}
			} 
		}else if (s[1]>s[2]) {
			if(s[1]>s[3]) {
				if(s[1]>s[4]) {
					max= s[1];
				}
			}
		}else if(s[2]>s[3]) {
			if(s[2]>s[4]) {
				max=s[2];
			
			}
		}else if(s[3]>s[4]) {
			max=s[3];
		}else {
			max= s[4];
		}
		//���� Min */
/***********************************************************/
	/*	if(s[0] < s[1]) {
			if(s[0] < s[2]) {
				if(s[0]< s[3]) {
					if(s[0]< s[4]) {
						min= s[0];
					}
				}
			} 
		}else if (s[1]<s[2]) {
			if(s[1]<s[3]) {
				if(s[1]<s[4]) {
					min= s[1];
				}
			}
		}else if(s[2]<s[3]) {
			if(s[2]<s[4]) {
				min=s[2];
			
			}
		}else if(s[3]<s[4]) {
			min=s[3];
		}else {
			min= s[4];
		}
		System.out.println("max="+max);
		System.out.println("min="+min);

	*/
		for(int i=1; i<s.length; i++) {
			if(max<s[i]) {
				max=s[i];
			}
			if(min>s[i]) {
				min=s[i];
				
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
	
	

}
