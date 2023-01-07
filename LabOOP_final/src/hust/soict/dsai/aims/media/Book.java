package hust.soict.dsai.aims.media;

import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	public static final int MAX_AUTHORS = 100;
	private List<String> authors = new ArrayList<String>(MAX_AUTHORS);
	private int quantity;

	public Book() {
		super();
		quantity = 0;
		authors = new ArrayList<>(MAX_AUTHORS);
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Book(String title, String category, float cost, List<String> authors) {
		super();
		this.setId(getId());
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		if (quantity >= MAX_AUTHORS) {
			System.out.println("Full authors");
			return;
		} else {
			authors.add(authorName);
			quantity++;
			System.out.println("The authorName has added");
		}
		return;
	}

	public void removeAuthor(String authorName) {
		if (quantity == 0) {
			System.out.println("Have no author");
		}
		String name = authorName;
		if (authors.equals(name)) {
			authors.remove(name);
			System.out.println("Your author has been removed");
			return;
		}

		System.out.println("The author not found");
	}

	@Override
	public String toString() {
		return "Book [authors=" + authors + "," + " title=" + title + ", category=" + category + ", cost=" + cost + "]";
	}

}
