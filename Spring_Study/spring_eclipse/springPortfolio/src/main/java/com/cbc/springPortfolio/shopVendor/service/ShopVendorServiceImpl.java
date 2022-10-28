package com.cbc.springPortfolio.shopVendor.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cbc.springPortfolio.shopVendor.model.dao.ShopVendorDAO;
import com.cbc.springPortfolio.shopVendor.model.dto.ShopVendorDTO;

@Service
public class ShopVendorServiceImpl implements ShopVendorService {

	@Inject
	private ShopVendorDAO shopVendorDao;
	
	@Override
	public List<ShopVendorDTO> getSelectAll(ShopVendorDTO paramDto) {
		return shopVendorDao.getSelectAll(paramDto);
	}//getSelectAll

	@Override
	public ShopVendorDTO getSelectOne(ShopVendorDTO paramDto) {
		return shopVendorDao.getSelectOne(paramDto);
	}//getSelectOne

	@Override
	public int getTotalRecord(ShopVendorDTO paramDto) {
		return shopVendorDao.getTotalRecord(paramDto);
	}//getTotalRecord

	@Override
	public int setInsert(ShopVendorDTO paramDto) {
		return shopVendorDao.setInsert(paramDto);
	}//setInsert

	@Override
	public int setUpdate(ShopVendorDTO paramDto) {
		return shopVendorDao.setUpdate(paramDto);
	}//setUpdate

	@Override
	public int setDelete(ShopVendorDTO paramDto) {
		return shopVendorDao.setDelete(paramDto);
	}//setDelete
}//ShopVendorServiceImpl
