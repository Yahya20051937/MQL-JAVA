package org.mql;

public class Reader extends Thread {
	private Buffer buffer;   // shared resource

	public Reader(String name, Buffer buffer) {
		super(name);
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		do {
			buffer.read();
		} while (true);
	}
	
	
}
