package com.modifier;

public class B {
	public void say() {
		A a = new A();
		System.out.println(a.n1 + a.n2 + a.n3  );
		a.m1();
		a.m2();
		a.m3();
		//a.m4();
	}

}
