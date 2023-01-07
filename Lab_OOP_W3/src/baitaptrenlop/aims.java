package baitaptrenlop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aims {
	private static List<DigitalVideoDisc> store;

	public static void main(String[] args) {
		Cart yourcart = new Cart();
		store = new ArrayList<>();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation", "Roger Allers", 87, 19.95f, "MI321");
		store.add(new DigitalVideoDisc("Star Wars", "Science Fiction", "87", 87, 24.95f, "IA213"));
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "87", 87, 24.95f, "MI353");
		store.add(new DigitalVideoDisc("Aladin", "Animation", "hoho", 34,19.95f, "MI432"));
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation","kaka", 32, 19.95f, "MI546");
		yourcart.addDigitalVideoDisc(dvd1);
		yourcart.addDigitalVideoDisc(dvd2);
		yourcart.addDigitalVideoDisc(dvd3);
		System.out.println("Total cost: " + yourcart.totalCost());
		yourcart.removeDigitalVideoDisc(store.get(1));
		
		DigitalVideoDisc [] hihi = new DigitalVideoDisc[] {dvd1, dvd2, dvd3};
		//System.out.println("Ban dau " + Arrays.toString(hihi));
		//ham sap xep
		Arrays.sort(hihi);
		System.out.println("sau sap xep: " + Arrays.toString(hihi));
		
		// ham tim kiem theo id
		System.out.println("Tim kiem dvd co id MI321: " + Arrays.binarySearch(hihi, dvd1.getId()));
		
		// ham tim kiem theo title
		
		System.out.println("Tim kiem dvd co title(Animation): " + Arrays.binarySearch(hihi, dvd3.getTitle()));
		

	}
}
