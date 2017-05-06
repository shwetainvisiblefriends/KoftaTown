package com.theKoftaTown.DTO;

public class UserDto {
private Long id;
private String useId;
private String password;
private String userName;
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
