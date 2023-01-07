package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private int qtyOrder;
	public static final int MAX = 20;
	public DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX];
	private List<Media> itemsIS = new ArrayList<Media>();

	public Store(DigitalVideoDisc[] itemsInStore) {
		this.itemsInStore = itemsInStore;
	}

	public Store() {
		qtyOrder = 0;
	}

	public DigitalVideoDisc[] getItemsInStore() {
		return itemsInStore;
	}

	public void setItemsInStore(DigitalVideoDisc[] itemsInStore) {
		this.itemsInStore = itemsInStore;
	}

	public static int getMax() {
		return MAX;
	}

	public void addDVD(DigitalVideoDisc dvd) {
		if (qtyOrder >= MAX) {
			System.out.println("Full order");
			return;
		} else {
			itemsInStore[qtyOrder] = dvd;
			qtyOrder++;
			System.out.println("The item has added");
		}
		return;
	}

	public void showDVD() {
		for (int i = 0; i < qtyOrder; i++) {
			System.out.println(itemsInStore[i]);
		}
	}

	public void removeDVD(DigitalVideoDisc dvd) {
		if (qtyOrder == 0) {
			System.out.println("Have no order");
			return;
		} else {
			int quantity = qtyOrder;
			for (int i = 0; i < quantity; i++) {
				DigitalVideoDisc hiDVD = itemsInStore[qtyOrder];
				boolean a = dvd.isMatch(hiDVD);
				if (a = true) {
					hiDVD = null;
					qtyOrder--;
					System.out.println("Your item has been removed");
					return;
				}
			}
		}

	}

	// Array List
	public void Store_2() {
		qtyOrder = 0;
		itemsIS = new ArrayList<Media>();
	}

	public void addMedia(Media media1) {
		boolean a = itemsIS.contains(media1);
		if (a) {
			return;
		} else {
			itemsIS.add(media1);
			System.out.println("the track has added");
		}
	}

	public void removeMedia(Media media1) {
		boolean a = itemsIS.contains(media1);
		if (a) {
			itemsIS.remove(media1);
			System.out.println("the track has removed");
		} else {
			return;
		}
	}

	public void print() {
		for (Media media : itemsInStore) {
			System.out.println(media);
		}
	}

	public Media find(String inputMedia) {
		for (Media media : itemsInStore) {
			if (media.getTitle().equals(inputMedia)) {
				return media;
			}
		}
		return null;
	}

	public int nbMediaInStore() {
		// TODO Auto-generated method stub
		return 0;
	}

}
