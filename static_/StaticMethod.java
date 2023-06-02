package static_;

public class StaticMethod {
	public static void main(String[] args) {
		Stu tom = new Stu("tom");
		Stu.payFee(100);
		Stu mary = new Stu("mary");
		Stu.payFee(200);
		Stu.showFee();
	}
	

}

class MyTools {
	public static double camSum(double n1, double n2) {
		return n1 + n2;
	}
}

class Stu {
	private String name;
	private static double fee = 0;
	public Stu(String name) {
		this.name = name;
	}
	
	public static void payFee(double fee) {
		Stu.fee += fee;
	}
	public static void showFee() {
		System.out.println("总共的学费： " + Stu.fee);
	}
}















