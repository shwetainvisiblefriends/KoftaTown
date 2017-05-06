package com.theKoftaTown.Enum;

public enum UserType {
	//private String userTypeValue =null;

	USER_ADMIN("ADMIN"),
	USER_USER("USER");


	private String userTypeValue =null;
	UserType(final String UserTypeValue){
		userTypeValue=this.userTypeValue	;
	}
	public String getStringValue() {
		return userTypeValue; }

}
