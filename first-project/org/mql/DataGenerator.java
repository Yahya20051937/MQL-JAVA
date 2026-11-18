package org.mql;

import java.util.List;

public class DataGenerator extends Thread {
	private List<Integer> data;
	private int count;
	
	public DataGenerator(List<Integer> data, int count) {
		this.data = data;
		this.count = count;
	}
	
	public void run() {
		for (int i = 0; i < count; i++) {
			data.add(
					(int) (Math.random() * 9000 + 1000)
			);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
;		}
	}
}
