package demo11;

public class ListApp5 {

	public static void main(String[] args) {
		
		Thread1 runnable1 = new Thread1();
		
		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable1);
		Thread t3 = new Thread(runnable1);
		Thread t4 = new Thread(runnable1);
		Thread t5 = new Thread(runnable1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}