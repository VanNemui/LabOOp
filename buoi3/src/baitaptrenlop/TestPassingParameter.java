package baitaptrenlop;

public class TestPassingParameter {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jung Le", "ngon tinh","hihi" , 5, 1000000, null);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("CindereLla" ,"ngon tinh","haha" , 4, 9900000, null);
		//Swap(jungleDVD, cinderellaDVD);
		System.out.println("Result: ");
		MySwap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
		System.out.println("**************CART**************");
		System.out.println("1. " + cinderellaDVD.toString());
		System.out.println("2. " + jungleDVD.toString());
		System.out.println("Tong chi phi: " + (cinderellaDVD.getCost() + jungleDVD.getCost()) );
		System.out.println("********************************************************");
	}

	
	 public static void swap(Object o1, Object o2) { Object tmp = o1; o1 = o2; o2
	  = tmp; }
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

	public static void MySwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String temp = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(temp);
	}
	
	

}
