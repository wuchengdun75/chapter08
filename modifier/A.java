package com.modifier;

public class A {
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	public void m1 () {
		System.out.println("同类中可以访问四种访问控制修饰符  " +
	                        n1 + n2 + n3 + n4);
	}
	protected void m2 () {}
	void m3() {}
	private m4() {}
	public void hi() {
		System.out.println("bb");
		m1();
		m2();
		m3();
		//m4();
	}
		
	

}
