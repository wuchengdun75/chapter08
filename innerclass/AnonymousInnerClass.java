package innerclass;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Outer04 outer04 = new Outer04();
		outer04.method();
		
	}

}

class Outer04 {
	private int n1 = 10;
	public void method() {
		IA tiger = new IA {
			@Override
		    public void cry() {
			System.out.println("老虎叫唤。。。");
			System.out.println( "tiger的运行类型：" + tiger.getClass());
		}
			};
		
		Father father = new Father("jack"){
			public void test() {
				System.out.println("匿名内部类 重写了test（）方法 ");
			}
		}
		father.test();
		Animal animal = new Animal() {
			void eat() {
				System.out.println("小狗吃骨头 ");
			}
		}
		animal.eat();
		}
	
	
	}


interface IA {
	public void cry();
}

class Father {
	public Father(String name) {
		System.out.println("接收到的 name" + name);
	}
	public void test() {}
}

abstract class Animal {
	bastract void eat();
}






















