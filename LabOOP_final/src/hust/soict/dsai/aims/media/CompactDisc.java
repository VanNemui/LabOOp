package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CompactDisc extends Disc implements Playable {
	public CompactDisc(String title, float cost, String artist, ArrayList<javafx.scene.media.Track> tracks) {
		super(title, cost, artist, tracks);
		// TODO Auto-generated constructor stub
	}

	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	private int Sum = 0;

	public String getArtist() {
		return artist;
	}// d

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public CompactDisc(String title, String category, float cost, String artist, int length) {
		super(title, category, cost);
		this.artist = artist;
	}

	public CompactDisc(String title, String category, float cost, String artist) {
		super(title, category, cost);
		this.artist = artist;
	}

	public CompactDisc(String title, float cost) {
		super(title, cost);
	}

	public CompactDisc(String title, String category, float cost, int length, String director, String artist,
			ArrayList<Track> tracks) {
		super(title, category, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(String title, float cost, int length, String director, String artist, ArrayList<Track> tracks) {
		super(title, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;

	}

	public CompactDisc(String title, int length, String director, String artist, ArrayList<Track> tracks) {
		super(title, length, director);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(String title, String category, float cost, String artist, ArrayList<Track> tracks) {
		super(title, category, cost);
		this.artist = artist;
		this.tracks = tracks;
	}

	/*
	 * public CompactDisc(String string, String director, String getArtist(), String
	 * string2) { super(string, director); this.artist = getArtist(); this.tracks =
	 * string2; }
	 */

	public void addTrack(Track trackK) {
		boolean a = tracks.contains(trackK);
		if (a) {
			return;
		} else {
			tracks.add(trackK);
			System.out.println("the track has added");
		}
	}

	public void removeTrack(Track trackK) {
		boolean a = tracks.contains(trackK);
		if (a) {
			tracks.remove(trackK);
			System.out.println("the track has removed");
		} else {
			return;
		}
	}

	public int getLength() {
		tracks.size();
		Sum = 0;

		for (Track track : tracks) {
			Sum += this.getLength();
		}
		return Sum;
	}

	@Override
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		System.out.println("Tracks of this CD:");
		if (tracks.isEmpty()) {
			System.out.println("The CD is empty! Can not play the CD.");
		} else {
			/*
			 * for(Track track : tracks){ track.play(); }
			 */
		}
	}

	public String toString() {
		String s = String.format("%-10d%-30s%-20s%-10.2f%-20s%-10d", getId(), getTitle(), getCategory(), getCost(),
				getArtist(), getLength());
		System.out.println(s);
		return s;
	}

	public static void print_out_cd(CompactDisc cd) {
		String s = String.format("%-10d%-30s%-20s%-10.2f%-20s%-10d", cd.getId(), cd.getTitle(), cd.getCategory(),
				cd.getCost(), cd.getArtist(), cd.getLength());
		System.out.println(s);
		System.out.println("                  Track List:");
		System.out.format("                  %-30s%10s\n", "Title", "Length");
		for (int i = 0; i < cd.getTracks().size(); i++) {
			System.out.print("                  ");
			Track.print_out_track(cd.getTracks().get(i));
		}
	}

	public static void print_cd_short(CompactDisc cd) {
		System.out.println("Playing CD: " + cd.getTitle());
		System.out.println("CD length: " + cd.getLength());
	}

	@Override
	public String string_play() {
		// TODO Auto-generated method stub
		return null;
	}
}
