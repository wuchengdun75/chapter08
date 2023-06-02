package interface03;

public class InterfaceExercise02 {
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.px();
		new C1().px();
	}

}
interface A1 {
	int x = 0;
}
class B1 {
	int x = 1;
}
class C1 extends B1 implements A1 {
	public void px() {
		System.out.println(A1.x + "  " + super.x);
	}
	
}