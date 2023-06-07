package innerclass;

public class MemberInnerClass01 {
	public static void main(String[] args) {
		Outer08 outer08 = new Outer08();
		outer08.t1();
		System.out.println("======");
		Outer08.Inner08 inner08 = outer08.new Inner08();
		inner08.say();
		System.out.println("=======");
		Outer08.Inner08 getinner08 = outer08.getInner08();
		getinner08.say();

	}

}


class Outer08 {//外部类08
	private int n1 = 10;
	public String name = "张三 ";
	
	private void hi() {
		System.out.println("hi()方法 ...");
	}
	
	public class Inner08 {//外部类08 的成员内部类
		private double sal = 99.9;
		private int n1 = 66;
		public void say() {
			System.out.println(n1 + name + "\n" + Outer08.this.n1 );
			hi();
		}
	}
	
	public Inner08 getInner08() {
		return new Inner08();
	}
	
	public void t1() {
		Inner08 inner08 = new Inner08();
		inner08.say();
		System.out.println(inner08.sal);
	}
}