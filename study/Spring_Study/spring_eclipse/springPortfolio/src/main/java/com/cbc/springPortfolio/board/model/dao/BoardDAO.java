package com.cbc.springPortfolio.board.model.dao;

import java.util.List;

import com.cbc.springPortfolio.board.model.dto.BoardDTO;

public interface BoardDAO {
	public int getTotalRecord(BoardDTO paramDto);
	public int getMaxValue(BoardDTO paramDto);
	public List<BoardDTO> getSelectAll(BoardDTO paramDto);
	public BoardDTO getSelectOne(BoardDTO paramDto);
	public int setInsert(BoardDTO paramDto);
	public int setUpdate(BoardDTO paramDto);
	public void setUpdateHit(BoardDTO paramDto);
	public void setUpdateReLevel(BoardDTO paramDto);
	public int setDelete(BoardDTO paramDto);
}//BoardDAO
