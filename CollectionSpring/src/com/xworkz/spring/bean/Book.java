package com.xworkz.spring.bean;

public class Book {
	private String name;
	private String author;
	private int price;

	public Book() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void setName(String name) {
		System.out.println("invoked setName");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAuthor(String author) {
		System.out.println("invoked setAuthor");
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPrice(int price) {
		System.out.println("invoked setPrice");
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}
}
