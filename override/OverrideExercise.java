package override;

public class OverrideExercise {
	public static void main(String[] args) {
		Person jack = new Person("jack",10);
		System.out.println(jack.say());
		
		Student smith = new Student("smith", 20, 123, 80.5);
		System.out.println(smith.say());
	}

}
