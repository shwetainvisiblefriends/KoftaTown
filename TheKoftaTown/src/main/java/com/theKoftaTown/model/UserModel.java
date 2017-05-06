package com.theKoftaTown.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LoginMaster")
public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" ,unique=true,nullable=false) 
    private Long id;
	@Column(name="user_id")
	private String useId;
	private String password;
	@Column(name="user_name")
	private String userName;
	@Column(name="contact_number")
	private int contactNumber;
	
	
	private String userType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUseId() {
		return useId;
	}

	public void setUseId(String useId) {
		this.useId = useId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
