package interface03;

public class InterfacePolyPass {
	public static void main(String[] args) {
		IG ig = new Teacher();
		ig.hi();
		new Teacher().hi();
		IH ih = new Teacher();
	}

}
interface IH {
	void hi();
}
interface IG extends IH {}
class Teacher implements IG {
	@Override
	public void hi() {
		System.out.println("hi()");
		// TODO Auto-generated method stub
		
	}
}