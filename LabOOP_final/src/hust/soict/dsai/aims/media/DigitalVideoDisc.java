package hust.soict.dsai.aims.media;

import java.util.Objects;

public class DigitalVideoDisc extends Disc implements Playable {
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(String title, String category, String director, int length, float cost, int id) {
		super(length, director);
		this.setTitle(title);
		this.setCategory(category);
		this.director = director;
		this.length = length;
		this.setCost(cost);
		this.setId(getId());
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}

	public void DigitalVideoDisc() {

	}

	@Override
	public String toString() {
		return "DigitalVideoDisc " + title + ", category=" + category + ", director=" + director + ", length=" + length
				+ ", cost=" + cost + ".";
	}

	public boolean isMatch(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DigitalVideoDisc other = (DigitalVideoDisc) obj;
		return Objects.equals(title, other.title);
	}

	public static void print_out_disc(DigitalVideoDisc disc) {
		String s = String.format("%-10d%-30s%-20s%-20s%-10d%.2f", disc.getId(), disc.getTitle(), disc.getCategory(),
				disc.getDirector(), disc.getLength(), disc.getCost());
		System.out.println(s);
	}

	public boolean searchID(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DigitalVideoDisc other = (DigitalVideoDisc) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());

	}

	@Override
	public String string_play() {
		String s;
		s = "Playing DVD: " + this.getTitle() + "\n";
		s = s + "DVD length: " + this.getLength() + "\n";
		return s;
	}
}
