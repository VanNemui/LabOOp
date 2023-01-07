package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.media.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import javax.naming.LimitExceededException;
import java.util.ArrayList;
import java.util.List;

public class CartTest {
	public static void main(String args[]) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion Princess", "Animation", "Roger Allers Son", 87, 24.95f,
				0);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion Dad", "Animation", "Roger Allers Dad", 87, 18.99f, 0);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar", "Action", "Cristiano Ronaldo", 99, 99.95f, 0);
		try {
			anOrder.addMedia(dvd2);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			anOrder.addMedia(dvd3);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			anOrder.addMedia(dvd5);
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total cost is " + anOrder.totalCost());
		anOrder.removeMedia(dvd2);
		System.out.println("Total cost is " + anOrder.totalCost());
		anOrder.printAll();
	}
}
