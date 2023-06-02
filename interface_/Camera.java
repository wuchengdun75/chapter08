package interface_;

public class Camera implements UsbInterface {
	@Override
	public void start() {
		System.out.println("相機相機😊😊😂开始工作 ");
		
	}
	public void stop() {
		System.out.println("相机 停止 工作");
	}
		
}
