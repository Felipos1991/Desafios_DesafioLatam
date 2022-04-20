
package com.desafiolatam.models;

public class Book {

	private Integer id;
	private String author;
	private String country;
	private String imageLink;
	private String language;
	private String title;
	
	public Book() {
		super();
	}

	public Book(Integer id, String author, String country, String imageLink, String language, String title) {
		super();
		this.id = id;
		this.author = author;
		this.country = country;
		this.imageLink = imageLink;
		this.language = language;
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", country=" + country +","+ "\n imageLink=" + imageLink
				+","+ "\nlanguage=" + language + ", title=" + title + "] \n \n";
	}

}
