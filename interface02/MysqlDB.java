package interface02;

public class MysqlDB implements DBInterface  {
	@Override
	public void connect() {
		System.out.println("连接 MySQL ");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println(" 关闭mysql ");
		
	}

}
