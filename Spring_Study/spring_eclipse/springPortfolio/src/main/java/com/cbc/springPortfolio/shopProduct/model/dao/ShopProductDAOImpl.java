package com.cbc.springPortfolio.shopProduct.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cbc.springPortfolio.shopProduct.model.dto.ShopProductDTO;

@Repository
public class ShopProductDAOImpl implements ShopProductDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<ShopProductDTO> getSelectAll(ShopProductDTO paramDto) {
		return sqlSession.selectList("shopProduct.getSelectAll", paramDto);
	}//getSelectAll

	@Override
	public ShopProductDTO getSelectOne(ShopProductDTO paramDto) {
		return sqlSession.selectOne("shopProduct.getSelectOne", paramDto);
	}//getSelectOne

	@Override
	public int getTotalRecord(ShopProductDTO paramDto) {
		return sqlSession.selectOne("shopProduct.getTotalRecord", paramDto);
	}//getTotalRecord

	@Override
	public int setInsert(ShopProductDTO paramDto) {
		return sqlSession.insert("shopProduct.setInsert", paramDto);
	}//setInsert

	@Override
	public int setUpdate(ShopProductDTO paramDto) {
		return sqlSession.update("shopProduct.setUpdate", paramDto);
	}//setUpdate

	@Override
	public int setDelete(ShopProductDTO paramDto) {
		return sqlSession.delete("shopProduct.setDelete", paramDto);
	}//setDelete
}//ProductDAOImpl
