package poly_;

public class Poly01 {
	public static void main(String[] args) {
		
		Master tom = new Master("汤姆");
		Dog dog = new Dog("狐狸");
		Bone bone = new Bone("排骨");
		tom.feed(dog, bone);
		System.out.println("=======");
		Cat cat = new Cat("小花猫");
		Fish fish = new Fish("小鱼");
		tom.feed(cat, fish);
		
		
		
		
		
		
		
		
		
	}

}
