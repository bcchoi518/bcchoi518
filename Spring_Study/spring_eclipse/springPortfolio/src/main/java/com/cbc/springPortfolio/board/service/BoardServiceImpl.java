package com.cbc.springPortfolio.board.service;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cbc.springPortfolio.board.model.dao.BoardDAO;
import com.cbc.springPortfolio.board.model.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO boardDao;
	
	@Override
	public int getTotalRecord(BoardDTO paramDto) {
		return boardDao.getTotalRecord(paramDto);
	}//getTotalRecord

	@Override
	public int getMaxValue(String fieldName) {
		return boardDao.getMaxValue(fieldName);
	}//getMaxValue

	@Override
	public ArrayList<BoardDTO> getSelectAll(BoardDTO paramDto) {
		return boardDao.getSelectAll(paramDto);
	}//getSelectAll

	@Override
	public BoardDTO getSelectOne(BoardDTO paramDto) {
		return boardDao.getSelectOne(paramDto);
	}//getSelectOne

	@Override
	public int setInsert(BoardDTO paramDto) {
		return boardDao.setInsert(paramDto);
	}//setInsert

	@Override
	public int setUpdate(BoardDTO paramDto) {
		return boardDao.setUpdate(paramDto);
	}//setUpdate

	@Override
	public void setUpdateHit(BoardDTO paramDto) {
		boardDao.setUpdateHit(paramDto);
	}//setUpdateHit

	@Override
	public void setUpdateReLevel(BoardDTO paramDto) {
		boardDao.setUpdateReLevel(paramDto);
	}//setUpdateReLevel

	@Override
	public int setDelete(BoardDTO paramDto) {
		return boardDao.setDelete(paramDto);
	}//setDelete
}//BoardServiceImpl
