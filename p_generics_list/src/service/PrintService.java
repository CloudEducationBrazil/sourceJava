package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Tipo> {
	
	List<Tipo> list = new ArrayList<Tipo>();
	
	public void addValue(Tipo value) {
		list.add(value);
	};

	public Tipo first() {
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