package verify;

import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		MemberInfo01[] m = new MemberInfo01[5];
		int i = 0;
		System.out.println();
		Scanner sc= new Scanner(System.in);
		for (int j = 0;j<m.length;j++) {
			System.out.println("이름을 입력하세요");
			String m[j]=sc.nextLine();
		}
		
		}
		}*/
	class MemberInfo01 {
		private String name;
		private int age;
		private String email;
		private String address;
		 // 아래에 코드를 입력하세요.
		public String getName() {
			return name;		
		}
		public void setName(String name) {
			this.name=name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			if(age<0) {
				this.age= age;
				return;			
			}	
		}
		public String getEmail() {
			return email;
		}
		public void  setEmail(String email) {
			this.email=email;
		}
		public String getAddress() {
			return address;		
		}
		public void setAddress(String address) {
			this.address = address;
		}
	}
	}
}

