package com.cbc.springPortfolio.shopVendor.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cbc.springPortfolio.shopVendor.model.dto.ShopVendorDTO;

@Repository
public class ShopVendorDAOImpl implements ShopVendorDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<ShopVendorDTO> getSelectAll(ShopVendorDTO paramDto) {
		return sqlSession.selectList("shopVendor.getSelectAll", paramDto);
	}//getSelectAll

	@Override
	public ShopVendorDTO getSelectOne(ShopVendorDTO paramDto) {
		return sqlSession.selectOne("shopVendor.getSelectOne", paramDto);
	}//getSelectOne

	@Override
	public int getTotalRecord(ShopVendorDTO paramDto) {
		return sqlSession.selectOne("shopVendor.getTotalRecord", paramDto);
	}//getTotalRecord

	@Override
	public int setInsert(ShopVendorDTO paramDto) {
		return sqlSession.insert("shopVendor.setInsert", paramDto);
	}//setInsert

	@Override
	public int setUpdate(ShopVendorDTO paramDto) {
		return sqlSession.update("shopVendor.setUpdate", paramDto);
	}//setUpdate

	@Override
	public int setDelete(ShopVendorDTO paramDto) {
		return sqlSession.delete("shopVendor.setDelete", paramDto);
	}//setDelete
}//ShopVendorDAOImpl
