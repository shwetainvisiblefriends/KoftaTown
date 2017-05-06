package com.theKoftaTown.service;

import com.theKoftaTown.DTO.UserDto;

public interface UserService {
UserDto saveUser(UserDto loginMasterDto);
UserDto logInUser(UserDto loginMasterDto);

}
