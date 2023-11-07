package com.jspiders.cardekho.entity;

public class Car {

	int id;
	String name;
	String Brand;
	double price;
	
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
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
	String	details=" "+getId()+" "+getBrand()+" "+getName()+" "+getPrice()+"\n";
		return details;
	}
	
	
}
