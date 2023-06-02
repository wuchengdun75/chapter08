package static_;

public class ChildGame {
	//int count = 0;
	Child child = new Child("白骨精");
	child.join();
//	child.count++;
//	System.out.println("有 " + child.count + " 加入游戏。。。");

}
class Child {
	public String name;
	public static int count = 0;
	public Child(String name) {
		
		this.name = name;
	}
	public void join() {
		System.out.println(name + " 加入了游戏 ");
		
		
		
		
		
		
		
	}
}