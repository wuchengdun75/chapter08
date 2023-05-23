package exerciseConstructor;

public class ConstructorExercise {
	public static void main(String[] args) {
		Person2 p1 = new Person2();
		System.out.println(p1.name + "   " + p1.age);
		Person2 p2 = new Person2("jack", 50);
		System.out.println(p2.age + "  " + p2.name);
		
	}

}

class Person2 {
	String name;
	int age;
	
	//第一个是 无参构造器
	public Person2() {
		age = 18;
		}
	//第二个 有参数构造器
	public Person2(String pname, int page) {
		name = pname;
		age = age;
		}
}
