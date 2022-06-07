package com.OrderService.terrapay.Entity;

public class OrderLine {
	private int Item;
	private double price;
	private int quantity;
	private int ETA;
	public int getItem() {
		return Item;
	}
	public void setItem(int item) {
		Item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getETA() {
		return ETA;
	}
	public void setETA(int eTA) {
		ETA = eTA;
	}
}
