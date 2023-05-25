package poly_.objectpoly_;

public class PolyObject {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.cry();
		
		animal = new Dog();//为什么不写Animal 编译类型
		animal.cry();
	}

}
