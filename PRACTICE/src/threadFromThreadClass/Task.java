package threadFromThreadClass;

import java.awt.Toolkit;

public class Task implements Runnable {
	
	public void run() {
		//System.out.println("Runnable 구현 클래스로부터 나옴!");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5 ; i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		
	}
	

}
