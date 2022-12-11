package threadFromThreadClass;

import java.awt.Toolkit;

public class CreateThread {

	public static void main(String[] args) {
		Runnable task = new Task();
		Thread thread = new Thread(task);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Thread annymThread = new Thread(new Runnable() {
			public void run() {
				//System.out.println("Runnable 익명 구현 객체로부터 나옴!");
				for (int i = 0; i < 5 ; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
			
		});
		
		Thread lambdaThread = new Thread(()->{
			//System.out.println("람다식으로부터 나옴!");
			for (int i = 0; i < 5 ; i++) {
				toolkit.beep();
				try {Thread.sleep(500);}catch(Exception e) {}
			}
		});
		
		thread.start();
		
		
		

	}

}
