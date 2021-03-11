package service;

import java.util.List;

public class CalculationService {
	public static <T extends Comparable<T>> T max(List<T> list) {
	// Ou public static <T extends Comparable<? super T>> T max(List<T> list)
		if ( list.isEmpty() ) {
			throw new IllegalStateException("List can't be empty!!!");
		}
		
		T maior = list.get(0);
		
		for (T item : list ) {
			if ( item.compareTo(maior) > 0) {
				maior = item;
			}
		}
		return maior;
	}
}