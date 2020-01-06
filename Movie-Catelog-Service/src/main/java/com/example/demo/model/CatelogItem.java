package com.example.demo.model;

public class CatelogItem {

	private String name;
	private String description;
	private int rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "CatelogItem [name=" + name + ", description=" + description + ", rating=" + rating + "]";
	}

	public CatelogItem(String name, String desc, int rating) {
		this.name = name;
		this.description = desc;
		this.rating = rating;
	}

	public CatelogItem() {
		super();
		// TODO Auto-generated constructor stub
	}

}
