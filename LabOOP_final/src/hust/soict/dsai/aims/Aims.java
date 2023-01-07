package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.LimitExceededException;

public class Aims {
	private static StoreScreen storeScreen;

	public static void main(String[] args) {
		Store testStore = new Store();
		Cart testCart = new Cart();
		List<String> authorList = new ArrayList<>();
		authorList.add("Ming");
		Book book1 = new Book("Ming", "Love", 13f, authorList);
		Book book2 = new Book("Ngan", "Action", 12f, authorList);
		CompactDisc cd1 = new CompactDisc("Mission Imposible", 1);
		CompactDisc cd2 = new CompactDisc("Spider Man", 7);
		Track track1 = new Track();
		Track track2 = new Track();
		Track track3 = new Track();
		cd1.addTrack(track1);
		cd1.addTrack(track2);
		cd2.addTrack(track3);
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f, 0);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladin", "Animation", "Roger Allers", 100, 18.99f, 0);
		testStore.addMedia(dvd1);
		testStore.addMedia(dvd2);
		testStore.addMedia(cd1);
		testStore.addMedia(cd2);
		testStore.addMedia(book1);
		testStore.addMedia(book2);
		storeScreen = new StoreScreen(testStore, testCart);
	}
}
