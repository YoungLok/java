package Verify;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단 title출력
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print("[ " + dan + "단 ]" + "\t");
		}
		
		System.out.println();
		
		// ...
		for (int num=1; num <=9; num++) {
			System.out.println("2*"+num+ "="+ num *2+"\t"+"3*"+num+ "="+ num *3+"\t"+"4*"+num+ "="+ num *4+"\t"+"5*"+num+ "="+ num *5+"\t"+"6*"+num+ "="+ num *6+"\t"+"7*"+num+ "="+ num *7+"\t"+"8*"+num+ "="+ num *8+"\t"+"9*"+num+ "="+ num *9+"\t");
		}//첫번째 시도 
		System.out.println();
		for (int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();// 두번째 시도
		}
	}

}
