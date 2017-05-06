package com.theKoftaTown.DTO;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.chart.PieChart.Data;

public class OrderDetailsDTO {
private Long userId;

//private String paymentType;
//private Data date;
private int orderStatus;
private int paymentStatus;
private int paymentMode;
//private String transactionId;
private String deliveryAddress;
private BigInteger contactNumber;
private String userName;
private List<SelectedItemDTO> selectedItem= new ArrayList<>();

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

public List<SelectedItemDTO> getSelectedItem() {
	return selectedItem;
}

public void setSelectedItem(List<SelectedItemDTO> selectedItem) {
	this.selectedItem = selectedItem;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
/*public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}
public Data getDate() {
	return date;
}
public void setDate(Data date) {
	this.date = date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getTransactionId() {
	return transactionId;
}
public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}


*/
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
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}

}
