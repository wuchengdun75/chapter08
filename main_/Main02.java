package main_;

public class Main02 {
	private static String name  = "韩顺平教育";
	private int a6 = 100;
	
	public static void hi() {
		System.out.println("Main方法中的 hi()方法 ");
	}
	
	public void cry() {
		System.out.println("Main方法中的cry()方法 ");
	}
	
	public static void main(String[] args) {
		System.out.println(name);
		hi();
		Main02 main02 = new Main02();
		System.out.println(main02.a6);
		main02.hi();
	    main02.cry();
		}
	
	}
