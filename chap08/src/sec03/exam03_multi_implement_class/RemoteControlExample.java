package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		//���߱�����ü�� �����Ѵ�
		SmartTelevision tv= new SmartTelevision();
		RemoteControl rc= tv;
		Searchable searchable = tv;
		
		tv.turnOn();
		tv.setVolume(6);
		tv.setMute(true);
		tv.turnOff();
		
		tv.search("www.asdf.asdasda");
	}

}
