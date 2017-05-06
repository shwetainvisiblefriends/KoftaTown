package com.theKoftaTown.repository;

import java.sql.Blob;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.theKoftaTown.model.ProductDetailsModel;

public interface ProductDetailsRepository extends JpaRepository<ProductDetailsModel, Long> {
	 @Modifying 
	   @Query("UPDATE ProductDetailsModel p SET p.productImg = :productImg WHERE p.id = :id")
	    int  saveProductImg(@Param("id") Long id, @Param("productImg") Blob productImg);

}
