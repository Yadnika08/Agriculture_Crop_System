package com.yadni8.orders.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OrderDetails")
public class Order {
	
	private String orderId;
	private List<Crop> crop;
	private String totalQuantity;
	private double totalCost;
	
	public Order() {
		super();
	}

	public Order(String orderId, List<Crop> crop, String totalQuantity, double totalCost) {
		super();
		this.orderId = orderId;
		this.crop = crop;
		this.totalQuantity = totalQuantity;
		this.totalCost = totalCost;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<Crop> getCrop() {
		return crop;
	}

	public void setCrop(List<Crop> crop) {
		this.crop = crop;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	
	
}


