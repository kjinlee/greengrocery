package com.my.greegrocery.vegetable.model;

public class Vegetable {
	private String id;
	private String category;
	private String name;
	private String price;

	public Vegetable(String id, String category, String name, String price) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [id=" + id + ", category=" + category + ", name=" + name + ", price=" + price + "]";
	}

}
