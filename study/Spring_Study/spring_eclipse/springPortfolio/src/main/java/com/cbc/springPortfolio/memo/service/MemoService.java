package com.cbc.springPortfolio.memo.service;

import java.util.List;

import com.cbc.springPortfolio.memo.model.dto.MemoDTO;

public interface MemoService {
	public List<MemoDTO> getSelectAll(MemoDTO paramDto);
	public MemoDTO getSelectOne(MemoDTO paramDto);
	public int setInsert(MemoDTO paramDto);
	public int setUpdate(MemoDTO paramDto);
	public int setDelete(MemoDTO paramDto);
	public int getTotalRecord(MemoDTO paramDto);
}//MemoService
