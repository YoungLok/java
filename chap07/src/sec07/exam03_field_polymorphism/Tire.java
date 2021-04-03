package sec07.exam03_field_polymorphism;

public class Tire {
	 public int maxRotation;
	 public int accumulatedRotation;
	 public String location;
	 
	 //생성자
	 public Tire(String location, int maxRotation) {
		 this.location = location;
		 this.maxRotation= maxRotation;
	
	 }
	 //메소드
	 public boolean roll() {
		 ++accumulatedRotation;
		 if(accumulatedRotation<maxRotation) {
			 System.out.println(location+"Tire수명:"+(maxRotation-accumulatedRotation)+"회");
			return true ;
		 }else {
			 System.out.println("***"+location+"타이어 펑크***");
			 return false;
		 }
	 }
}
