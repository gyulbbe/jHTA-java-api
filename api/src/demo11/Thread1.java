package demo11;

import java.util.ArrayList;

public class Thread1 implements Runnable {

	ArrayList<Integer> list = new ArrayList<Integer>();
	
	@Override
	public void run() {
		
		
		for(int i = 0; i < 1000; i++) {
			list.add(i);
		}
	}
}