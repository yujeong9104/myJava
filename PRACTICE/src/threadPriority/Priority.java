package threadPriority;

public class Priority {

	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			System.out.println("스레드 실행!");
		});
		
		//우선순위는 1에서부터 10까지 부여
		//1이 가장 우선순위가 낮고, 10이 가장 높다
		//우선순위를 부여하지 않으면 모든 스레드들은 기본적으로 5의 우선순위를 할당받는다.
		thread.setPriority(1);
		
		//Thread 클래스의 상수
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.setPriority(Thread.NORM_PRIORITY);
		thread.setPriority(Thread.MIN_PRIORITY);

	}

}
