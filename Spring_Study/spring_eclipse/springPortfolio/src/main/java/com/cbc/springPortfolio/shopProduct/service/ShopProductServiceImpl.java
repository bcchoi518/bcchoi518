package com.cbc.springPortfolio.shopProduct.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cbc.springPortfolio.shopProduct.model.dao.ShopProductDAO;
import com.cbc.springPortfolio.shopProduct.model.dto.ShopProductDTO;

@Service
public class ShopProductServiceImpl implements ShopProductService {

	@Inject
	private ShopProductDAO shopProductDao;
	
	@Override
	public List<ShopProductDTO> getSelectAll(ShopProductDTO paramDto) {
		return shopProductDao.getSelectAll(paramDto);
	}//getSelectAll

	@Override
	public ShopProductDTO getSelectOne(ShopProductDTO paramDto) {
		return shopProductDao.getSelectOne(paramDto);
	}//getSelectOne

	@Override
	public int getTotalRecord(ShopProductDTO paramDto) {
		return shopProductDao.getTotalRecord(paramDto);
	}//getTotalRecord

	@Override
	public int setInsert(ShopProductDTO paramDto) {
		return shopProductDao.setInsert(paramDto);
	}//setInsert

	@Override
	public int setUpdate(ShopProductDTO paramDto) {
		return shopProductDao.setUpdate(paramDto);
	}//setUpdate

	@Override
	public int setDelete(ShopProductDTO paramDto) {
		return shopProductDao.setDelete(paramDto);
	}//setDelete
}//ProductServiceImpl
