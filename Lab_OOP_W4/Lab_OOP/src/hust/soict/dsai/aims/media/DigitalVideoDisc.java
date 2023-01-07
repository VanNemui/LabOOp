package hust.soict.dsai.aims.media;

import java.util.Objects;

public class DigitalVideoDisc extends Disc implements Playable {
	public DigitalVideoDisc(String title, String category, String director, int length, float cost, int id) {
		super(length, director);
	}

	/*
	 * public void DigitalVideoDisc(String string, String string2, String string3,
	 * int i, float f, String string4) {
	 * 
	 * }
	 */

	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;

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
}
