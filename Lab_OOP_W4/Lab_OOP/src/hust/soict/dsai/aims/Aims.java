package hust.soict.dsai.aims;

import java.util.ArrayList;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;

import java.util.List;

public class Aims {
	private static List<DigitalVideoDisc>store;
	
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		store = new ArrayList<>();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Hehe", "Animation", "Roger Allers", 87, 19.95f, 12);
		store.add(dvd1);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Haha", "Animation", "Roger Allers", 88, 14.95f, 13);
		store.add(dvd2);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Huhu", "Animation", "Roger Allers", 86, 12.95f, 14);
		store.add(dvd3);
		anOrder.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Hoho", "Animation", "Roger Allers", 80, 10.95f, 15);
		store.add(dvd4);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd1, dvd4);
		
		System.out.println(store.remove(dvd4));
		
		System.out.println("Total cost is: " + anOrder.totalCost());
		anOrder.removeDigitalVideoDisc(store.get(1));
		anOrder.removeDigitalVideoDisc(dvd4);
		
	}
}
