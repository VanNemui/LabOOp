package Aims;

public class Aims {
	public static void main (String [] args) {
			
			// Create a new cart
			Cart anOder = new Cart();
			
			// Create new dvd objects and add them to the cart
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
					"Animation", "Roger Allers", 87, 19.95f);
			anOder.addDigitalVideoDisc(dvd1);
			
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
					"George Lucas", 87, 24.95f);
			anOder.addDigitalVideoDisc(dvd2);
			
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
					"Animation", 18.99f);
			anOder.addDigitalVideoDisc(dvd3);
			
			//print total cost of the items in the cart
			System.out.println("Total Cost is: ");
			System.out.println(anOder.totalCost());
		}
}
