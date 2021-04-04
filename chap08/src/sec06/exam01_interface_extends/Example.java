package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl =new ImplementationC();
		
		InterfaceA ia =impl;
		ia.methodA();
		System.out.println();
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		InterfaceC ic= impl;
		ic.methodC();
		ic.methodA();
		ic.methodB();
	}

}
