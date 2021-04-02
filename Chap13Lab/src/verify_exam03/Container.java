package verify_exam03;

public class Container <T,M>{
	private T  t;
	private M m;
	
	public T getKey() {
		return this.t;	
	}
	public M getValue() {
		return this.m;
	}
	public void set(T t, M m) {
		this.t = t;
		this.m = m;
	}
}
	
