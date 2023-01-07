package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class mediaComparatorByCostTitle implements Comparator<Media> {
	public int compare(Media b1, Media b2) {
		if (b1.getCost() - b2.getCost() == 0) {
			return b1.getTitle().compareTo(b2.getTitle());
		} else {
			return -((int) b1.getCost() - (int) b2.getCost());
		}
	}
}
