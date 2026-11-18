package org.mql;

import java.util.Vector;

public class Buffer {

	public Buffer() {
		super();
	}
	
	
	 synchronized public void read() {
		System.out.println("> start read() by" + Thread.currentThread().getName());
		pause(100);
		System.out.println("> end read() by"  + Thread.currentThread().getName());
	}
	
	synchronized public void write() {
		System.out.println("> start write() by " + Thread.currentThread().getName());
		pause(100);
		System.out.println("> end write() by" + Thread.currentThread().getName());
	}
	
	 private void pause(int i) {
		try {
			Thread.sleep(i);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}



}
