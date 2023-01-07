package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.media.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class CartTest {
		private static List<DigitalVideoDisc>store;
		
		public static void main(String[] args) {
			Cart anOrder = new Cart();
			store = new ArrayList<>();
			
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("Hehe", "Animation", "Roger Allers", 87, 19.95f, 123);
			store.add(dvd1);
			anOrder.addDigitalVideoDisc(dvd1);
			
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Haha", "Animation", "Roger Allers", 88, 14.95f, 123);
			store.add(dvd2);
			anOrder.addDigitalVideoDisc(dvd2);
			
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Huhu", "Animation", "Roger Allers", 86, 12.95f, 456);
			store.add(dvd3);
			anOrder.addDigitalVideoDisc(dvd3);
			
			DigitalVideoDisc dvd4 = new DigitalVideoDisc("Hoho", "Animation", "Roger Allers", 80, 10.95f, 678);
			store.add(dvd4);
			anOrder.addDigitalVideoDisc(dvd4);
			anOrder.addDigitalVideoDisc(dvd1, dvd4);
			
			System.out.println(store.remove(dvd4));
			
			System.out.println("Total cost is: " + anOrder.totalCost());
			anOrder.removeDigitalVideoDisc(store.get(1));
			anOrder.removeDigitalVideoDisc(dvd4);
			
		}
}
