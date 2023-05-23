package exerciseConstructor;

public class ConstructorDetail {
	
	public static void main(String[] args) {
		
		Person5 p1 = new Person5("king" , 40);
		System.out.println(p1.age + "\t" + p1.name);
		Person5 p2 = new Person5("tom");
		System.out.println(p2.age);//调属性去了。
		System.out.println(p2.name);

		Dog dog = new Dog();
	}
}

class Dog {
	//new Dog() 小括号去调用默认的无参构造器:Dog（）{}
	//所有，要显示（自己写出来）一下默认无参构造器
	public Dog(String dName) {
		
	}
	Dog() {}
}


class Person5 {
	String name;
	int age;
	public Person5(String pname, int page) {
		name = pname;
		age = page;
	}
	public Person5(String pname1) {
		name = pname1;
	}
	
	
	
	
}





