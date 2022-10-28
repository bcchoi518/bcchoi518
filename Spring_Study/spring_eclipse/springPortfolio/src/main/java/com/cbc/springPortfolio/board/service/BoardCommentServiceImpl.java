package com.cbc.springPortfolio.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cbc.springPortfolio.board.model.dao.BoardCommentDAO;
import com.cbc.springPortfolio.board.model.dto.BoardCommentDTO;

@Service
public class BoardCommentServiceImpl implements BoardCommentService {

	@Inject
	private BoardCommentDAO boardCommentDao;
	
	@Override
	public List<BoardCommentDTO> getSelectAll(BoardCommentDTO paramDto) {
		return boardCommentDao.getSelectAll(paramDto);
	}//getSelectAll

	@Override
	public BoardCommentDTO getSelectOne(BoardCommentDTO paramDto) {
		return boardCommentDao.getSelectOne(paramDto);
	}//getSelectOne

	@Override
	public int setInsert(BoardCommentDTO paramDto) {
		return boardCommentDao.setInsert(paramDto);
	}//setInsert

	@Override
	public int setUpdate(BoardCommentDTO paramDto) {
		return boardCommentDao.setUpdate(paramDto);
	}//setUpdate

	@Override
	public int setDelete(BoardCommentDTO paramDto) {
		return boardCommentDao.setDelete(paramDto);
	}//setDelete
}//BoardCommentServiceImpl
