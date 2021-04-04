package sec02.exam04_default_method;

public interface RemoteControl {
	
	void turnOn();
	void turnOff();
	
	
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메소드 
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
}
