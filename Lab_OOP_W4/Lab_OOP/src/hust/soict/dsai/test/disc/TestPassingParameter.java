package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jung Le", "Animation","hihi" , 5, 1000000,343);
				DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("CindereLla" ,"Animation","haha" , 4, 9900000, 646);
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
				
				if(jungleDVD.isMatch(jungleDVD)== true) {
					System.out.println("Found dvd");
					System.out.println(jungleDVD.toString());
				}
				else System.out.println("Not found dvd");
				
	}
	

			
			 public static void swap(Object o1, Object o2) { Object tmp = o1; o1 = o2; o2
			  = tmp; }
			
			public static void changeTitle(DigitalVideoDisc dvd, String title) {
				String oldTitle = dvd.getTitle();
				dvd.setTitle(title);
				dvd = new DigitalVideoDisc(oldTitle, dvd.getCategory(), dvd.getDirector(), dvd.getLength(), dvd.getCost(), dvd.getId());
			}

			public static void MySwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
				String temp = dvd1.getTitle();
				dvd1.setTitle(dvd2.getTitle());
				dvd2.setTitle(temp);
			}
			
			
}
