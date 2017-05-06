package com.theKoftaTown.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.theKoftaTown.DTO.OrderDetailsDTO;
import com.theKoftaTown.DTO.SelectedItemDTO;
import com.theKoftaTown.model.OrderDetailsModel;
import com.theKoftaTown.model.SelectedItemModel;
import com.theKoftaTown.repository.OrderDetailsRepository;

@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {
@Inject
OrderDetailsRepository orderDetailsREpository;
	@Override
	public void save(OrderDetailsDTO orderDetailsDTO) {
		// TODO Auto-generated method stu
		
		OrderDetailsModel orderDetailsModel=new OrderDetailsModel();
		List<SelectedItemModel> list=new ArrayList<>();
		
		for(int i=0;i<orderDetailsDTO.getSelectedItem().size();i++){
			SelectedItemModel selectedItmModel=new SelectedItemModel();
			selectedItmModel.setProductId(orderDetailsDTO.getSelectedItem().get(i).getProductId());
			selectedItmModel.setQuantity(orderDetailsDTO.getSelectedItem().get(i).getQuantity());
			selectedItmModel.setTotalAmount(orderDetailsDTO.getSelectedItem().get(i).getTotalAmount());
			selectedItmModel.setProductName(orderDetailsDTO.getSelectedItem().get(i).getProductName());
			list.add(selectedItmModel);
			
			//orderDetailsModel.setSelectedItemDTO(orderDetailsDTO.getSelectedItem().get(i).getProductId());
		}
		
		orderDetailsModel.setSelectedItemModel(list);
		orderDetailsModel.setContactNumber(orderDetailsDTO.getContactNumber());
		orderDetailsModel.setDeliveryAddress(orderDetailsDTO.getDeliveryAddress());
		orderDetailsModel.setUserId(orderDetailsDTO.getUserId());
		orderDetailsModel.setOrderStatus(orderDetailsDTO.getOrderStatus());
		orderDetailsModel.setPaymentMode(orderDetailsDTO.getPaymentMode());
		orderDetailsModel.setPaymentStatus(orderDetailsDTO.getPaymentStatus());
		orderDetailsModel.setUserName(orderDetailsDTO.getUserName());
		orderDetailsModel=orderDetailsREpository.save(orderDetailsModel);
		
		//return null;
	}
	@Transactional
public List<OrderDetailsDTO>getAllNewOrder(int status){
	List<OrderDetailsDTO> orderDetailsDTOList=new ArrayList<>();
	
	List<OrderDetailsModel> orderDetailsModel=orderDetailsREpository.findByOrderStatus(status);
	for(int i=0; i<orderDetailsModel.size();i++){
		OrderDetailsDTO orderDetailsDTO=new OrderDetailsDTO();
		List<SelectedItemDTO>selectedItemDtoList=new ArrayList<>();
		for(int j=0;j<orderDetailsModel.get(i).getSelectedItemModel().size();j++){
			
			SelectedItemDTO selectedItemDTO= new SelectedItemDTO();
			selectedItemDTO.setProductName(orderDetailsModel.get(i).getSelectedItemModel().get(j).getProductName());
			selectedItemDTO.setQuantity(orderDetailsModel.get(i).getSelectedItemModel().get(j).getQuantity());
			selectedItemDTO.setTotalAmount(orderDetailsModel.get(i).getSelectedItemModel().get(j).getTotalAmount());
			selectedItemDtoList.add(selectedItemDTO);
		}
		
		orderDetailsDTO.setContactNumber(orderDetailsModel.get(i).getContactNumber());
		orderDetailsDTO.setDeliveryAddress(orderDetailsModel.get(i).getDeliveryAddress());
		orderDetailsDTO.setOrderStatus(orderDetailsModel.get(i).getOrderStatus());
		orderDetailsDTO.setPaymentMode(orderDetailsModel.get(i).getPaymentMode());
		orderDetailsDTO.setPaymentStatus(orderDetailsModel.get(i).getPaymentStatus());
		orderDetailsDTO.setSelectedItem(selectedItemDtoList);
		orderDetailsDTO.setUserId(orderDetailsModel.get(i).getUserId());
		orderDetailsDTO.setUserName(orderDetailsModel.get(i).getUserName());
		orderDetailsDTOList.add(orderDetailsDTO);
	}
	return orderDetailsDTOList;
	
}
}
