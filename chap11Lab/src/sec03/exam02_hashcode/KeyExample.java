package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
	
	//key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap��ü ����
		//���α׷� = �ڷᱸ�� + �˰���
		// Map �ڷ� ���� = {key,value}
		HashMap<Key,String> hashMap = new HashMap<Key,String>();
		hashMap.put(new Key(1), "ȫ�浿");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
