package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	private int Sum;
	private int n;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public CompactDisc(int length, String director, String artist, List<Track> tracks) {
		super(length, director);
		this.artist = artist;
		this.tracks = tracks;
	}

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
		n = tracks.size();
		Sum = 0;

		for (int i = 0; i < n; i++) {
			Sum += this.getLength();
		}
		return Sum;
	}

	@Override
	public void play() {
		System.out.println(tracks.toString());
	}
}
