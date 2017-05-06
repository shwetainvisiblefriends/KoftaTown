package com.theKoftaTown.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SelectedItem")
public class SelectedItemModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" ,unique=true,nullable=false) 
    private Long id;
	private Long productId;
	private Long quantity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	private double totalAmount;
	@Column(name="product_name")
	private String productName;
	/*@ManyToOne
	@JoinColumn(name="order_id")
	private OrderDetailsModel selectedItem;*/
	/*public OrderDetailsModel getSelectedItem() {
		return selectedItem;
	}
	public void setSelectedItem(OrderDetailsModel selectedItem) {
		this.selectedItem = selectedItem;
	}*/
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getQuantity() {
		return quantity;
	}	
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
