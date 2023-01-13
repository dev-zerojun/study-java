package threadTask;

public class ThreadTest {
	public static void main(String[] args) {

//	동석이네 동물원에는 3마리의 동물이 있다
//	각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//	나머지 1마리 동물은 2마리 동물이 모두 울고 나서 마지막에 운다.

//		Runnable runnable = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println(Thread.currentThread().getName());
//				try {Thread.sleep(500);} catch (InterruptedException e){;}
//			}
//		};
		
		// ThreadSet에 run 메소드를 재정의 했고, run은 Runnalbe 인터페이스를 상속 받았을 때 
		// 사용할 수 있는 메소드 이기에 ThreadSet은 Runnable 타입으로 upcasting이 가능하고
		// upcasting된 메소드는 Thread에서 Runnable을 받을 수 있기 때문에 스레드로도 runnable 타입 지정사용이 가능하다
		ThreadSet threadSet = new ThreadSet();

		Thread tiger = new Thread(threadSet, "크앙");
		Thread lion = new Thread(threadSet, "어흥");
		Thread ruster = new Thread(threadSet, "꼬끼오");
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ruster.getName());
		}
		
		tiger.start();
		try {tiger.join();} catch (InterruptedException e) {;}
		lion.start();
		

//	package명은 threadTask으로 만들고 클래스는 2개만 선언한다.
//	하나의 클래스에는 main 쓰레드가 있다.
//	Runnable 인터페이스로 멀티 쓰레드를 구현하고 반드시 join()을 사용한다.
//	※ 각 동물은 10번씩만 운다.

//	- 주석을 작성하였는가
//	- Thread의 name필드를 사용할 수 있는가
//	- 배열을 사용하였는가
//	- 클래스를 두 개 선언하였는가
//	- 가산점 : 람다식을 사용하였는가, main 쓰레드를 사용하였는가

	}

}
