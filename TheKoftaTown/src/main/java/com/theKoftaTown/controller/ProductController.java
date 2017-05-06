package com.theKoftaTown.controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.theKoftaTown.DTO.ProdctDetailsDTO;
import com.theKoftaTown.Enum.ResponseKeyName;
import com.theKoftaTown.repository.ProductDetailsRepository;
import com.theKoftaTown.service.ProductService;
@RestController
@RequestMapping(value="/v1")
public class ProductController extends BaseRestController {
	@Inject
	ProductService productService;
@RequestMapping(value="/uplodeProdutImg/" ,method = RequestMethod.POST)
public ResponseEntity<Void>uploadeImg(@RequestParam(value = "productId") Long id ,@RequestParam(value = "file")MultipartFile multipartRequest ) throws SerialException, SQLException, IOException
{
	System.out.println("multipartRequest====="+multipartRequest);
	//System.out.println("product Details ==="+producDetails);
	Blob productImg = new SerialBlob(multipartRequest.getBytes());
	productService.saveProductImg(id, productImg);
	 return new ResponseEntity<Void>(HttpStatus.CREATED);
}

@RequestMapping(value="/addProduct/" ,method = RequestMethod.POST)
public ResponseEntity<Object>addProduct(@RequestBody ProdctDetailsDTO productDetailsDto )
{
	//System.out.println("multipartRequest====="+multipartRequest);
	System.out.println("product Details ==="+productDetailsDto);
	
	productDetailsDto=productService.addProduct(productDetailsDto);
	return ResponseEntity.ok(createSuccessResponse(ResponseKeyName.ADDPRODUCT, productDetailsDto));
	
	
	
}
@RequestMapping(value="/getAllProduct/" ,method =RequestMethod.GET)
public ResponseEntity<Object>getAllProduct() throws SQLException{
	
	List<ProdctDetailsDTO> prodctDetailDtoList=productService.findAllProduct();
	return ResponseEntity.ok(createSuccessResponse(ResponseKeyName.GETALLPRODUCT, prodctDetailDtoList));
	
}
}
