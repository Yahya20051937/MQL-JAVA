package org.mql;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListsTests {
	private int count;
	private List<String> data;
	
	
	

	public ListsTests(int count) {
		this.count = count;
	}

	void testLinkedList() {
		data = new LinkedList<>();
		for (int i = 0; i < count; i++) {
			data.add(0, "*");
		}
		data = new LinkedList<String>();			
		
	}

	void testVector() {
		data = new Vector<>();
		for (int i = 0; i < count; i++) {
			data.add(0, "*");
		}
	}

	void testArrayList() {
		data = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			data.add(0, "*");
		}
	}

}
