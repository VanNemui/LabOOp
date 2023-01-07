package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import hust.soict.dsai.aims.disc.*;

import java.util.List;

public class Cart {
	public static final int MAX_NUMBER_ORDER = 20;
	private List<Media> itemsOrdered = new ArrayList<Media>();
	private int quantity;
	private float Sum;
	private int n;

	public Cart() {
		Sum = 0;
		quantity = 0;
		itemsOrdered = new ArrayList<Media>();
	}

	public void addMedia(Media media1) {
		boolean a = itemsOrdered.contains(media1);
		if (a) {
			return;
		} else {
			itemsOrdered.add(media1);
			System.out.println("the track has added");
		}
	}

	public void removeMedia(Media media1) {
		boolean a = itemsOrdered.contains(media1);
		if (a) {
			itemsOrdered.remove(media1);
			System.out.println("the track has removed");
		} else {
			return;
		}
	}

	public void totalCost() {
		n = itemsOrdered.size();
		for (int i = 0; i < n; i++) {
			Sum += itemsOrdered.get(i).getCost();
		}
	}
	/*
	 * public void addDigitalVideoDisc(DigitalVideoDisc disc) { if (quantity >=
	 * MAX_NUMBER_ORDER) { System.out.println("Full order"); return; } else {
	 * quantity++; itemsOrdered.add(disc); System.out.println("The item has added");
	 * } return; }
	 * 
	 * public void removeDigitalVideoDisc(DigitalVideoDisc disc) { if (quantity ==
	 * 0) { System.out.println("Have no order"); } String name = disc.getTitle();
	 * for (DigitalVideoDisc item : itemsOrdered) { if
	 * (item.getTitle().equals(name)) { itemsOrdered.remove(item);
	 * System.out.println("Your item has been removed"); return; } }
	 * System.out.println("The item not found"); }
	 * 
	 * public float totalCost() { float sum = 0; for (DigitalVideoDisc item :
	 * itemsOrdered) { sum += item.getCost(); } return sum; }
	 * 
	 * public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) { return; }
	 * 
	 * public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
	 * { if (quantity >= MAX_NUMBER_ORDER) { System.out.println("Full order");
	 * return; } else { quantity++; itemsOrdered.add(dvd1); itemsOrdered.add(dvd2);
	 * System.out.println("The item has added"); } return; }
	 */

	/*
	 * public void searchTitle(String Title) { if(itemsInStore.== true) {
	 * System.out.println("Found dvd"); System.out.println(jungleDVD.toString()); }
	 * else System.out.println("Not found dvd");
	 */

}
