package baitaptrenlop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	public static final int MAX_NUMBER_ORDER = 20;
	private List<DigitalVideoDisc> itemsInStore;
	private int quantity;

	public Cart() {
		quantity = 0;
		itemsInStore = new ArrayList<>(MAX_NUMBER_ORDER);
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (quantity >= MAX_NUMBER_ORDER) {
			System.out.println("Full order");
			return;
		} else {
			quantity++;
			itemsInStore.add(disc);
			System.out.println("The item has added");
		}
		return;
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (quantity == 0) {
			System.out.println("Have no order");
		}
		String name = disc.getTitle();
		for (DigitalVideoDisc item : itemsInStore) {
			if (item.getTitle().equals(name)) {
				itemsInStore.remove(item);
				System.out.println("Your item has been removed");
				return;
			}
		}
		System.out.println("The item not found");
	}

	public float totalCost() {
		float sum = 0;
		for (DigitalVideoDisc item : itemsInStore) {
			sum += item.getCost();
		}
		return sum;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		return;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		return;
	}

	@Override
	public String toString() {
		return "Cart [itemsOrdered=" + itemsInStore + ", quantity=" + quantity + ", totalCost()=" + totalCost()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
