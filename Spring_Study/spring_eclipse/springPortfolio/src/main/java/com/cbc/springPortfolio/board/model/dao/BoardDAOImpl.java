package com.cbc.springPortfolio.board.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cbc.springPortfolio.board.model.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public int getTotalRecord(BoardDTO paramDto) {
		return sqlSession.selectOne("board.getTotalRecord", paramDto);
	}//getTotalRecord

	@Override
	public int getMaxValue(String fieldName) {
		return sqlSession.selectOne("board.getMaxValue", fieldName);
	}//getMaxValue

	@Override
	public List<BoardDTO> getSelectAll(BoardDTO paramDto) {
		return sqlSession.selectList("board.getSelectAll", paramDto);
	}//getSelectAll

	@Override
	public BoardDTO getSelectOne(BoardDTO paramDto) {
		return sqlSession.selectOne("board.getSelectOne", paramDto);
	}//getSelectOne

	@Override
	public int setInsert(BoardDTO paramDto) {
		return sqlSession.insert("board.setInsert", paramDto);
	}//setInsert

	@Override
	public int setUpdate(BoardDTO paramDto) {
		return sqlSession.update("board.setInsert", paramDto);
	}//setUpdate

	@Override
	public void setUpdateHit(BoardDTO paramDto) {
		sqlSession.update("board.setUpdateHit", paramDto);
	}//setUpdateHit

	@Override
	public void setUpdateReLevel(BoardDTO paramDto) {
		sqlSession.update("board.setUpdateReLevel", paramDto);
	}//setUpdateReLevel

	@Override
	public int setDelete(BoardDTO paramDto) {
		return sqlSession.delete("board.setDelete", paramDto);
	}//setDelete
}//BoardDAOImpl
