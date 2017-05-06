package com.theKoftaTown.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.theKoftaTown.DTO.OrderDetailsDTO;
import com.theKoftaTown.Enum.ResponseKeyName;
import com.theKoftaTown.service.PlaceOrderService;

@RestController
@RequestMapping(value="/v1")
public class OrderDetailsController extends BaseRestController {
	@Inject
	PlaceOrderService placeOrderService;
	@RequestMapping(value = "/order/", method = RequestMethod.POST)
	public ResponseEntity<Void> placeOrder(@RequestBody OrderDetailsDTO orderDetailsDto){
		System.out.println(orderDetailsDto.getSelectedItem().get(0).getTotalAmount());
		placeOrderService.save(orderDetailsDto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
		
		
	}
	@RequestMapping(value="/getAllNewOrder",method=RequestMethod.GET)
public ResponseEntity<Object>getAllNewOrder(@RequestParam(value = "status", required = true) int status){
		List<OrderDetailsDTO> orderDetailsDto=placeOrderService.getAllNewOrder(status);
		return ResponseEntity.ok(createSuccessResponse(ResponseKeyName.GETALLNEWORDER,orderDetailsDto));
	
}
}
