package com.cbc.springPortfolio.shopVendor.model.dao;

import java.util.List;

import com.cbc.springPortfolio.shopVendor.model.dto.ShopVendorDTO;

public interface ShopVendorDAO {
	public List<ShopVendorDTO> getSelectAll(ShopVendorDTO paramDto);
	public ShopVendorDTO getSelectOne(ShopVendorDTO paramDto);
	public int getTotalRecord(ShopVendorDTO paramDto);
	public int setInsert(ShopVendorDTO paramDto);
	public int setUpdate(ShopVendorDTO paramDto);
	public int setDelete(ShopVendorDTO paramDto);
}//ShopVendorDAO
