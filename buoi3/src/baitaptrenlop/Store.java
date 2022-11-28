package baitaptrenlop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {
	private Array itemInStore[];
	public static final int MAX_NUMBER_ORDER = 20;

	private Store(Array[] itemInStore) {
		this.itemInStore = itemInStore;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (quantity >= MAX_NUMBER_ORDER) {
			System.out.println("Full order");
			return;
		} else {
			quantity++;
			itemsOrdered.add(disc);
			System.out.println("The item has added");
		}
		return;
	}

}
