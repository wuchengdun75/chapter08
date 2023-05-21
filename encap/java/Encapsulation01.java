package encap.java;

public class Encapsulation01 {
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("韩顺平");
		person.setAge(30);
		person.setSalary(30000);
		System.out.println(person.info());
		System.out.println(person.getSalary());
		Person smith = new Person("smith", 80, 50000);
		System.out.println("=======smith的信息========");
		System.out.println(smith.info());
	}   
}
class Person {
	public String name;
	private int age;
	private double salary;
	public void say(int n, String name) {
		}
	public Person(String name, int age, double salary) {
		//this.name = name;
		//this.age = age;
		//this.salary = salary;
		setName(name);
		setAge(age);
		setSalary(salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 6) {
			this.name = name;
		}else {
			System.out.println("名字的长度要在2-6个字符之间 ，给默认名字");
			this.name = "无名人";
			
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 1 && age <= 120) {
			this.age = age;
		}else {
			System.out.println("你设置的年龄不对，需要在1-120岁，就给默认年龄");
			this.age = 18;
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 
	public String info() {
		return "name信息=" + name + "age信息="age + "salary信息=" + salary;
	}
}


