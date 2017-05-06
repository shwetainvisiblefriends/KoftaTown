package com.theKoftaTown.service;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.theKoftaTown.DTO.ProdctDetailsDTO;
import com.theKoftaTown.model.ProductDetailsModel;
import com.theKoftaTown.repository.ProductDetailsRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Inject
	ProductDetailsRepository productDetailsRepository;
	public ProdctDetailsDTO addProduct(ProdctDetailsDTO productDetails){
	ProductDetailsModel productDetailsModel=new ProductDetailsModel();
	BeanUtils.copyProperties(productDetails, productDetailsModel);
	productDetailsModel=productDetailsRepository.save(productDetailsModel);
	BeanUtils.copyProperties(productDetailsModel, productDetails);
		return productDetails;
	}
	public void saveProductImg(Long ProductId, Blob productImg){
		
		//Blob profileImg = new SerialBlob(productImg.getBytes());
		productDetailsRepository.saveProductImg(ProductId, productImg);
	}
	
	public List<ProdctDetailsDTO> findAllProduct() throws SQLException {
		// TODO Auto-generated method stub
	List<ProdctDetailsDTO> productDetailsDtoList=new ArrayList<>();
	
		List<ProductDetailsModel> productDetailsModelList=productDetailsRepository.findAll();
		for(int i=0;i<productDetailsModelList.size();i++){
			ProdctDetailsDTO productDetailsDto=new ProdctDetailsDTO();
			ProductDetailsModel productDetailsModel=productDetailsModelList.get(i);
			BeanUtils.copyProperties(productDetailsModel, productDetailsDto);
			if(productDetailsModel.getProductImg()!=null){
			Blob blob=productDetailsModel.getProductImg();
			int blobLength = (int) blob.length();
			productDetailsDto.setProductImg(blob.getBytes(1, blobLength));
			//blob=null;
			blob.free();
			}
			productDetailsDtoList.add(productDetailsDto);
		}
		return productDetailsDtoList;
	}
}
