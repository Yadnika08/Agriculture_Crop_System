package com.yadni8.orders.model;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "cart")
public class Cart {
			
			private String cropname;
			private String price;
			private String quantity;
			private String category;
			private String quantityRequired;
			private String totalPrice;
			
			public Cart() {
				super();
				
			}
			
			

			public Cart( String cropname, String price, String quantity, String category, String quantityRequired,
					String totalPrice) {
				super();
				
				this.cropname = cropname;
				this.price = price;
				this.quantity = quantity;
				this.category = category;
				this.quantityRequired = quantityRequired;
				this.totalPrice = totalPrice;
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

			public String getQuantityRequired() {
				return quantityRequired;
			}

			public void setQuantityRequired(String quantityRequired) {
				this.quantityRequired = quantityRequired;
			}

			public String getTotalPrice() {
				return totalPrice;
			}

			public void setTotalPrice(String totalPrice) {
				this.totalPrice = totalPrice;
			}
	
	
	
}
