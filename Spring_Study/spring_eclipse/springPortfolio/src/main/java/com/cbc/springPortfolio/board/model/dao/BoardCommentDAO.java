package com.cbc.springPortfolio.board.model.dao;

import java.util.List;

import com.cbc.springPortfolio.board.model.dto.BoardCommentDTO;

public interface BoardCommentDAO {
	public List<BoardCommentDTO> getSelectAll(BoardCommentDTO paramDto);
	public BoardCommentDTO getSelectOne(BoardCommentDTO paramDto);
	public int setInsert(BoardCommentDTO paramDto);
	public int setUpdate(BoardCommentDTO paramDto);
	public int setDelete(BoardCommentDTO paramDto);
}//BoardCommentDAO
