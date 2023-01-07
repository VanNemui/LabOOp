package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.*;
import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		Store iStore = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Hehe", "Animation", "Roger Allers", 87, 19.95f, 123);
		iStore.addDVD(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Haha", "Animation", "Roger Allers", 88, 14.95f, 123);
		iStore.addDVD(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Huhu", "Animation", "Roger Allers", 86, 12.95f, 456);
		iStore.addDVD(dvd3);

		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Hoho", "Animation", "Roger Allers", 80, 10.95f, 678);
		iStore.addDVD(dvd4);

		iStore.showDVD();

		iStore.removeDVD(dvd2);
		iStore.showDVD();
	}
}
