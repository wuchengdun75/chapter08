package poly_.polyarr_;

public class PolyArray {
	public static void main(String[] args) {
		Person[] persons = new Person[5];
		persons[0] = new Person("jack", 20);
		persons[1] = new Person("mary", 18, 100 );
		persons[2] = new Person("smith", 19, 30.1 );
		persons[3] = new Person("scott", 30, 3000 );
		persons[4] = new Person("king", 50, 60000 );
		
		for(int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].say());
			if(persons[i] instanceof Student) {
				Student student = (Student)persons[i];
				student.study();
			}else if(persons[i] instanceof Teacher) {
				Teacher taecher = (Teacher)persons[i];
				teacher.teach();
				
			}else if(persons[i] instanceof Person) {
				
			}else {
				System.out.println("你的类型有误，请自己检查。");
			}
				
				
			}
			
			
				}
		
	}

}
