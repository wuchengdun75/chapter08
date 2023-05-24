package Super_;

public class B extends A {
	public int n1 = 888;
	
	public void test() {
		System.out.println(super.n1 +super.n2 + super.n3);
		super.cal();
	}
	public void hi() {
		System.out.println(super.n1 + super.n2 + super.n3);
	}
	public void cal() {
		System.out.println("子类B中 cal()方法被调用");
	}
	public void sum() {
		System.out.println("子类B中 sum（）方法被调用");
		this.cal();
		System.out.println(n1);
		System.out.println(this.n1);
		System.out.println(super.n1);
	}
	
	public void ok() {
		super.test100();
		super.test200();
		super.test300();
	}

	public B() {
		super("jack");
	}
}
