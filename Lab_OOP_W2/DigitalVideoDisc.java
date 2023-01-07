package Aims;

public class DigitalVideoDisc {
	// cai dat thuoc tinh
	private String Title;
	private String Category;
	private String Director;
	private int Length;
	private float Cost;
	
	
	// Create accessors and mutators for the class DigitalVideoDisc
	// tao trinh truy cap va trinh dot bien cho lop
	public String getTitle() {
		return Title;
	}
	public String getCategory() {
		return Category;
	}
	public String getDirector() {
		return Director;
	}
	public int getLength() {
		return Length;
	}
	public float getCost() {
		return Cost;
	}
	
	
	public DigitalVideoDisc(String title) {
		super();
		Title = title;
	}
	
	public DigitalVideoDisc(String string, String string2, String string3, int i, float f) {
		// TODO Auto-generated constructor stub
	}
	public DigitalVideoDisc(String string, String string2, float f) {
		// TODO Auto-generated constructor stub
	}

	public class Cart {
		public static final int MAX_NUMBERS_ORDERED = 20;
		private DigitalVideoDisc itemsOrdered [] =
				new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		public void addDigitalVideoDisc(DigitalVideoDisc dvd1) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
}
