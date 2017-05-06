package com.theKoftaTown.service;

import java.util.List;

import com.theKoftaTown.DTO.OrderDetailsDTO;

public interface PlaceOrderService {
 void save(OrderDetailsDTO orderDetailsDTO);
 List<OrderDetailsDTO> getAllNewOrder(int status);
}
