package innerclass;

public class LocalInnerclass {
	public static void main(String[] args) {
		Outer02 outer02 = new Outer02();
		outer02.m1();
	}

}

class Outer02 {
	private int n1 = 100;
	private void m2() {
		System.out.println("Outer02 m2()方法啊 ");
	}
	public void m1() {
		final class Inner02 {
			private int n1 = 8000;
			public void f1() {
				System.out.println("n1=" + n1 + "  外部类的n1=" 
			                        + Outer02.this.n1);
				m2();
			}
		}
		Inner02 inner02 = new Inner02();
		inner02.f1();
		
		
		
	}
}