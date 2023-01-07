package hust.soict.dsai.aims.media;

import java.util.Objects;

public class Track implements Playable {
	private String title;
	private int length;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void Track(String title, int length) {
		this.title = title;
		this.length = length;
	}

	public boolean checkTrack(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Track other = (Track) obj;
		return length == other.length && Objects.equals(title, other.title);
	}

	@Override
	public boolean equals(Object obj) {
		boolean a = false;
		if (obj instanceof Track) {
			Track objTrack = (Track) obj;
			if (objTrack.getTitle().equals(this.getTitle()) && objTrack.getLength() == this.getLength()) {
				a = true;
			}
		}
		return a;
	}

	@Override
	public void play() {
		if (this.getLength() > 0) {
			System.out.println("Playing track: " + this.getTitle());
			System.out.println("Track's length: " + this.getLength());
		}
	}

	public int compareTo(Track obj) {
		// CompactDisc cd = (CompactDisc) obj;
		String a = getTitle();
		String b = obj.getTitle();
		if (getTitle().equals(obj.getTitle())) {
			int c = getLength();
			int d = obj.getLength();
			return c - d;

		} else {
			int length1 = a.length();
			int length2 = b.length();
			if (length1 >= length2) {
				for (int i = 0; i < length1; i++) {
					if (a.charAt(i) != b.charAt(i)) {
						return a.charAt(i) - b.charAt(i);
					}
				}
			}
		}
		return 0;
	}

	public static void print_out_track(Track track) {
		System.out.format("%-30s%10s\n", track.getTitle(), track.getLength());
	}

	@Override
	public String string_play() {
		// TODO Auto-generated method stub
		return null;
	}
}
