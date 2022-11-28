package baitaptrenlop;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc = 0;
	private String id;

	

	public DigitalVideoDisc(String title, String category, String director, int length, float cost, String id) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = id;
	}
	


	public DigitalVideoDisc(String oldTitle) {
		// TODO Auto-generated constructor stub
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
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



	public float getCost() {
		return cost;
	}



	public void setCost(float cost) {
		this.cost = cost;
	}



	public static int getNbDigitalVideoDisc() {
		return nbDigitalVideoDisc;
	}



	public static void setNbDigitalVideoDisc(int nbDigitalVideoDisc) {
		DigitalVideoDisc.nbDigitalVideoDisc = nbDigitalVideoDisc;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "DVD " + this.title + " - " + this.category + " - " + this.director + " - "
				+ this.length + ": " + this.cost + "$";
	}


	
}
