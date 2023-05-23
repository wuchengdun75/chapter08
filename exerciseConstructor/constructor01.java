package exerciseConstructor;

public class constructor01 {
	public static void main(String[] args) {
		Person p1 = new Person("jack", 30);
		System.out.println(p1.age);
		System.out.println(p1.name);

	}
}

class Person {
	String name;
	int age;
	public Person(String n1, int n2) {
		System.out.println("构造器被调用");
		name = n1;
		age = n2;
	}
}