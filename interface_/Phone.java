package interface_;

public class Phone implements UsbInterface  {
	
	public void start() {
		
		System.out.println("手机 开始 工作");
	}
	
	
	public void stop() {
		
	    System.out.println(" 手机 停止 工作");	
	}

}
