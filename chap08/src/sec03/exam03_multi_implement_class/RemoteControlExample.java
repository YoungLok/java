package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		//다중구현객체를 생성한다
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
