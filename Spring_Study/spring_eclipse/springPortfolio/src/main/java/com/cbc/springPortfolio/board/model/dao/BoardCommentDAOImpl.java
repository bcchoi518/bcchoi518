package com.cbc.springPortfolio.board.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cbc.springPortfolio.board.model.dto.BoardCommentDTO;

@Repository
public class BoardCommentDAOImpl implements BoardCommentDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<BoardCommentDTO> getSelectAll(BoardCommentDTO paramDto) {
		return sqlSession.selectList("boardComment.getSelectAll", paramDto);
	}//getSelectAll

	@Override
	public BoardCommentDTO getSelectOne(BoardCommentDTO paramDto) {
		return sqlSession.selectOne("boardComment.getSelectOne", paramDto);
	}//getSelectOne

	@Override
	public int setInsert(BoardCommentDTO paramDto) {
		return sqlSession.insert("boardComment.setInsert", paramDto);
	}//setInsert

	@Override
	public int setUpdate(BoardCommentDTO paramDto) {
		return sqlSession.update("boardComment.setUpdate", paramDto);
	}//setUpdate

	@Override
	public int setDelete(BoardCommentDTO paramDto) {
		return sqlSession.delete("boardComment.setDelete", paramDto);
	}//setDelete
}//BoardCommentDAOImpl
