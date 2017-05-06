package com.theKoftaTown.service;

import javax.inject.Inject;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.theKoftaTown.DTO.UserDto;
import com.theKoftaTown.Utils.PasswordEncrypt;
import com.theKoftaTown.model.UserModel;
import com.theKoftaTown.repository.UserRepository;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Inject
	UserRepository userRepository;
	public UserDto saveUser(UserDto createUser){
	   UserModel loginModal=new UserModel();
	   BeanUtils.copyProperties(createUser, loginModal);
	   loginModal=userRepository.save(loginModal);
	  // loginModal.setPassword(null);
	   BeanUtils.copyProperties(loginModal, createUser);
	   createUser.setPassword(null);
	   return createUser;
	}
	@Override
	public UserDto logInUser(UserDto loginMasterDto) {
		UserModel userModel=userRepository.findByUseId(loginMasterDto.getUseId());
		if(userModel==null){
			System.out.println("Invalid User .First register into System");
		}
		if(PasswordEncrypt.checkPassword(loginMasterDto.getPassword(), userModel.getPassword())){
			BeanUtils.copyProperties(userModel, loginMasterDto);
			return loginMasterDto;
		}
		else{
			System.out.println("password is worng");
			
		}
		return null;
	}

}
