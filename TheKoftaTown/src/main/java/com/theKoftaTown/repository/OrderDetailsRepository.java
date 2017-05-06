package com.theKoftaTown.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theKoftaTown.model.OrderDetailsModel;

public interface OrderDetailsRepository extends JpaRepository<OrderDetailsModel, Long>{
List<OrderDetailsModel> findByOrderStatus(int satus);
}
