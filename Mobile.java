package org.krishna.advance.Lambda;



public class Mobile {
	private int id;
	private String brand;
	private double price;
	public Mobile (int id, String brand, double price) {
		super();
		this.id=id;
		this.brand=brand;
		this.price=price;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getBrand() {
		return brand;
		
	}
	public void setBrand() {
		this.brand=brand;
	}
	public double getPrice() {
		return price;
		}
	public void setPrice() {
		this.price=price;
		
}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
}