package innerclass;

public class StaticInnerClass01 {
	public static void main(String[] args) {
		Outer10 outer10 = new Outer10();
		outer10.m1();
		
		Outer10.Inner10 inner10 = new Outer10.Inner10();
		inner10.say();
	}

}

class Outer10 {
	private int n1 = 10;
	private static String name = "张三 ";
	private static void cry() {
		System.out.println("======");
	}
	
	static class Inner10 {
		private static String name = "韩顺平教育 ";
		public void say() {
			System.out.println(name + "\t" + Outer10.name);
			cry();
		}
	}
	
	public void m1() {
		Inner10 inner10 = new Inner10();
		inner10.say();
	}
	public Inner10 getInner10() {
		return new Inner10();
	}
	public static Inner10 getInner10_() {
		return new Inner10();
	}
}
