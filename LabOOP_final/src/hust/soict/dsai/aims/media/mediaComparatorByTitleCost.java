package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class mediaComparatorByTitleCost implements Comparator<Media> {
	@Override
	public int compare(Media b1, Media b2) {
		int tmp = 0;
		if (b1.getTitle().equals(b2.getTitle())) {
			if (b1.getCost() < b2.getCost()) {
				tmp = 1;
			}
			if (b1.getCost() > b2.getCost()) {
				tmp = -1;
			}
		} else {
			tmp = b1.getTitle().compareTo(b2.getTitle());
		}
		return tmp;
	}
}
