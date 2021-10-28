package com.yadni8.farmers.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="CropDetails" )
public class Crop {
	
	@Id
	private String id;
	private String cropname;
	private String price;
	private String quantity;
	private String category;
	
	
	
	public Crop(String id, String cropname, String price, String quantity, String category) {
	
		this.id = id;
		this.cropname = cropname;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		
		
	}
	
	public Crop() {
		
		this.id = "";
		this.cropname = "";
		this.price = "";
		this.quantity = "";
		this.category = "";
	
		
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCropname() {
		return cropname;
	}
	public void setCropname(String cropname) {
		this.cropname = cropname;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
