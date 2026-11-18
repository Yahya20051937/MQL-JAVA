package org.mql.java.reflection.models;

public class Technoogy {
	private int id;
	private String name;
	private int year;
	private String author;
	private String description;
	
	@Override
	public String toString() {
		return "Technoogy [id=" + id + ", name=" + name + ", year=" + year + ", author=" + author + ", description="
				+ description + "]";
	}

	public Technoogy() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Technoogy(int id, String name, int year, String author) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.author = author;
	}
}
