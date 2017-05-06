package com.theKoftaTown.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.theKoftaTown.DTO.SelectedItemDTO;

import javafx.scene.chart.PieChart.Data;
@Entity
@Table(name="OrderDetailsMaster")

public class OrderDetailsModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" ,unique=true,nullable=false) 
    private Long id;
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="order_date")
	private Date date;
	
	@Column(name="transaction_id")
	private String transactionId;
	@Column(name="payment_mode")
	private int paymentMode;
	private String deliveryAddress;
	private BigInteger contactNumber;
	@Column(name="order_status")
	private int orderStatus;
	@Column(name="payment_status")
	private int paymentStatus;
	@Column(name="user_name")
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@OneToMany(cascade=CascadeType.ALL )
	private List<SelectedItemModel> selectedItemModel;
	public Long getId() {
		return id;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public BigInteger getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(BigInteger contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	public List<SelectedItemModel> getSelectedItemModel() {
		return selectedItemModel;
	}
	public void setSelectedItemModel(List<SelectedItemModel> selectedItemModel) {
		this.selectedItemModel = selectedItemModel;
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
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	

}
