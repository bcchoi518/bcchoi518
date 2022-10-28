package com.cbc.springPortfolio.boardChk.service;

import java.util.List;

import com.cbc.springPortfolio.boardChk.model.dto.BoardChkDTO;

public interface BoardChkService {
	public List<BoardChkDTO> getSelectAll(BoardChkDTO paramDto);
	public BoardChkDTO getSelectOne(BoardChkDTO paramDto);
	public int setInsert(BoardChkDTO paramDto);
	public int setUpdate(BoardChkDTO paramDto);
	public int setDelete(BoardChkDTO paramDto);
	public int getTotalRecord(BoardChkDTO paramDto);
}//BoardChkService
