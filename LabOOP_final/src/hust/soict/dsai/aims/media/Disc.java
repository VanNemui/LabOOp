package hust.soict.dsai.aims.media;

import java.util.ArrayList;

import javafx.scene.media.Track;

public class Disc extends Media {
	private int length;
	private String director;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Disc(int string, String director) {
		super();
		this.length = string;
		this.director = director;
	}

	public Disc(String title, String category, float cost) {
		super();
		this.setCategory(category);
		this.setCost(cost);
		this.setTitle(title);
		this.setId(getId());
		this.length = length;
		this.director = director;
	}

	public Disc(String title, float cost, String artist, ArrayList<Track> tracks) {
		// TODO Auto-generated constructor stub
	}

	public Disc(String title, float cost) {
		// TODO Auto-generated constructor stub
	}

	public Disc(String title, String category, float cost, int length2, String director2) {
		// TODO Auto-generated constructor stub
	}

	public Disc(String title, float cost, int length2, String director2) {
		// TODO Auto-generated constructor stub
	}

	public Disc(String title, int length2, String director2) {
		// TODO Auto-generated constructor stub
	}

}
