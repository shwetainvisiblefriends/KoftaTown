package com.theKoftaTown.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theKoftaTown.model.UserModel;
import java.lang.String;
import java.util.List;

public interface UserRepository extends JpaRepository<UserModel, Long> {
 UserModel findByUseId(String useid);
}
