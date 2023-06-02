package interface02;

public class OracleDB implements DBInterface {
	public void connect() {
		
		System.out.println("连接 oracle ");

	}
	
	public void close() {
		
		System.out.println("关闭 oracle ");

	}

}
