package innerclass;

public class InnerClass01 {
	public static void main(String[] args) {
		Outer0 outer = new Outer0(6);
		outer.m12();
	}

}

class Outer0 {
	private int n1 = 100;
	public Outer0(int n1 ) {
		this.n1 = n1;
	}
	public void m12() {
		System.out.println("m1()方法啊 " + n1);
	}
	{System.out.println("代码块 啊");}
	class Inner {}
	
	
	
	
	
}
