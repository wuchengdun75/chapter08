package encap.java;

public class Account {
	private String name;
	private double balance;
	private String pwd;
	public Account() {
		//为什么要提供一个无参构造方法
	}
	public Account(String name, double balance, String pwd) {
		this.setName(name);
		this.setBalance(balance);
		this.setPwd(pwd);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 4) {
			this.name = name;
			}else {
				System.out.println("姓名不满足要求");
				this.name = "无名";
			}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance > 20) {
		this.balance = balance;
		}else {
			System.out.println("余额必须>20，默认为0");
		}
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		if(pwd.length() == 6) {
			this.pwd = pwd;
		}else {
			System.out.println("密码必须是六位数，给默认密码000000");
			this.pwd = "000000";
		}
		
	}
	
	public void showinfo() {
		System.out.println("显示账号信息名字余额密码===" + name);
		System.out.println("显示账号信息名字余额密码===" + balance);
		System.out.println("显示账号信息名字余额密码===" + pwd);
	}
}
