package extend_exercise;

public class PC extends Computer {
	private String brand;//品牌

	public PC(String cpu, int memory, int disk, String brand) {
		super(cpu, memory, disk);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void printInfo() {
		System.out.println("PC信息：");
		System.out.println(getInfo() + "\n" + " brand:" + brand);
		}
	
}
