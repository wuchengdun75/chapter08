package poly_.polyparameter;

public class Employee {
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	//父类 get年薪方法
	public double getAnnual() {
		return 12 * salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
