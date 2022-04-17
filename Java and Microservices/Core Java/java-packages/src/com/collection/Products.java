package com.collection;

public class Products {
	private int id;
	private String name;
	private double price;
	public Products(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	@Override
	public int hashCode() {
		return getId();
	}
	@Override
	public boolean equals(Object obj) {
		Products p = (Products)obj;
		return p.getId() == this.getId();
	}
	
}
