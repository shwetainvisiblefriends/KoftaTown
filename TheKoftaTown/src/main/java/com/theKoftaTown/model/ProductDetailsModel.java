package com.theKoftaTown.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.sql.Blob;
@Entity
@Table(name="ProductDetailsMaster")
public class ProductDetailsModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" ,unique=true,nullable=false) 
    private Long id;
	@Column(name="user_id")
	private Long userId;
	@Column(name="product_name")
	private String productName;
	@Column(name="price")
	private double price;
	@Column(name="product_images")
	private Blob productImg;
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
	public Blob getProductImg() {
		return productImg;
	}
	public void setProductImg(Blob productImg) {
		this.productImg = productImg;
	}
}
