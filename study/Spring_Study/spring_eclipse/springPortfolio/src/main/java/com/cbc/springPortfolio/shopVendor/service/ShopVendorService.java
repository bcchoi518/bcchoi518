package com.cbc.springPortfolio.shopVendor.service;

import java.util.List;

import com.cbc.springPortfolio.shopVendor.model.dto.ShopVendorDTO;

public interface ShopVendorService {
	public List<ShopVendorDTO> getSelectAll(ShopVendorDTO paramDto);
	public ShopVendorDTO getSelectOne(ShopVendorDTO paramDto);
	public int getTotalRecord(ShopVendorDTO paramDto);
	public int setInsert(ShopVendorDTO paramDto);
	public int setUpdate(ShopVendorDTO paramDto);
	public int setDelete(ShopVendorDTO paramDto);
}//ShopVendorService
