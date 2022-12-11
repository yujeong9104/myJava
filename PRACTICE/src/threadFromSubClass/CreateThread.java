package threadFromSubClass;

import java.awt.Toolkit;

public class CreateThread {

	public static void main(String[] args) {
		Thread thread = new WorkerThread();
		
		Thread annymThread = new Thread() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5 ; i++) {
					toolkit.beep();
					System.out.println("띵!");
					try {Thread.sleep(500);}catch(Exception e) {}		
				}
				
			}
		};
		
		//thread.start();
		//annymThread.start();
		
		//스레드의 이름
		thread.setName("myThread!");
		System.out.println(thread.getName());
		
		//현재 스레드 참조
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
		

	}

}
