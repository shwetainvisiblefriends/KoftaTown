package com.theKoftaTown.DTO;

public class ProdctDetailsDTO {
	private Long id;
	private Long userId;
	private String productName;
	private double price;
	private byte[] productImg;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public byte[] getProductImg() {
		return productImg;
	}
	public void setProductImg(byte[] productImg) {
		this.productImg = productImg;
	}
	

}
