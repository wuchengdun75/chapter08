package interface_;

public class Interface01 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		Camera camera = new Camera();
		Computer computer66 = new Computer();
		computer66.work(phone);
		System.out.println("=======");
		computer66.work(camera);
	}
  
}
