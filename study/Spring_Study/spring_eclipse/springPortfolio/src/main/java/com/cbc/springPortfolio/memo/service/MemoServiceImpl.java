package com.cbc.springPortfolio.memo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cbc.springPortfolio.memo.model.dao.MemoDAO;
import com.cbc.springPortfolio.memo.model.dto.MemoDTO;

@Service
public class MemoServiceImpl implements MemoService {

	@Inject
	private MemoDAO memoDao;
	
	@Override
	public List<MemoDTO> getSelectAll(MemoDTO paramDto) {
		return memoDao.getSelectAll(paramDto);
	}//getSelectAll

	@Override
	public MemoDTO getSelectOne(MemoDTO paramDto) {
		return memoDao.getSelectOne(paramDto);
	}//getSelectOne

	@Override
	public int setInsert(MemoDTO paramDto) {
		return memoDao.setInsert(paramDto);
	}//setInsert

	@Override
	public int setUpdate(MemoDTO paramDto) {
		return memoDao.setUpdate(paramDto);
	}//setUpdate

	@Override
	public int setDelete(MemoDTO paramDto) {
		return memoDao.setDelete(paramDto);
	}//setDelete

	@Override
	public int getTotalRecord(MemoDTO paramDto) {
		return memoDao.getTotalRecord(paramDto);
	}//getTotalRecord
}//MemoServiceImpl
