package innerclass;

public class AnonymousInnerClassDetail {

	public static void main(String[] args) {
		
		Outer05 outer05 = new Outer05();
        outer05.f1();
	}
}

class outer05 {
	private int n1 = 99;
	public void f1() {
		Person p = new Person() {
			private int n1 = 88;
			@Override
			public void hi() {
				System.out.println("匿名内部类重写了hi方法" + n1);
				System.out.println("外部类的n1 " + Outer05.this.n1);
			}
		};
		p.hi();
	}
}

class Person {
	public void hi() {
		System.out.println("Person hi（）方法啊 ");
	}
	public void ok(String str) {
		System.out.println("Person ok()方法 " + str);
	}
}