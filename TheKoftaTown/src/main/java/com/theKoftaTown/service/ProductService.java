package com.theKoftaTown.service;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import com.theKoftaTown.DTO.ProdctDetailsDTO;

public interface ProductService {
ProdctDetailsDTO addProduct(ProdctDetailsDTO productDetails);
void saveProductImg(Long ProductId, Blob productImg);
 List<ProdctDetailsDTO> findAllProduct() throws SQLException;
 
}
