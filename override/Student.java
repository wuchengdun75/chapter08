package override;

public class Student extends Person {
	private int id;
	private String score;
	public Student(String name, int age, int id, String score) {
		super(name, age);
		this.id = id;
		this.score = score;
	}
	
	public String say() {
		return super.say() + id + score;
		//注意： 先super，再组合子类的
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	
	

}
