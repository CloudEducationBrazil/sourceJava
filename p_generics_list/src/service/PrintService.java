package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	List<T> list = new ArrayList<T>();
	
	public void addValue(T value) {
		list.add(value);
	};

	public T first() {
		if ( list.isEmpty() ) {
			throw new IllegalStateException("List is empty!!!");
		}
		
		return list.get(0);
	};

	public void print() {
		System.out.print("Elements: [");
		if ( !list.isEmpty() ) {
			System.out.print(list.get(0));
		}
		
		for (int x = 1; x < list.size(); x++) {
			System.out.print(", " + list.get(x));
		}
		System.out.println("]");
	};
}