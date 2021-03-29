package sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

	}
	
	static class Student{
		int sno;
		String name;
		Student(int sno, String name){
			this.sno =sno;
			this.name= name;
			
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno,name);
		}
	}

}
