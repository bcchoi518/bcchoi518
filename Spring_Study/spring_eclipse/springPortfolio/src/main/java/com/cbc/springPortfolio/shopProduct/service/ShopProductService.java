package com.cbc.springPortfolio.shopProduct.service;

import java.util.List;

import com.cbc.springPortfolio.shopProduct.model.dto.ShopProductDTO;

public interface ShopProductService {
	public List<ShopProductDTO> getSelectAll(ShopProductDTO paramDto);
	public ShopProductDTO getSelectOne(ShopProductDTO paramDto);
	public int getTotalRecord(ShopProductDTO paramDto);
	public int setInsert(ShopProductDTO paramDto);
	public int setUpdate(ShopProductDTO paramDto);
	public int setDelete(ShopProductDTO paramDto);
}//ProductService
