package com.theKoftaTown.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.theKoftaTown.DTO.UserDto;
import com.theKoftaTown.Utils.PasswordEncrypt;
import com.theKoftaTown.service.UserService;
import com.theKoftaTown.Enum.ResponseKeyName;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(value = "/v1")
public class UserController  extends BaseRestController{
@Inject
 UserService userService;
	@RequestMapping(value = "/RegisterUser/", method = RequestMethod.POST)
	public ResponseEntity<Object> RegisterUser(@RequestBody UserDto createUser){
		System.out.println("Validate User"+createUser.getContactNumber());
		createUser.setPassword(PasswordEncrypt.hashPassword(createUser.getPassword()));
		createUser=userService.saveUser(createUser);
		return ResponseEntity.ok(createSuccessResponse(ResponseKeyName.CREATEUSER, createUser));
	}
	
	@RequestMapping(value="/loginUserUser/" ,method=RequestMethod.POST)
	public ResponseEntity<Object> loggedInUser( @RequestBody UserDto loginUser){
	loginUser=	userService.logInUser(loginUser);
	return ResponseEntity.ok(createSuccessResponse(ResponseKeyName.LOGGEDINUSER, loginUser));
	}
	
}
