package demo11;

import java.util.Vector;

public class Thread2 implements Runnable{

	Vector<Integer> list = new Vector<Integer>();
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			list.add(i);
		}
	}
}