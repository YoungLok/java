package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
	
	//key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap객체 생성
		//프로그램 = 자료구조 + 알고리즘
		// Map 자료 구조 = {key,value}
		HashMap<Key,String> hashMap = new HashMap<Key,String>();
		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
