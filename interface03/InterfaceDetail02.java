package interface03;

public class InterfaceDetail02 {
	public static void main(String[] args) {
		System.out.println(IB.n1 );
	}

}

interface IB {
	int n1 = 10;//接口的属性 隐藏了 public abstract final
	void hi();
}
interface IC {
	void say();
	}

interface ID extends IB,IC {}
interface IE {}

class Pig implements IB,IC {
	@Override
	public void hi() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
}
















