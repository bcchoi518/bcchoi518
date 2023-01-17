package com.cbc.springPortfolio.boardChk.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cbc.springPortfolio.boardChk.model.dao.BoardChkDAO;
import com.cbc.springPortfolio.boardChk.model.dto.BoardChkDTO;

@Service
public class BoardChkServiceImpl implements BoardChkService {
	
	@Inject
	private BoardChkDAO boardChkDao;
	
	@Override
	public List<BoardChkDTO> getSelectAll(BoardChkDTO paramDto) {
		return boardChkDao.getSelectAll(paramDto);
	}//getSelectAll

	@Override
	public BoardChkDTO getSelectOne(BoardChkDTO paramDto) {
		return boardChkDao.getSelectOne(paramDto);
	}//getSelectOne

	@Override
	public int setInsert(BoardChkDTO paramDto) {
		return boardChkDao.setInsert(paramDto);
	}//setInsert

	@Override
	public int setUpdate(BoardChkDTO paramDto) {
		return boardChkDao.setUpdate(paramDto);
	}//setUpdate

	@Override
	public int setDelete(BoardChkDTO paramDto) {
		return boardChkDao.setDelete(paramDto);
	}//setDelete

	@Override
	public int getTotalRecord(BoardChkDTO paramDto) {
		return boardChkDao.getTotalRecord(paramDto);
	}//getTotalRecord
}//BoardChkServiceImpl
