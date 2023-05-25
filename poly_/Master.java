package poly_;

public class Master {
	private String name;

	public Master(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void feed(Animal animal,Food food) { //animal和food 指向接受Animal和Food的子类对象
		System.out.println("主人" + name + " 给 " 
	        + animal.getName() + " 吃 " + food.getName() );
	}

}
