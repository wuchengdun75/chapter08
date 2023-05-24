package extend_improve_;

public class Extends01 {
	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		pupil.name = "银角大王";
		pupil.age = 10;
	    pupil.testing();
	    pupil.setScore(60.5);
		pupil.showInfo();
		
		System.out.println("=========");
		
		Graduate graduate = new Graduate( );
		graduate.name = "金角大王";
		graduate.age = 25;
		graduate.testing();
		graduate.setScore(80);
		graduate.showInfo();
	}

}
